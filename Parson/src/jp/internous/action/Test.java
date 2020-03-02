package jp.internous.action;

public class Test{
	public static void main(String[]args) {
		Person taro = new Person();
		taro.name="山田太郎" ;
		taro.age=20;
		taro.phoneNumber="090-1234-5678";
		taro.address="yamadatarou@gmail.com";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person zirou = new Person();
		zirou.name="木村次郎" ;
		zirou.age=18;
		zirou.phoneNumber="080-9999-7777";
		zirou.address="kinuraziro@gmail.com";

		System.out.println(zirou.name);
		System.out.println(zirou.age);
		System.out.println(zirou.phoneNumber);
		System.out.println(zirou.address);

		Person hanako = new Person();
		hanako.name="鈴木花子" ;
		hanako.age=16;
		hanako.phoneNumber="070-2222-4444";
		hanako.address="suzukihanako@gmail.com";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person syu = new Person();
		syu.name="市川周" ;
		syu.age=24;
		syu.phoneNumber="090-3333-1111";
		syu.address="qwertasdfg@gmail.com";

		System.out.println(syu.name);
		System.out.println(syu.age);
		System.out.println(syu.phoneNumber);
		System.out.println(syu.address);

		Robot aibo = new Robot();
		aibo.name="aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name="asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name="pepper";

		pepper.talk();
		pepper.walk();
		pepper.run();

}


}



