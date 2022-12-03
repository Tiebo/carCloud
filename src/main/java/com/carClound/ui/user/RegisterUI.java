package com.carClound.ui.user;

import com.carClound.service.RegisterService;
import com.carClound.service.impl.RegisterImpl;
import com.carClound.utils.UIUtils;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RegisterUI {
    private static JPanel jPanel;
    private static JFrame jFrame;

    public RegisterUI() {
        jFrame = new JFrame();
        UIUtils.init(jFrame, new int[]{900, 500, 800, 600});
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 创建 JPanel
        jPanel = new JPanel();
        jFrame.add(jPanel);
        placeComponents();
    }

    private void placeComponents() {
        jPanel.setVisible(true);
        jPanel.setLayout(new BorderLayout());

        JLabel title = new JLabel("注册", JLabel.CENTER);
        title.setFont(new Font("", Font.BOLD, 36));
        jPanel.add(title, BorderLayout.NORTH);

        JPanel content = new JPanel();
        content.setLayout(null);
        // 账号 密码
        JLabel account = new JLabel("账号：");
        account.setBounds(200, 80, 80, 50);
        JLabel password = new JLabel("密码：");
        password.setBounds(200, 180, 80, 50);
        JLabel confirmPassword = new JLabel("确认密码：");
        confirmPassword.setBounds(200, 280, 100, 50);

        JTextField inputAccount = new JTextField(30);
        inputAccount.setBounds(300, 80, 300, 50);
        JPasswordField inputPassword = new JPasswordField(30);
        inputPassword.setBounds(300, 180, 300, 50);
        JPasswordField inputConfirmPassword = new JPasswordField(30);
        inputConfirmPassword.setBounds(300, 280, 300, 50);
        // 确认
        JButton confirm = new JButton("确认");
        confirm.setBounds(500, 350, 100, 50);

        // 监听器 -> 绑定登录接口
        confirm.addActionListener((e) -> {
            String ac = inputAccount.getText();
            String ps = String.valueOf(inputPassword.getPassword());
            String conPs = String.valueOf(inputConfirmPassword.getPassword());
            // 面向接口编程
            RegisterService register = new RegisterImpl();
            Map<String, String> data = new HashMap<>();
            data.put("account", ac);
            data.put("password", ps);
            data.put("confirmPassword", conPs);
            register.register(data);
        });
        // 将组件加到 jPanel 中
        content.add(account);
        content.add(password);
        content.add(confirmPassword);
        content.add(inputAccount);
        content.add(inputPassword);
        content.add(inputConfirmPassword);
        content.add(confirm);
        jPanel.add(content, BorderLayout.CENTER);
    }

    public static void closeUI() {
        RegisterUI.jFrame.dispose();
    }
}
