/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.type.writer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ubuntu
 */
public class splash implements ActionListener {

    JButton start;
    typingPg nxtpPg;

    public splash() {
        JFrame f = new JFrame();

        JLabel head = new JLabel("type-writer\n");
        head.setVisible(true);

//        head.setVerticalTextPosition(0x0);
        head.setOpaque(true);
        head.setFont(new Font("", Font.PLAIN, 45));
        head.setBackground(new Color(56, 22, 55));
        head.setForeground(Color.white);
        head.setSize(100, 100);
//        head.setAlignmentX(120);

        JPanel panelone = new JPanel();
        panelone.add(head);
        panelone.setBackground(new Color(56, 22, 55));
        panelone.setBounds(500, 100, 500, 100);

//        ********************************************************************************
        start = new JButton("Start Typing!!");
        start.setBounds(625, 350, 200, 150);
//        start.setSize(100, 100);
        start.setBackground(Color.WHITE);
        start.setFocusable(false);

        start.addActionListener((ae) -> {
            f.dispose();
            nxtpPg = new typingPg();

        });

        JPanel paneltwo = new JPanel();
        paneltwo.add(start);

        paneltwo.setBackground(new Color(56, 22, 55));
        paneltwo.setBounds(650, 250, 150, 150);

//        ********************************************************************************
        JPanel panelthree = new JPanel();

        panelthree.setBackground(new Color(56, 22, 55));
//        ********************************************************************************

        f.add(start);

        f.add(panelone);
        f.add(panelthree);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.getContentPane().setBackground(new Color(56, 22, 55));
        f.setVisible(true);
        f.setBounds(200, 100, 1500, 900);
        typingPg nxtpPg;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

}
