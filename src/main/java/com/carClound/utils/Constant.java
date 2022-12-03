package com.carClound.utils;

import com.carClound.dao.mapper.*;

import javax.swing.*;
import java.awt.*;

/**
 * 定义了一些常用的常量
 */
public class Constant {
	public final static Font KAI_TI = new Font("楷体", Font.PLAIN, 24);

	public final static UserMapper userMapper = new UserMapper();
	public final static CarMapper carMapper = new CarMapper();
	public final static BusMapper busMapper = new BusMapper();
	public final static TruckMapper truckMapper = new TruckMapper();
	public final static IncomeMapper incomeMapper = new IncomeMapper();
	public final static ImageIcon icon = new ImageIcon("src/main/java/com/carClound/img/logo.png");

	/**
	 * 	一天的时间戳
 	 */
	public final static long ONE_DAY = 86400000;
}
