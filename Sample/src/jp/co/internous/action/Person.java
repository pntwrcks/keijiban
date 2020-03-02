package jp.co.internous.action;

public class Person {

	private String firstName;
	private String familyName;
	private String birthday;
	private int gender;

	public Person() {

	}

	public Person(String birthday, int gender) {
		this.birthday = birthday;
		this.gender = gender;

	}
	public Person(String firstName, String familyName, String birthday, int gender) {
		this.firstName = firstName;
		this.familyName = familyName;
		this.birthday = birthday;
		this.gender = gender;

	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamily(String familyName) {
		this.familyName = familyName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

}
