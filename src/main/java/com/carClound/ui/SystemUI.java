package com.carClound.ui;

import com.carClound.dao.pojo.Bus;
import com.carClound.dao.pojo.Car;
import com.carClound.dao.pojo.Truck;
import com.carClound.dao.pojo.User;
import com.carClound.service.DeleteUserService;
import com.carClound.service.impl.DeleteUserImpl;
import com.carClound.ui.admin.AdminUI;
import com.carClound.ui.user.*;
import com.carClound.utils.CheckUtils;
import com.carClound.utils.Constant;
import com.carClound.utils.UIUtils;
import com.carClound.vo.SystemException;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.List;

/**
 * 主页面
 */
public class SystemUI {
	private static JFrame jFrame;
	private static JPanel mainPanel;
	private static JTable carTable;
	private static JTable busTable;
	private static JTable truckTable;
	private static JPanel menu;
	private static DefaultTableModel CarTableModel;
	private static DefaultTableModel BusTableModel;
	private static DefaultTableModel TruckTableModel;
	private static JTabbedPane tabbedPane;
	private static JLabel name;
	private static JLabel gender;
	private static JLabel account;
	private static JLabel balance;
	private static User user = null;
	private static final String[] CarColumnNames = {"租用者", "车牌号", "品牌", "类型", "每日租金"};
	private static final String[] BusColumnNames = {"租用者", "车牌号", "品牌", "每日租金", "座位数"};
	private static final String[] TruckColumnNames = {"租用者", "车牌号", "品牌", "吨位", "每日租金"};
	public static List<Car> cars;
	public static List<Bus> buses;
	public static List<Truck> trucks;

