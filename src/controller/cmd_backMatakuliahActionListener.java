package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class cmd_backMatakuliahActionListener implements ActionListener {
	
	private UiMatakuliahAdd uma;
	private UiMatakuliahView uview;
	
	public cmd_backMatakuliahActionListener(UiMatakuliahAdd uma, UiMatakuliahView uview) {
		// TODO Auto-generated constructor stub
		this.uma = uma;
		this.uview = uview;
	}
	/*
	@Override
	public void actionPerformed(ActionEvent arg0) {
		UiMatakuliahMaster umm = new UiMatakuliahMaster();
		umm.setVisible(true);
		uma.dispose();
	}
	*/

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		UiMatakuliahMaster umm = new UiMatakuliahMaster();
		umm.setVisible(true);
		String action = e.getActionCommand();
		switch(action){
		case "back 1":
			uview.dispose();
			break;
		case "back 2":
			uma.dispose();
			break;
		}
		
	}

}
