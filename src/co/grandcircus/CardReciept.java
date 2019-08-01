package co.grandcircus;

public class CardReciept  {
	int cardNum;
	int cardExpire;
	int cardCVV;
	public CardReciept(int cardNum, int cardExpire, int cardCVV) {
		super();
		this.cardNum = cardNum;
		this.cardExpire = cardExpire;
		this.cardCVV = cardCVV;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public int getCardExpire() {
		return cardExpire;
	}
	public void setCardExpire(int cardExpire) {
		this.cardExpire = cardExpire;
	}
	public int getCardCVV() {
		return cardCVV;
	}
	public void setCardCVV(int cardCVV) {
		this.cardCVV = cardCVV;
	}
	@Override
	public String toString() {
		return "Card ending with: " + cardNum;
	}
	
	

}
