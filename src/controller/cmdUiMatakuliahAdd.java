package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class cmdUiMatakuliahAdd implements ActionListener {
	
	private UiMatakuliahMaster umm;
	
	public cmdUiMatakuliahAdd(UiMatakuliahMaster umm) {
		this.umm = umm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		UiMatakuliahAdd uma = new UiMatakuliahAdd();
		uma.setVisible(true);
		umm.dispose();
	}

}
