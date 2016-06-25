package view;

import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

import controller.*;

public class UiMainFrameView extends JFrame {
	public UiMainFrameView() {
		String ngasal;
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setTitle("#Ui_MainFrame_View_//copyRight_muhammadAmmar");
		Point c = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
	    int wW = 325;
	    int wH = 160;
	    setBounds(c.x - wW / 2, c.y - wH / 2, wW,wH);
	    
	    JButton cmdUiMatakuliahMaster = new JButton("Master Menu Matakuliah");
	    cmdUiMatakuliahMaster.setBounds(10, 10, 300, 30);
	    add(cmdUiMatakuliahMaster);
	    
	    JButton cmdUiDosenMaster = new JButton("Master Menu Dosen");
	    cmdUiDosenMaster.setBounds(10, 50, 300, 30);
	    add(cmdUiDosenMaster);
	    
	    JButton cmdUiMahasiswaMaster = new JButton("Master Menu Mahasiswa");
	    cmdUiMahasiswaMaster.setBounds(10, 90, 300, 30);
	    add(cmdUiMahasiswaMaster);
	    
	    cmdUiMatakuliahMaster.addActionListener(new cmdUiMatakuliahMaster(this));
	    
	    setLayout(null);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
