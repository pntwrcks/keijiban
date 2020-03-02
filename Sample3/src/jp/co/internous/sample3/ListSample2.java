package jp.co.internous.sample3;

import java.util.Arrays;
import java.util.List;


public class ListSample2 {

	static final String[] WEEK = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

	public static void main(String[] args) {

		List<String> week=Arrays.asList(WEEK);


		for(String day:week) {
			System.out.println(day);
		}
	}

}
