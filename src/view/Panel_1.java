package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_1 extends JPanel {

	private JLabel newProductText;
	private JLabel nameText;
	private JLabel uniPriceText;
	private JLabel amountText;
	private JTextField nameProduct;
	private JTextField uniPrice;
	private JTextField amount;
	private JButton agree;
	private JLabel deleteproductText;
	private JComboBox<String> deleteList;
	private JLabel nameText2;
	private JLabel amountText2;
	private JTextField amount2;
	private JButton delete;
	private JLabel exception;
	private JLabel shoppingCart;
	private JScrollPane scrollPane ;
	private JPanel panel ;
	private JLabel nameText3;
	private JLabel uniPriceText2;
	private JLabel amountText3;
	private JLabel total;
	private JTextArea carProduct;
	private JTextArea carProductPrice;
	private JTextArea carProductAmount;
	private JTextArea carProductTotal;
	private JLabel totalText;
	private JTextField bigTotal;


	public Panel_1( int x,int y,int width,int heigth, ActionListener listener) {
		this.setLayout(null);
		this.setBounds(x,y, width, heigth);
		this.initComponents(listener);
	}

	public void initComponents(ActionListener listener) {

		newProductText= new JLabel("----AGREGAR PRODUCTO AL CARRITO----");
		newProductText.setFont(new Font(newProductText.getFont().getName(), Font.PLAIN, 14));
		newProductText.setBounds((int)(this.getWidth()*0.2), (int)(this.getHeight()*0.02), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(newProductText);

		nameText= new JLabel("Producto:");
		nameText.setBounds((int)(this.getWidth()*0.1), (int)(this.getHeight()*0.05), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.1));
		this.add(nameText);

		uniPriceText= new JLabel("Precio unitario:");
		uniPriceText.setBounds((int)(this.getWidth()*0.4), (int)(this.getHeight()*0.045), (int)(this.getWidth()*0.2), (int)(this.getHeight()*0.1));
		this.add(uniPriceText);

		amountText= new JLabel("Cantidad:");
		amountText.setBounds((int)(this.getWidth()*0.6), (int)(this.getHeight()*0.05), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.1));
		this.add(amountText);

		nameProduct= new JTextField();
		nameProduct.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.125), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		this.add(nameProduct);

		uniPrice= new JTextField();
		uniPrice.setBounds((int)(this.getWidth()*0.37), (int)(this.getHeight()*0.125), (int)(this.getWidth()*0.2), (int)(this.getHeight()*0.05));
		this.add(uniPrice);

		amount= new JTextField();
		amount.setBounds((int)(this.getWidth()*0.6), (int)(this.getHeight()*0.125), (int)(this.getWidth()*0.06), (int)(this.getHeight()*0.05));
		this.add(amount);

		agree= new JButton("Agregar al carro");
		agree.setBounds((int)(this.getWidth()*0.7), (int)(this.getHeight()*0.125), (int)(this.getWidth()*0.25), (int)(this.getHeight()*0.05));
		agree.setActionCommand("agree");
		agree.addActionListener(listener);
		this.add(agree);

		deleteproductText= new JLabel("----QUITAR DEL CARRITO----");
		deleteproductText.setFont(new Font(deleteproductText.getFont().getName(), Font.PLAIN, 14));
		deleteproductText.setBounds((int)(this.getWidth()*0.25), (int)(this.getHeight()*0.2), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(deleteproductText);

		nameText2= new JLabel("Producto:");
		nameText2.setBounds((int)(this.getWidth()*0.1), (int)(this.getHeight()*0.23), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.1));
		this.add(nameText2);

		amountText2= new JLabel("Cantidad a eliminar:");
		amountText2.setBounds((int)(this.getWidth()*0.37), (int)(this.getHeight()*0.23), (int)(this.getWidth()*0.2), (int)(this.getHeight()*0.1));
		this.add(amountText2);

		deleteList= new JComboBox<>();
		deleteList.setBounds((int)(this.getWidth()*0.03), (int)(this.getHeight()*0.31), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		this.add(deleteList);

		amount2= new JTextField();
		amount2.setBounds((int)(this.getWidth()*0.4), (int)(this.getHeight()*0.31), (int)(this.getWidth()*0.06), (int)(this.getHeight()*0.05));
		this.add(amount2);

		delete= new JButton("Eliminar del carro");
		delete.setBounds((int)(this.getWidth()*0.6), (int)(this.getHeight()*0.31), (int)(this.getWidth()*0.3), (int)(this.getHeight()*0.05));
		delete.setActionCommand("delete");
		delete.addActionListener(listener);
		this.add(delete);

		exception= new JLabel();
		exception.setBounds((int)(this.getWidth()*0.25), (int)(this.getHeight()*0.34), (int)(this.getWidth()*0.35), (int)(this.getHeight()*0.1));
		this.add(exception);

		shoppingCart= new JLabel("----CARRITO DE COMPRAS----");
		shoppingCart.setFont(new Font(newProductText.getFont().getName(), Font.PLAIN, 14));
		shoppingCart.setBounds((int)(this.getWidth()*0.25), (int)(this.getHeight()*0.43), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(shoppingCart);

		nameText3= new JLabel("Producto:");
		nameText3.setBounds((int)(this.getWidth()*0.08), (int)(this.getHeight()*0.48), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.1));
		this.add(nameText3);

		uniPriceText2= new JLabel("Precio unitario:");
		uniPriceText2.setBounds((int)(this.getWidth()*0.35), (int)(this.getHeight()*0.48), (int)(this.getWidth()*0.2), (int)(this.getHeight()*0.1));
		this.add(uniPriceText2);

		amountText3= new JLabel("Cantidad:");
		amountText3.setBounds((int)(this.getWidth()*0.55), (int)(this.getHeight()*0.48), (int)(this.getWidth()*0.2), (int)(this.getHeight()*0.1));
		this.add(amountText3);

		total= new JLabel("Total:");
		total.setBounds((int)(this.getWidth()*0.75), (int)(this.getHeight()*0.48), (int)(this.getWidth()*0.2), (int)(this.getHeight()*0.1));
		this.add(total);

		panel= new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension((int)(this.getWidth()*0.87), (int)(this.getHeight()*0.6)));

		scrollPane = new JScrollPane();
		scrollPane.setViewportView(panel);
		scrollPane.setBounds((int)(this.getWidth()*0.05), (int)(this.getHeight()*0.56), (int)(this.getWidth()*0.9), (int)(this.getHeight()*0.2));
		panel.setSize(new Dimension((int)(this.getWidth()*0.5), (int)(this.getHeight()*0.37)));

		carProduct= new JTextArea();
		carProduct.setBounds(0,0, (int)(panel.getWidth()*0.55), (int)(panel.getWidth()));
		panel.add(carProduct);

		carProductPrice= new JTextArea();
		carProductPrice.setBounds((int)(panel.getWidth()*0.6),0, (int)(panel.getWidth()*0.3), (int)(panel.getWidth()));
		panel.add(carProductPrice);

		carProductAmount=new JTextArea();
		carProductAmount.setBounds((int)(panel.getWidth()*1),0, (int)(panel.getWidth()*0.15), (int)(panel.getWidth()));
		panel.add(carProductAmount);

		carProductTotal= new JTextArea();
		carProductTotal.setBounds((int)(panel.getWidth()*1.3),0, (int)(panel.getWidth()*0.3), (int)(panel.getWidth()));
		panel.add(carProductTotal);

		this.add(scrollPane);

		totalText= new JLabel("TOTAL EN CARRO:");
		totalText.setFont(new Font(newProductText.getFont().getName(), Font.PLAIN, 20));
		totalText.setBounds((int)(this.getWidth()*0.1), (int)(this.getHeight()*0.8), (int)(this.getWidth()*0.5), (int)(this.getHeight()*0.05));
		this.add(totalText);

		bigTotal= new JTextField();
		bigTotal.setEditable(false);
		bigTotal.setBounds((int)(this.getWidth()*0.44), (int)(this.getHeight()*0.8), (int)(this.getWidth()*0.25), (int)(this.getHeight()*0.05));
		this.add(bigTotal);
	}

	public JTextField getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(JTextField nameProduct) {
		this.nameProduct = nameProduct;
	}

	public JTextField getUniPrice() {
		return uniPrice;
	}

	public void setUniPrice(JTextField uniPrice) {
		this.uniPrice = uniPrice;
	}

	public JTextField getAmount() {
		return amount;
	}

	public void setAmount(JTextField amount) {
		this.amount = amount;
	}

	public JComboBox<String> getDeleteList() {
		return deleteList;
	}

	public void setDeleteList(JComboBox<String> deleteList) {
		this.deleteList = deleteList;
	}

	public JTextField getAmount2() {
		return amount2;
	}

	public void setAmount2(JTextField amount2) {
		this.amount2 = amount2;
	}

	public JLabel getException() {
		return exception;
	}

	public void setException(JLabel exception) {
		this.exception = exception;
	}

	public JLabel getTotal() {
		return total;
	}

	public void setTotal(JLabel total) {
		this.total = total;
	}

	public JTextArea getCarProduct() {
		return carProduct;
	}

	public void setCarProduct(JTextArea carProduct) {
		this.carProduct = carProduct;
	}

	public JTextArea getCarProductPrice() {
		return carProductPrice;
	}

	public void setCarProductPrice(JTextArea carProductPrice) {
		this.carProductPrice = carProductPrice;
	}

	public JTextArea getCarProductAmount() {
		return carProductAmount;
	}

	public void setCarProductAmount(JTextArea carProductAmount) {
		this.carProductAmount = carProductAmount;
	}

	public JTextArea getCarProductTotal() {
		return carProductTotal;
	}

	public void setCarProductTotal(JTextArea carProductTotal) {
		this.carProductTotal = carProductTotal;
	}

	public JTextField getBigTotal() {
		return bigTotal;
	}

	public void setBigTotal(JTextField bigTotal) {
		this.bigTotal = bigTotal;
	}
	


}
