/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Refanda Dicky P
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class ContohBtn extends JFrame implements ActionListener{
    private JLabel label1;
    private JButton btn1;
    private JButton btn2;
    
    public ContohBtn(){
        btn1 = new JButton("KIRI");
        btn1.addActionListener(this);
        btn2 = new JButton("KANAN");
        btn2.addActionListener(this);
        label1 = new JLabel("KOSONG");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        
        setLayout(new BorderLayout());
        add(btn1, "West");
        add(btn2, "East");
        add(label1, "North");
        
        setSize(300,300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btn1){
            label1.setText("KIRI");
        }
        if(e.getSource() == btn2){
            label1.setText("KANAN");
        }
    }
}

public class ContohTombol {
    public static void main(String[] args){
        new ContohBtn();
    }
}
