package pack;

public class MyBusiness {
	private int nai;
	private String addr;
	private StringDatas datas; // 클래스의 포함
	
	public MyBusiness() {
		
	}
	
	public void setNai(int nai) {
		this.nai = nai;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setDatas(StringDatas datas) {
		this.datas = datas;
	}
	
	public void displayData() {
		System.out.println("나이는 "+ nai);
		System.out.println("주소는 "+ addr);
		System.out.println("이름은 "+ datas.processName());
		System.out.println("취미는 "+ datas.processHobby());
		
	}
}