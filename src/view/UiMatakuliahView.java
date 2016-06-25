package view;

import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.*;

import controller.*;


public class UiMatakuliahView extends JFrame {
	public UiMatakuliahView() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		setTitle("#Ui_Matakuliah_View_//copyRight_muhammadAmmar");
		Point c = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int wW = 900;
	    int wH = 500;
	    setBounds(c.x - wW / 2, c.y - wH / 2, wW,wH);
	    
	    int x1, x2, x3, x4, x5, x6;
	    x1 = 30;
	    x2 = 10;
	    x3 = 175;
	    x4 = 700;
	    x5 = 0;
	    x6 = 5;
	    String[] labelname = {"Cari", "Tambah Data", "Back Matakuliah Master"}; 
	    
	    x2 = 10+x6;
	    x5 = 0;
	    
	    JLabel label = new JLabel(labelname[x5]);
	    label.setBounds(10, x2, x3, x1);
	    add(label);
	    
	    JLabel labelbatas = new JLabel(":");
	    labelbatas.setBounds(x3, x2, 10, x1);
	    add(labelbatas);
	    
	    JTextField text = new JTextField("");
	    text.setHorizontalAlignment(JTextField.CENTER);
	    text.setBounds(x3+10, x2, x4, x1);
	    add(text);
	    
	    x2 = 50+x6;
	    x5 = 1;
	    
	    JButton cmd_addMatakuliah = new JButton(labelname[x5]);
	    cmd_addMatakuliah.setBounds(10, x2, x3, x1);
	    add(cmd_addMatakuliah);
	    
	    x2 = 90+x6;
	    x5 = 2;
	    
	    JButton cmd_backMatakuliah = new JButton(labelname[x5]);
	    cmd_backMatakuliah.setBounds(10, x2, x3, x1);
	    add(cmd_backMatakuliah);
	    
	    cmd_backMatakuliahActionListener actionEvent = new cmd_backMatakuliahActionListener(null, this);
	    cmd_backMatakuliah.addActionListener(actionEvent);
	    cmd_backMatakuliah.setActionCommand("back 1");
	    //cmd_addMatakuliah.addActionListener(new cmd_addMatakuliah(this));
	    
	    setLayout(null);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
