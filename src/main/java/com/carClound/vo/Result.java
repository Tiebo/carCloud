package com.carClound.vo;

import javax.swing.*;

public class Result {
    public static void success(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static int confirmDialog(String msg) {
        return JOptionPane.showConfirmDialog(null, msg);
    }
}
