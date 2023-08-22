package view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import model.Product;


public class MyFrame extends JFrame {
	public Panel_1 panel;


	public MyFrame(ActionListener listener) {
		super("Matriz");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.initComponets(listener);
		this.revalidate();
		this.repaint();
	}

	public void initComponets (ActionListener listener) {
		panel = new Panel_1(0, 0, this.getWidth(), this.getHeight(), listener);
		this.add(panel);
	}

	public Vector<String> newProduct(){
		Vector<String> product = new Vector<>();
		product.add(panel.getNameProduct().getText());
		product.add(panel.getUniPrice().getText());
		product.add(panel.getAmount().getText());
		return product;
	}

	public void showList(Vector<String> list,int total) {
		panel.getCarProduct().setText(list.get(0));
		panel.getCarProductPrice().setText(list.get(1));
		panel.getCarProductAmount().setText(list.get(2));
		panel.getCarProductTotal().setText(list.get(3));
		panel.getBigTotal().setText("$ "+total);
		panel.repaint();
		panel.revalidate();
	}
	public void updateDeleteLis(Vector<Product> list) {
		panel.getDeleteList().removeAllItems();
		for (int i = 0; i < list.size(); i++) {
			panel.getDeleteList().addItem(list.get(i).getNameProduct());
		}
		panel.repaint();
		panel.revalidate();
	}

	public Vector<String> deletProduct(){
		Vector<String> product = new Vector<>();
		product.add(panel.getDeleteList().getSelectedItem().toString());
		product.add(panel.getAmount2().getText());
		return product;
	}
	public void amounnotvalid(String message) {
		panel.getException().setText(message);
	}
	

}
