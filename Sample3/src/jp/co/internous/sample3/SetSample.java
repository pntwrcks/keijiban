package jp.co.internous.sample3;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(1);

		for (int n: set) {
			System.out.println(n);
		}
	}

}
