package _2_encap.good;

public class Member {

	//getter, setter, 생성자를 빨리 생성하는 법
	
	private String id; // String이 멤버변수에 들어왔다는 건 다른 클래스도 멤버변수로 올 수 있다는 말
	private String pw;
	private String name; //원시타입
	private char gender;
	private int birth;
	private int number;
	private String addr;
	private String zipNum; // 우편변호
	
	// 자동완성 기능 **암기
	
	/*
	 * 기본 생성자 ctrl + space, enter
	 * 
	 * 생성자
	 * 
	 * 1. alr+shift+s 또는 source tab
	 * 2. generate constructor using fields클릭 
	 */
	public Member() {
	
	}
	
	public Member(String id, String pw, String name, char gender, int birth, int number, String addr, String zipNum) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.number = number;
		this.addr = addr;
		this.zipNum = zipNum;
	}

	/*
	 * getter, setter
	 * 
	 * 1. alr+shift+s 또는 source tab
	 * 2. generate getters and setters ... 클릭 
	 */

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getZipNum() {
		return zipNum;
	}
	public void setZipNum(String zipNum) {
		this.zipNum = zipNum;
	}
	
}
