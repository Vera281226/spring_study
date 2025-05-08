package pack.model;

public class SangpumImpl implements SangpumInter {	
	@Override
	public String calcMoney(String name, int su, int money) {
		return "상품 "+name+"의 금액은 "+(su*money);
	}
}