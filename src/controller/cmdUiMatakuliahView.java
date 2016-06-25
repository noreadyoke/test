package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class cmdUiMatakuliahView implements ActionListener {
	
	private UiMatakuliahMaster umm;
	
	public cmdUiMatakuliahView(UiMatakuliahMaster umm) {
		this.umm = umm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		UiMatakuliahView uma = new UiMatakuliahView();
		uma.setVisible(true);
		umm.dispose();

	}

}
