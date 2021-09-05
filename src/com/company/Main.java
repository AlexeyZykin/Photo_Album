package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        FieldWindow window = new FieldWindow("Photo Album");
        window.setVisible(true);
        //window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1280, 800);

    }
}
