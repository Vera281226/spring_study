package pack;

public class MyBusiness {
	private String name;
	private int su;
	private int dan; // 클래스의 포함
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSu(int su) {
		this.su = su;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public void displayData() {
		
		System.out.print("상품 "+ name);
		System.out.print("의 금액은 "+ (su*dan));	
	}
}