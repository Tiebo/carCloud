package com.carClound.ui.admin;

import com.carClound.dao.pojo.Income;
import com.carClound.dao.pojo.User;
import com.carClound.utils.Constant;
import com.carClound.utils.UIUtils;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.List;

/**
 * 主页面
 */
public class IncomeUI {
	private static JFrame jFrame;
	private static JPanel mainPanel;
	private static JTable carTable;
	private static JPanel menu;
	private static DefaultTableModel CarTableModel;
	private static JTabbedPane tabbedPane;
	private static JLabel name;
	private static JLabel gender;
	private static JLabel account;
	private static JLabel balance;
	private static User user = null;
	private static final String[] ColumnNames = {"编号", "车牌号", "租用者", "租期", "租金", "租用时间"};
	public static List<Income> incomes;

	public IncomeUI(User user) {
		// 获取当前登录用户
		IncomeUI.user = user;
		// 初始化
		jFrame = new JFrame();
		UIUtils.init(jFrame, new int[]{800, 400, 1500, 900});
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 创建主页面
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout(10, 10));
		// 安置组件
		placeComponents();
		// 设置加入主界面到窗口
		jFrame.setContentPane(mainPanel);
	}

	private void placeComponents() {
		// 放置表格
		placeTable();
		// 创建选项卡
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

		JPanel income = new JPanel();
		// Car
		JScrollPane incomePanel = new JScrollPane(carTable);
		income.setLayout(new BorderLayout());
		income.add(carTable.getTableHeader(), BorderLayout.NORTH);
		income.add(incomePanel, BorderLayout.CENTER);


		tabbedPane.addTab("营业流水", income);
	}

	private static void placeMenu() {
		menu = new JPanel(new GridLayout(2, 5, 10, 10));

		JPanel right = new JPanel(new GridLayout(5, 1, 5, 10));

		menu.add(right);
	}

	private void placeTable() {
		// 设置表格数据
		incomes = Constant.incomeMapper.getIncomeList();
		// 创建表格
		CarTableModel = new DefaultTableModel(setTableData(incomes), ColumnNames);
		carTable = new JTable(CarTableModel);

		refreshInfo();
	}

	/**
	 * 设置表格属性
	 *
	 * @param tableModel 表格模型
	 * @param jTable     表格
	 */
	private static void setTable(TableModel tableModel, JTable jTable) {
		// 设置排序
		RowSorter<TableModel> rowSorter = new TableRowSorter<>(tableModel);
		jTable.setRowSorter(rowSorter);
		// 创建单元格渲染器
		UIUtils.CellRenderer renderer = new UIUtils.CellRenderer();
		// 遍历表格的每一列，分别给每一列设置单元格渲染器
		for (String columnName : IncomeUI.ColumnNames) {
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
		CarTableModel.setDataVector(setTableData(incomes), ColumnNames);
		// 设置表格属性
		setTable(CarTableModel, carTable);
	}

	public static Object[][] setTableData(List<Income> data) {
		Object[][] rowData = new Object[0][];
		if (data.size() == 0) return rowData;
		try {
			rowData = new Object[data.size()][6];
			for (int i = 0; i < data.size(); i++) {
				rowData[i][0] = data.get(i).getId();
				rowData[i][1] = data.get(i).getVehicleId();
				rowData[i][2] = Constant.userMapper.getUserInfoById(data.get(i).getUserId()).getName();
				rowData[i][3] = data.get(i).getDays() + "天";
				rowData[i][4] = data.get(i).getAmount();
				rowData[i][5] = data.get(i).getTime();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return rowData;
	}

	public static void closeView() {
		jFrame.dispose();
	}
}
