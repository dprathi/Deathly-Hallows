package Musafir;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import Classes.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.jdesktop.swingx.JXDatePicker;

public class CancelTrainAdmin extends JFrame implements ActionListener {

    JLabel headLabel, pnrLabel, infoLabel, startDate, endDate, trainNo;
    JPanel p1, p2, panel, startDatePanel, endDatePanel;
    JButton back, submit;
    JTextField pnrText, tf1;

    public CancelTrainAdmin() {

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("ADMIN HOME PAGE");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w * 2.5 + "s", pad);
        setTitle(pad + "CANCEL TRAIN");

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.BLACK);
        p1.setBounds(0, 0, 750, 45);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Musafir/icons/backArrow.png"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        back = new JButton(i3);
        back.setBackground(Color.BLACK);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        back.setBorder(emptyBorder);
        back.setBounds(5, 8, 30, 30);
        p1.add(back);

        headLabel = new JLabel("CANCEL TRAIN");
        headLabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
        headLabel.setForeground(Color.WHITE);
        headLabel.setBounds(250, 10, 400, 30);
        p1.add(headLabel);

        infoLabel = new JLabel("Fill Following Information");
        infoLabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 27));
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setBounds(220, 90, 400, 30);
        add(infoLabel);

        trainNo = new JLabel("Train No:");
        trainNo.setFont(new Font("Times new roman", Font.BOLD, 20));
        trainNo.setBounds(200, 180, 150, 32);
        add(trainNo);

        tf1 = new JTextField(7);
        tf1.setFont(new Font("Times new roman", Font.BOLD, 14));
        tf1.setBounds(300, 180, 150, 30);
        add(tf1);

        startDate = new JLabel("From:");
        startDate.setFont(new Font("Times new roman", Font.BOLD, 20));
        startDate.setBounds(70, 250, 200, 32);
        add(startDate);

        startDatePanel = new JPanel();
        JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        startDatePanel.setBackground(Color.white);
        startDatePanel.setBounds(40, 290, 150, 30);
        startDatePanel.add(picker);
        add(startDatePanel);

        endDate = new JLabel("To:");
        endDate.setFont(new Font("Times new roman", Font.BOLD, 20));
        endDate.setBounds(500, 250, 200, 32);
        add(endDate);

        endDatePanel = new JPanel();
        JXDatePicker picker1 = new JXDatePicker();
        picker1.setDate(Calendar.getInstance().getTime());
        picker1.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        endDatePanel.setBackground(Color.white);
        endDatePanel.setBounds(470, 290, 150, 30);
        endDatePanel.add(picker1);
        add(endDatePanel);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        submit.setForeground(Color.WHITE);
        submit.setBorder(emptyBorder);
        submit.setBounds(300, 500, 100, 30);
        add(submit);

        back.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        setSize(750, 750);
        setLocation(400, 50);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CancelTrainAdmin().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {

            if (ae.getSource() == back) {
                new AdminHome().setVisible(true);
                setVisible(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}