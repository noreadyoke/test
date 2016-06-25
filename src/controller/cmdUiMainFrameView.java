package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class cmdUiMainFrameView implements ActionListener {
	
	private UiMatakuliahMaster umm;
	
	public cmdUiMainFrameView(UiMatakuliahMaster umm) {
		this.umm = umm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		UiMainFrameView umfv = new UiMainFrameView();
		umfv.setVisible(true);
		umm.dispose();
	}

}
