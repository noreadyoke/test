package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class cmdUiMatakuliahMaster implements ActionListener{
	
	private UiMainFrameView umfv;
	
	public cmdUiMatakuliahMaster(UiMainFrameView umfv) {
		this.umfv = umfv;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		UiMatakuliahMaster umm = new UiMatakuliahMaster();
		umm.setVisible(true);
		umfv.dispose();
	}
	
}
