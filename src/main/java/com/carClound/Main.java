package com.carClound;

import com.carClound.ui.user.LoginUI;
import com.carClound.utils.UIUtils;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        // 暗色调
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "加载错误", "界面加载失败", JOptionPane.ERROR_MESSAGE);
            exit(0);
        }
        LoginUI loginUI = new LoginUI();
        UIUtils.init(loginUI, new int[]{800, 400, 800, 500});

    }
}