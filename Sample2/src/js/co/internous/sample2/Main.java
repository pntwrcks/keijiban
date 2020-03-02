package js.co.internous.sample2;

public class Main {

	public static void main(String[] args) {
		judge(20);
		judge(18);
	}

	private static void judge(int age) {
		if (age < 20) {
			System.out.println("未成年");
		}else {
			System.out.println("成人");
		}
	}
}





