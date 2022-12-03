package com.carClound.ui.user;

import com.carClound.service.LoginService;
import com.carClound.service.impl.LoginImpl;

import javax.swing.*;
import java.awt.*;

public class LoginUI extends JFrame{
    private JPanel jPanel;
    public LoginUI() {
        // 创建 JPanel
        jPanel = new JPanel();
        setContentPane(jPanel);
        placeComponents();
    }
    private void placeComponents() {
        jPanel.setLayout(new BorderLayout());

        JLabel title = new JLabel("欢迎来到云柚汽车租赁系统~", JLabel.CENTER);
        title.setFont(new Font("", Font.BOLD, 36));
        jPanel.add(title, BorderLayout.NORTH);

        JPanel content = new JPanel(null);
        // 账号 密码
        JLabel account = new JLabel("账号：");
        account.setBounds(200, 80, 80, 50);
        JLabel password = new JLabel("密码：");
        password.setBounds(200, 180, 80, 50);
        JTextField inputAccount = new JTextField(30);
        inputAccount.setBounds(300, 80, 300, 50);
        JPasswordField inputPassword = new JPasswordField(30);
        inputPassword.setBounds(300, 180, 300, 50);
        // 确认 取消 按钮
        JButton login = new JButton("登录");
        JButton register = new JButton("注册");
        login.setBounds(500, 250, 100, 50);
        register.setBounds(380, 250, 100, 50);
        // 监听器 -> 绑定登录接口
        login.addActionListener((e) -> {
            String ac = inputAccount.getText();
            String ps = String.valueOf(inputPassword.getPassword());
            // 面向接口编程 调用login方法
            LoginService loginService = new LoginImpl();
            String res = loginService.login(ac, ps);
            if ("success".equals(res)) {
                dispose();
            }
        });
        // 监听器 -> 绑定注册接口
        register.addActionListener((e)-> {
            new RegisterUI();
        });
        // 将组件加到 jPanel 中
        content.add(account);
        content.add(password);
        content.add(inputAccount);
        content.add(inputPassword);
        content.add(login);
        content.add(register);
        jPanel.add(content, BorderLayout.CENTER);
    }
}
