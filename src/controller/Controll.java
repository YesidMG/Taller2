package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import model.Logic;
import view.MyFrame;

public class Controll implements ActionListener {
	private MyFrame frame;
	private Logic logic;

	public Controll() {
		frame = new MyFrame(this);
		logic= new Logic();

	}
	@Override
	public void actionPerformed(ActionEvent event) {
		String source = event.getActionCommand();

		try {
		switch (source) {
		case "agree": {	
			logic.newProduct(frame.newProduct());
			frame.showList(logic.showList(),logic.total());
			frame.updateDeleteLis(logic.getShoppingCart());
			break;
		}
		case "delete": {	
			frame.amounnotvalid(logic.removeElements(frame.deletProduct()));
			frame.showList(logic.showList(),logic.total());
			frame.updateDeleteLis(logic.getShoppingCart());
			
			break;
		}
		}}catch (Exception e) {
		}
	}
	public static void main(String[] args) {
		new Controll();

	}

}
