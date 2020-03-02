package jp.co.internous.sample3;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {

		Map<String, Integer> testMap = new HashMap<>();

		testMap.put("Taro", 30);
		testMap.put("Ichiko", 60);
		testMap.put("Jiro", 45);

		for ( String key: testMap.keySet()){
            System.out.println(testMap.get( key));
	}
  }
}