	public SystemUI(User user) {
		// 获取当前登录用户
		SystemUI.user = user;
		// 初始化
		jFrame = new JFrame();
		UIUtils.init(jFrame, new int[]{600, 200, 1500, 900});
		// 创建主页面
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout(10, 10));
		// 安置组件
		placeComponents();
		// 设置加入主界面到窗口
		jFrame.setContentPane(mainPanel);
		// 多线程检测租车是否到期
		Thread thread = new Thread(new CheckUtils(user));
		thread.start();
	}

	private void placeComponents() {
		// 放置表格
		placeTable();
		// 创建选项卡 (轿车 卡车 货车)
		placeTab();
		// 创建菜单栏
		placeMenu();
		// 界面布局
		mainPanel.add(tabbedPane, BorderLayout.CENTER);
		mainPanel.add(menu, BorderLayout.WEST);
	}

	private void placeTab() {
		tabbedPane = new JTabbedPane();
		tabbedPane.setFont(new Font("楷体", Font.PLAIN, 32));

		JPanel carPanel = new JPanel();
		JPanel busPanel = new JPanel();
		JPanel truckPanel = new JPanel();
		// Car
		JScrollPane carScroll = new JScrollPane(carTable);
		carPanel.setLayout(new BorderLayout());
		carPanel.add(carTable.getTableHeader(), BorderLayout.NORTH);
		carPanel.add(carScroll, BorderLayout.CENTER);
		// Bus
		JScrollPane busScroll = new JScrollPane(busTable);
		busPanel.setLayout(new BorderLayout());
		busPanel.add(busTable.getTableHeader(), BorderLayout.NORTH);
		busPanel.add(busScroll, BorderLayout.CENTER);
		// Truck
		JScrollPane truckScroll = new JScrollPane(truckTable);
		truckPanel.setLayout(new BorderLayout());
		truckPanel.add(truckTable.getTableHeader(), BorderLayout.NORTH);
		truckPanel.add(truckScroll, BorderLayout.CENTER);

		tabbedPane.addTab("轿车", carPanel);
		tabbedPane.addTab("卡车", busPanel);
		tabbedPane.addTab("货车", truckPanel);
	}

	private static void placeMenu() {
		menu = new JPanel(new GridLayout(2, 5, 10, 10));

		// 添加用户信息
		JPanel left = new JPanel(null);
		name = new JLabel("用户名：" + user.getName());
		gender = new JLabel("性别：" + user.getGender());
		account = new JLabel("账号：" + user.getAccount());
		balance = new JLabel("余额：" + user.getBalance());
		name.setBounds(100, 60, 200, 50);
		gender.setBounds(100, 130, 200, 50);
		account.setBounds(100, 200, 200, 50);
		balance.setBounds(100, 270, 200, 50);


		JPanel right = new JPanel(new GridLayout(5, 1, 5, 10));
		// 添加功能菜单栏
		JButton admin = new JButton("管理员功能");
		admin.setBounds(0, 0, 100, 100);
		JButton exit = new JButton("退出登录");
		JButton rent = new JButton("租用车辆");
		JButton back = new JButton("归还车辆");
		JButton freeCar = new JButton("可租车辆");
		JButton myCar = new JButton("我的租车情况");
		JButton logout = new JButton("注销账户");
		JButton allCar = new JButton("查看全部车辆");
		JButton updateUser = new JButton("修改用户信息");
		JButton recharge = new JButton("账户充值");

		updateUser.addActionListener(e -> {
			new UpdateUserUI(user);
		});

		recharge.addActionListener(e -> {
			new RechargeUI(user);
		});
		// 租车
		rent.addActionListener(e -> {
			new RentUI(user);
		});
		back.addActionListener(e -> {
			new ReturnUI(user);
		});
		// 查看全部车辆租车情况
		allCar.addActionListener(e -> {
			cars = Constant.carMapper.getCarList();
			buses = Constant.busMapper.getBusList();
			trucks = Constant.truckMapper.getTruckList();

			refreshInfo();
		});

		// 查看当前可租车辆
		freeCar.addActionListener(e -> {
			// 去除所有已被租的车辆
			cars = Constant.carMapper.getCarList();
			buses = Constant.busMapper.getBusList();
			trucks = Constant.truckMapper.getTruckList();

			cars.removeIf(car -> car.getUserId() != 0);
			buses.removeIf(bus -> bus.getUserId() != 0);
			trucks.removeIf(truck -> truck.getUserId() != 0);
			refreshInfo();
		});

		// 打开编辑界面
		admin.addActionListener(e -> {
			if (user.getIsAdmin() == 1) {
				new AdminUI(user);
			} else {
				throw new SystemException("只能管理员操作");
			}
		});

		// 查看自己的租车情况
		myCar.addActionListener(e -> {
			cars = Constant.carMapper.getCarByUserId(user.getId());
			buses = Constant.busMapper.getBusByUserId(user.getId());
			trucks = Constant.truckMapper.getTruckByUserId(user.getId());
			refreshInfo();
		});

		// 注销账户
		logout.addActionListener(e -> {
			int i = JOptionPane.showConfirmDialog(jFrame, "您确定要注销账户么", "warning", JOptionPane.OK_CANCEL_OPTION);
			if (i == 0) {
				DeleteUserService deleteUserService = new DeleteUserImpl();
				deleteUserService.deleteUser(user.getId());
				LoginUI loginUI = new LoginUI();
				UIUtils.init(loginUI, new int[]{800, 400, 800, 500});
			}
		});

		// 退出登录
		exit.addActionListener((e) -> {
			int i = JOptionPane.showConfirmDialog(jFrame, "您确定要退出登录么", "warning", JOptionPane.OK_CANCEL_OPTION);
			if (i == 0) {
				LoginUI loginUI = new LoginUI();
				UIUtils.init(loginUI, new int[]{800, 400, 800, 500});
				jFrame.dispose();
			}
		});


		left.add(name);
		left.add(gender);
		left.add(account);
		left.add(balance);

		right.add(rent);
		right.add(back);
		right.add(allCar);
		right.add(freeCar);
		right.add(myCar);
		right.add(updateUser);
		right.add(recharge);
		right.add(admin);
		right.add(exit);
		right.add(logout);

		menu.add(left);
		menu.add(right);
	}

	private void placeTable() {
		// 设置表格数据
		cars = Constant.carMapper.getCarList();
		buses = Constant.busMapper.getBusList();
		trucks = Constant.truckMapper.getTruckList();
		// 创建表格
		CarTableModel = new DefaultTableModel(UIUtils.setTableData(cars, user), CarColumnNames);
		BusTableModel = new DefaultTableModel(UIUtils.setTableData(buses, user), BusColumnNames);
		TruckTableModel = new DefaultTableModel(UIUtils.setTableData(trucks, user), TruckColumnNames);
		carTable = new JTable(CarTableModel);
		busTable = new JTable(BusTableModel);
		truckTable = new JTable(TruckTableModel);

		refreshInfo();
	}

	/**
	 * 设置表格属性
	 *
	 * @param tableModel  表格模型
	 * @param jTable      表格
	 * @param columnNames 表头
	 */
	private static void setTable(TableModel tableModel, JTable jTable, String[] columnNames) {
		// 创建单元格渲染器
		UIUtils.CellRenderer renderer = new UIUtils.CellRenderer();
		// 遍历表格的每一列，分别给每一列设置单元格渲染器
		for (String columnName : columnNames) {
			// 根据 列名 获取 表格列
			TableColumn tableColumn = jTable.getColumn(columnName);
			// 设置 表格列 的 单元格渲染器
			tableColumn.setCellRenderer(renderer);
		}
		// 设置滚动条
		jTable.setPreferredScrollableViewportSize(new Dimension());
		// 设置表格数据居中显示
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(JLabel.CENTER);

		jTable.setDefaultRenderer(Object.class, tcr);

		jTable.setEnabled(false);

		jTable.setFont(new Font("楷体", Font.PLAIN, 24));

		jTable.setShowHorizontalLines(true);

		jTable.setShowVerticalLines(true);
	}


	public static void refreshInfo() {
		CarTableModel.setDataVector(UIUtils.setTableData(cars, user), CarColumnNames);
		BusTableModel.setDataVector(UIUtils.setTableData(buses, user), BusColumnNames);
		TruckTableModel.setDataVector(UIUtils.setTableData(trucks, user), TruckColumnNames);

		// 设置表格属性
		setTable(CarTableModel, carTable, CarColumnNames);
		setTable(BusTableModel, busTable, BusColumnNames);
		setTable(TruckTableModel, truckTable, TruckColumnNames);
	}

	public static void refreshUser() {
		user = Constant.userMapper.getUserInfoById(user.getId());
		name.setText("用户名：" + user.getName());
		gender.setText("性别：" + user.getGender());
		account.setText("账号：" + user.getAccount());
		balance.setText("余额：" + user.getBalance());
	}

	public static void closeView() {
		jFrame.dispose();
	}
}
