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

class ComboBoxHandling extends JFrame
        implements ItemListener {

    private String status[] = {"Setuju", "Batal"};
    private JTextField teks;
    private JComboBox cbStatus;

    public ComboBoxHandling() {
        super("Coba ComboBox Handling");
        
        teks = new JTextField("Status: None");
        teks.setHorizontalAlignment(SwingConstants.CENTER);
        cbStatus = new JComboBox(status);
        cbStatus.addItemListener(this);
        
        setLayout(new BorderLayout());
        add(teks, "North");
        add(cbStatus, "South");
        pack();
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent event) {
        if (event.getStateChange() == ItemEvent.SELECTED) {
            if (cbStatus.getSelectedIndex() == 0) {
                teks.setText("Setuju");
            } else if (cbStatus.getSelectedIndex() == 1) {
                teks.setText("batal");
            }
        }
    }
}

public class EventComboBox {

    public static void main(String[] args) {
        new ComboBoxHandling();
    }
}
