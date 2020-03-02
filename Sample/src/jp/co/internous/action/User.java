package jp.co.internous.action;

public class User {

	private String fullname;
	private String telephoneNo;

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setTelephoneNO(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}
	public String purchase(Goods goods) {
		String message = goods.getGoodsName() + "を";
		message += goods.getPrice() + "円で購入しました。";

		return message;
	}



}
