package view;

import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

import controller.*;

public class UiMatakuliahMaster extends JFrame {
	public UiMatakuliahMaster() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setTitle("#Ui_Matakuliah_Master_//copyRight_muhammadAmmar");
		Point c = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int wW = 325;
	    int wH = 160;
	    setBounds(c.x - wW / 2, c.y - wH / 2, wW,wH);
	    
	    JButton cmdUiMatakuliahView = new JButton("View Matakuliah");
	    cmdUiMatakuliahView.setBounds(10, 10, 300, 30);
	    add(cmdUiMatakuliahView);

	    JButton cmdUiMatakuliahAdd = new JButton("Add Matakuliah");
	    cmdUiMatakuliahAdd.setBounds(10, 50, 300, 30);
	    add(cmdUiMatakuliahAdd);
	    
	    JButton cmdUiMainFrameView = new JButton("Back Main Frame");
	    cmdUiMainFrameView.setBounds(10, 90, 300, 30);
	    add(cmdUiMainFrameView);
	    
	    cmdUiMatakuliahView.addActionListener(new cmdUiMatakuliahView(this));
	    cmdUiMatakuliahAdd.addActionListener(new cmdUiMatakuliahAdd(this));
	    cmdUiMainFrameView.addActionListener(new cmdUiMainFrameView(this));

	    setLayout(null);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
