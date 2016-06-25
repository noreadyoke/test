package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.UiMatakuliahAdd;
import view.UiMatakuliahMaster;
import view.UiMatakuliahView;

public class cmd_addMatakuliah implements ActionListener {
	
	private UiMatakuliahAdd uma;
	
	public cmd_addMatakuliah(UiMatakuliahAdd uma) {
		this.uma = uma;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		UiMatakuliahView umv = new UiMatakuliahView();
		umv.setVisible(true);
		uma.dispose();
	}

}
