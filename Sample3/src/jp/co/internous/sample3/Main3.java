package jp.co.internous.sample3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main3 {

	public static void main(String[] args) {

		Map<String, Integer> testMap = new HashMap<>();

		testMap.put("Taro", 30);
		testMap.put("Ichiko", 60);
		testMap.put("Jiro", 45);

		for ( Entry<String, Integer> entry: testMap.entrySet() ){
            System.out.println(entry.getKey() + "の点数は" + entry.getValue() );
	}
  }
}