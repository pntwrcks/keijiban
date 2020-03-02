package jp.co.internous.sample3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> testMap = new HashMap<>();

		testMap.put("Taro", 30);

		int point = testMap.get("Taro");

		System.out.println(point);
	}

}
