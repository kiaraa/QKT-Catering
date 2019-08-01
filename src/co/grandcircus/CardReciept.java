package co.grandcircus;

import java.util.ArrayList;

public class CardReciept extends Receipt {
	int cardNum;
	String cardExpire;
	int cardCVV;
	
	    public CardReciept(ArrayList<Product> receipt, int cardNum, String cardExpire, int cardCVV) {
		super(receipt);
		this.cardNum = cardNum;
		this.cardExpire = cardExpire;
		this.cardCVV = cardCVV;
	}
	public CardReciept(ArrayList<Product> receipt) {
		super(receipt);
		// TODO Auto-generated constructor stub
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardExpire() {
		return cardExpire;
	}
	public void setCardExpire(String cardExpire) {
		this.cardExpire = cardExpire;
	}
	public int getCardCVV() {
		return cardCVV;
	}
	public void setCardCVV(int cardCVV) {
		this.cardCVV = cardCVV;
	}
	
	
	@Override
	public void printReceipt (){
		 super.printReceipt();
		 System.out.println(cardNum + " " + cardExpire + " " + cardCVV);
	}
	
	

}
