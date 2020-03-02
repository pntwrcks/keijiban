package jp.co.internous.action;

public class Main {

	public static void main(String[] args) {

		User user1 = new User();

		user1.setFullname("鈴木一郎");
		user1.setTelephoneNO("090-1111-2222");

		String fullname = user1.getFullname();
		String telno = user1.getTelephoneNo();

		System.out.println(fullname);
		System.out.println(telno);

		Goods goods = new Goods();
		goods.setGoodsName("Tシャツ");
		goods.setPrice(1000);

		String message = user1.purchase(goods);
		System.out.println(message);

	}

}
