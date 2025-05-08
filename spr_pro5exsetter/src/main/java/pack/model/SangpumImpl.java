package pack.model;

public class SangpumImpl implements SangpumInter {
	String name;
	int su;
	int dan;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSu(int su) {
		this.su = su;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public String calcMoney() {	
		return "상품 : "+name+" 의 가격은 "+(su*dan);
	}
}
