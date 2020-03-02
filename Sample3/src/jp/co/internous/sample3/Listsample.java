package jp.co.internous.sample3;

import java.util.ArrayList;
import java.util.List;


public class Listsample {

	public static void main(String[] args) {

		List<String> users = new ArrayList<>();

		users.add("Taro");
		users.add("Ichiko");
		users.add("Jiro");

		String user1 = users.get(0);
		String user2 = users.get(1);
		String user3 = users.get(2);

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);


	}

}
