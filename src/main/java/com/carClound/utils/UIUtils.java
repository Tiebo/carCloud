package com.carClound.utils;

import com.carClound.dao.mapper.UserMapper;
import com.carClound.dao.pojo.User;
import com.carClound.dao.utils.DataProcess;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;
import java.util.Objects;

public class UIUtils {
    private static final UserMapper userMapper;

    static {
        userMapper = new UserMapper();
    }
    public static void init(JFrame jFrame, int[] p) {
        jFrame.setTitle("云柚汽车租赁系统");
        jFrame.setVisible(true);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(p[0], p[1], p[2], p[3]);
        jFrame.setResizable(false);
        jFrame.setIconImage(Constant.icon.getImage());
    }

    /**
     * 非管理员每个人只能查看自己的车辆租用者
     * @param id 根据Car中的user_id查询user
     * @return 返回***、无、租用者
     */
    public static String getUsername(Object id, User currentUser) {
        Integer userId = (Integer) id;
        User user = userMapper.getUserInfoById(userId);
        if (userId == 0) {
            return "无";
        }
        if (currentUser.getIsAdmin() == 0 && !Objects.equals(currentUser.getId(), userId)) {
            return "***";
        }
        return user.getName();
    }

    /**
     * 转换List<T>为 Object[][] 数据类型, 用于创建表格
     *
     * @return Object[][] rowData
     */
    public static <T> Object[][] setTableData(List<T> data, User user) {
        Object[][] rowData = new Object[0][];
        if (data.size() == 0) return rowData;
        try {
            // 获取实体类所有get方法
            List<Method> methods = DataProcess.getGetMethods(data.get(0).getClass());
            rowData = new Object[data.size()][5];
            for (int i = 0; i < data.size(); i++) {
                T t = data.get(i);
                // getVehicleId
                rowData[i][1] = methods.get(0).invoke(t);
                // getUserId
                rowData[i][0] = UIUtils.getUsername(methods.get(1).invoke(t), user);
                // getBrand
                rowData[i][2] = methods.get(2).invoke(t);
                // getType getSeat getTonnage
                rowData[i][3] = methods.get(3).invoke(t);
                // getPrice
                rowData[i][4] = methods.get(4).invoke(t);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rowData;
    }

    /**
     * 单元格渲染器，继承已实现渲染器接口的默认渲染器 DefaultTableCellRenderer
     */
    public static class CellRenderer extends DefaultTableCellRenderer {
        /**
         * 返回默认的表单元格渲染器，此方法在父类中已实现，直接调用父类方法返回，在返回前做相关参数的设置即可
         */
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            // 偶数行背景设置为白色，奇数行背景设置为灰色
            if (row % 2 != 0) {
                setBackground(new Color(69,73,74));
            } else {
                setBackground(new Color(79, 83, 84));
            }
            setHorizontalAlignment(JLabel.CENTER);
            // 调用父类的该方法完成渲染器的其他设置
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
}
