package view;

import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.*;

import controller.*;

public class UiMatakuliahAdd extends JFrame{
	public UiMatakuliahAdd() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		setTitle("#Ui_Matakuliah_Add_//copyRight_muhammadAmmar");
		Point c = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int wW = 500;
	    int wH = 250;
	    setBounds(c.x - wW / 2, c.y - wH / 2, wW,wH);
	    
	    int x1, x2, x3, x4, x5, x6;
	    x1 = 30;
	    x2 = 10;
	    x3 = 175;
	    x4 = 300;
	    x5 = 0;
	    x6 = 5;
	    String[] labelname = {"NIM", "Nama Lengkap", "No. Tlp", "E-Mail", "Back Matakuliah Master", "Tambah Data"}; 
	    
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
	    
	    JLabel label1 = new JLabel(labelname[x5]);
	    label1.setBounds(10, x2, x3, x1);
	    add(label1);
	    
	    JLabel labelbatas1 = new JLabel(":");
	    labelbatas1.setBounds(x3, x2, 10, x1);
	    add(labelbatas1);
	    
	    JTextField text1 = new JTextField("");
	    text1.setHorizontalAlignment(JTextField.CENTER);
	    text1.setBounds(x3+10, x2, x4, x1);
	    add(text1);
	    
	    x2 = 90+x6;
	    x5 = 2;
	    
	    JLabel label2 = new JLabel(labelname[x5]);
	    label2.setBounds(10, x2, x3, x1);
	    add(label2);
	    
	    JLabel labelbatas2 = new JLabel(":");
	    labelbatas2.setBounds(x3, x2, 10, x1);
	    add(labelbatas2);
	    
	    JTextField text2 = new JTextField("");
	    text2.setHorizontalAlignment(JTextField.CENTER);
	    text2.setBounds(x3+10, x2, x4, x1);
	    add(text2);
	    
	    x2 = 130+x6;
	    x5 = 3;
	    
	    JLabel label3 = new JLabel(labelname[x5]);
	    label3.setBounds(10, x2, x3, x1);
	    add(label3);
	    
	    JLabel labelbatas3 = new JLabel(":");
	    labelbatas3.setBounds(x3, x2, 10, x1);
	    add(labelbatas3);
	    
	    JTextField text3 = new JTextField("");
	    text3.setHorizontalAlignment(JTextField.CENTER);
	    text3.setBounds(x3+10, x2, x4, x1);
	    add(text3);
	    
	    x2 = 170+x6;
	    x5 = 4;
	    
	    JButton cmd_backMatakuliah = new JButton(labelname[x5]);
	    cmd_backMatakuliah.setBounds(10, x2, x3, x1);
	    add(cmd_backMatakuliah);
	    
	    x5 = 5;
	    
	    JButton cmd_addMatakuliah = new JButton(labelname[x5]);
	    cmd_addMatakuliah.setBounds(x3+10, x2, x4, x1);
	    add(cmd_addMatakuliah);
	    
	    cmd_backMatakuliahActionListener actionEvent = new cmd_backMatakuliahActionListener(this, null);
	    cmd_backMatakuliah.addActionListener(actionEvent);
	    cmd_backMatakuliah.setActionCommand("back 2");
	 
	    
	    setLayout(null);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
