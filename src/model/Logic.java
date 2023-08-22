package model;

import java.util.Iterator;
import java.util.Vector;

public class Logic {

	private Vector<Product> shoppingCart;

	public Logic() {
		shoppingCart= new Vector<>();
	}

	public void newProduct(Vector<String> product) {
		int search=searchProduct(product.get(0));
		if(search!=-1) {
			shoppingCart.get(search).setAmount(shoppingCart.get(search).getAmount()+Integer.parseInt(product.get(2)));
			shoppingCart.get(search).setTotalprice(shoppingCart.get(search).getAmount()*shoppingCart.get(search).getPriceUnite());
		}else {
			shoppingCart.add(new Product(product.get(0), Integer.parseInt(product.get(1)),Integer.parseInt(product.get(2))));
		}
	}

	public String removeElements(Vector<String> product) {
		int search=searchProduct(product.get(0));
		if(shoppingCart.get(search).getAmount()< Integer.parseInt(product.get(1)) || Integer.parseInt(product.get(1))<0) {
			return "La cantitad ingresada de elementos no es valida";
		}
		else {
			shoppingCart.get(search).setAmount(shoppingCart.get(search).getAmount()-Integer.parseInt(product.get(1)));
			shoppingCart.get(search).setTotalprice(shoppingCart.get(search).getAmount()*shoppingCart.get(search).getPriceUnite());
			if(shoppingCart.get(search).getAmount()==0) {
				shoppingCart.remove(search);
			}
			return "";
		}	
	}

	public Vector<String> showList(){
		Vector<String>list = new Vector<>();
		String namep="";
		String price="";
		String amount="";
		String total="";
		for (int i = 0; i < shoppingCart.size(); i++) {
			namep+=shoppingCart.get(i).getNameProduct()+"\n";
			price+="$ "+shoppingCart.get(i).getPriceUnite()+"\n";
			amount+=shoppingCart.get(i).getAmount()+"\n";
			total+="$ "+shoppingCart.get(i).getTotalprice()+"\n";
		}
		list.add(namep);
		list.add(price);
		list.add(amount);
		list.add(total);		
		return list;
	}


	public int searchProduct(String nameP) {
		int position=-1;
		for (int i=0; i < shoppingCart.size();i++) {
			if(shoppingCart.get(i).getNameProduct().equals(nameP)) {
				position=i;
			}
		}
		return position;
	}
	
	public int total() {
		int total=0;
		for (Product elemento : shoppingCart) {
            total+=elemento.getTotalprice();
        }
		return total;
	}

	public Vector<Product> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Vector<Product> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}




}
