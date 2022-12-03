package com.carClound.vo;

import javax.swing.*;

public class SystemException extends RuntimeException{
    public SystemException(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, msg);
    }
}
