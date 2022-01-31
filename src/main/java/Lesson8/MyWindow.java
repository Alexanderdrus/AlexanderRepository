package Lesson8;

import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    private int value;
    private JLabel infoLabel;


    public MyWindow(){
        setBounds(800,500,300,150);
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 22);

        this.infoLabel = new JLabel();
        infoLabel.setBounds(91, 10, 150, 19);
        add(infoLabel);
        setLayout(null);

        JTextField label = new JTextField();
        label.setFont(font);
        label.setBounds(121, 40, 50, 32);
        add(label);

        JButton decrementButton10 = new JButton("<<");
        decrementButton10.setBounds(20, 40, 50, 32);
        add(decrementButton10);

        JButton decrementButton = new JButton("<");
        decrementButton.setBounds(71, 40, 50, 32);
        add(decrementButton);

        JButton incrementButton = new JButton(">");
        incrementButton.setBounds(171, 40, 50, 32);
        add(incrementButton);

        JButton incrementButton10 = new JButton(">>");
        incrementButton10.setBounds(221, 40, 50, 32);
        add(incrementButton10);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });
        decrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value=value-10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });
        incrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value=value+10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        setVisible(true);
    }
    private void validateRange() {
        if (Math.abs(value) > 10) {
            infoLabel.setText("Value out of range");
        } else {
            infoLabel.setText("");
        }
    }


    public static void main(String[] args) {
        new MyWindow();
    }
}
