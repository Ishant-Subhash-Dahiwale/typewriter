package com.mycompany.type.writer;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ubuntu
 */
public class typingPg {

//*******************************************************************************************************
    twstrings wrd;
    String str = "";
    int next = 0;
    JLabel space;
    JTextField t1;
    JLayeredPane lpane, wpane;

    public String genstr() {

        wrd = new twstrings();
        str = "";

        for (int ls = next; ls < next + 10; ls++) {
            str += wrd.getWords(ls) + " ";
        }
        next += 10;

        return str;
    }

//*******************************************************************************************************
    JPanel paneltwo, pa, panelfour, panelfive;
    JFrame frame;
    JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    String str1 = "", writ = "";
    JLabel wordLabel, cover, five;

    public typingPg() {

        frame = new JFrame();

        JPanel panelone = new JPanel();
        JPanel panelthree = new JPanel();
        panelthree.setBounds(10, 50, 1500, 50);

//*******************************************************************************************************
        str1 = this.genstr();
        wordLabel = new JLabel(str1);
        wordLabel.setFont(new Font("", Font.BOLD, 35));
        wordLabel.setForeground(Color.white);
        wordLabel.setBounds(0, 0, 1600, 50);

        wpane = new JLayeredPane();
        wpane.setBackground(Color.red);
        wpane.setFont(new Font("", Font.BOLD, 35));
        wpane.setForeground(Color.WHITE);
        wpane.add(wordLabel, Integer.valueOf(1));
        wpane.setOpaque(true);
        wpane.setBounds(100, 50, 1450, 50);

//        panelthree.add(wordLabel);
//        panelthree.setBackground(Color.GRAY);
//        frame.add(panelthree); 
        frame.add(wpane);

//*******************************************************************************************************
        pa = new JPanel();

        t1 = new JTextField();

        a = new JButton("a");
        b = new JButton("b");
        c = new JButton("c");
        d = new JButton("d");
        e = new JButton("e");
        f = new JButton("f");
        g = new JButton("g");
        h = new JButton("h");
        i = new JButton("i");
        j = new JButton("j");
        k = new JButton("k");
        l = new JButton("l");
        m = new JButton("m");
        n = new JButton("n");
        o = new JButton("o");
        p = new JButton("p");
        q = new JButton("q");
        r = new JButton("r");
        s = new JButton("s");
        t = new JButton("t");
        u = new JButton("u");
        v = new JButton("v");
        w = new JButton("w");
        x = new JButton("x");
        y = new JButton("y");
        z = new JButton("z");

//********************************************************************************************************
        panelone.add(t1);
        panelone.add(q);
        panelone.add(w);
        panelone.add(e);
        panelone.add(r);
        panelone.add(t);
        panelone.add(y);
        panelone.add(u);
        panelone.add(i);
        panelone.add(o);
        panelone.add(p);
        panelone.add(a);
        panelone.add(s);
        panelone.add(d);
        panelone.add(f);
        panelone.add(g);
        panelone.add(h);
        panelone.add(j);
        panelone.add(k);
        panelone.add(l);
        panelone.add(z);
        panelone.add(x);
        panelone.add(c);
        panelone.add(v);
        panelone.add(b);
        panelone.add(n);
        panelone.add(m);
        panelone.setBounds(100, 400, 1300, 350);
        panelone.setVisible(true);
        paneltwo = new JPanel();

//********************************************************************************************************
        JPanel panelfour = new JPanel();

        cover = new JLabel();
        cover.setBackground(Color.CYAN);
        cover.setBounds(100, 50, 1000, 50);

        panelfour.setBounds(100, 150, 1450, 5);
        panelfour.setBackground(Color.red);
        panelfour.add(cover);
        frame.add(panelfour);
//********************************************************************************************************
//        panelfive = new JPanel();
        five = new JLabel(writ);

//        panelfive.add(five);
//        five.setSize(1700, 40);
//        five.setLocation(0, 0);
        five.setFont(new Font("", Font.BOLD, 35));
        five.setForeground(Color.green);
        five.setBounds(0, 0, 1600, 50);

        lpane = new JLayeredPane();
        lpane.setBounds(100, 2, 1450, 50);

        lpane.setBackground(Color.yellow);
        lpane.setOpaque(true);
        lpane.setVisible(true);
        lpane.add(five, Integer.valueOf(2));

        frame.add(lpane);

//********************************************************************************************************
        space = new JLabel("--SPACE--");
        space.setFont(new Font("", Font.BOLD, 35));
        paneltwo.add(space);

        paneltwo.setBounds(100, 100, 250, 50);
//********************************************************************************************************

        frame.add(panelone);

        frame.add(paneltwo);
        frame.add(pa);
        keylis m = new keylis();
        t1.addKeyListener(m);

//********************************************************************************************************
        panelone.setLayout(new GridLayout(3, 8));
        frame.setBounds(200, 60, 1600, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public class keylis implements KeyListener {

        public void printed(KeyEvent mm) {

            writ = t1.getText().toString();
            String kl = writ + mm.getKeyChar();

            five.setText(kl);

        }

        public void check() {
            String typed = t1.getText().toString();
            int lentyped = typed.length();
            if (lentyped >= str.length()) {
                wordLabel.setText(genstr());
                t1.setText("");
                five.setText("");

            }

        }

        @Override
        public void keyTyped(KeyEvent ke) {

            System.out.println("hiii 1");

//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            printed(ke);
            check();
            switch (ke.getKeyCode()) {
                case KeyEvent.VK_A:
                    a.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_B:
                    b.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_C:
                    c.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_D:
                    d.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_E:
                    e.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_F:
                    f.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_G:
                    g.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_H:
                    h.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_I:
                    i.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_J:
                    j.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_K:
                    k.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_L:
                    l.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_M:
                    m.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_N:
                    n.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_O:
                    o.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_P:
                    p.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_Q:
                    q.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_R:
                    r.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_S:
                    s.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_T:
                    t.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_U:
                    u.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_V:
                    v.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_W:
                    w.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_X:
                    x.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_Y:
                    y.setBackground(Color.RED);

                    break;
                case KeyEvent.VK_Z:
                    z.setBackground(Color.RED);

                    break;

                case KeyEvent.VK_SPACE:

                    paneltwo.setBackground(Color.yellow);

                    break;

//                    throw new AssertionError();
            }
            System.out.println("hiii 2");

//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyReleased(KeyEvent ke) {

            check();
//             printed(ke);

            switch (ke.getKeyCode()) {
                case KeyEvent.VK_A:
                    a.setBackground(Color.white);

                    break;
                case KeyEvent.VK_B:
                    b.setBackground(Color.white);

                    break;

                case KeyEvent.VK_C:
                    c.setBackground(Color.white);

                    break;
                case KeyEvent.VK_D:
                    d.setBackground(Color.white);

                    break;

                case KeyEvent.VK_E:
                    e.setBackground(Color.white);

                    break;
                case KeyEvent.VK_F:
                    f.setBackground(Color.white);

                    break;

                case KeyEvent.VK_G:
                    g.setBackground(Color.white);

                    break;
                case KeyEvent.VK_H:
                    h.setBackground(Color.white);

                    break;

                case KeyEvent.VK_I:
                    i.setBackground(Color.white);

                    break;
                case KeyEvent.VK_J:
                    j.setBackground(Color.white);

                    break;

                case KeyEvent.VK_K:
                    k.setBackground(Color.white);

                    break;
                case KeyEvent.VK_L:
                    l.setBackground(Color.white);

                    break;

                case KeyEvent.VK_M:
                    m.setBackground(Color.white);

                    break;
                case KeyEvent.VK_N:
                    n.setBackground(Color.white);

                    break;

                case KeyEvent.VK_O:
                    o.setBackground(Color.white);

                    break;
                case KeyEvent.VK_P:
                    p.setBackground(Color.white);

                    break;

                case KeyEvent.VK_Q:
                    q.setBackground(Color.white);

                    break;
                case KeyEvent.VK_R:
                    r.setBackground(Color.white);

                    break;

                case KeyEvent.VK_S:
                    s.setBackground(Color.white);

                    break;
                case KeyEvent.VK_T:
                    t.setBackground(Color.white);

                    break;

                case KeyEvent.VK_U:
                    u.setBackground(Color.white);

                    break;
                case KeyEvent.VK_V:
                    v.setBackground(Color.white);

                    break;

                case KeyEvent.VK_W:
                    w.setBackground(Color.white);

                    break;
                case KeyEvent.VK_X:
                    x.setBackground(Color.white);

                    break;

                case KeyEvent.VK_Y:
                    y.setBackground(Color.white);

                    break;
                case KeyEvent.VK_Z:
                    z.setBackground(Color.white);

                    break;

                case KeyEvent.VK_SPACE:

                    paneltwo.setBackground(Color.white);

                    break;

//                    throw new AssertionError();
            }
            System.out.println("hiii 3");

//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }
}
