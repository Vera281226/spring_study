package pack.controller;

import java.util.Iterator;
import java.util.Scanner;

import pack.model.MoneyInter;

public class MyProcess implements MyInter {
	private MoneyInter moneyInter;
	private int[] re;
	
	public MyProcess(MoneyInter moneyInter) {
		this.moneyInter = moneyInter;
	}
	
	@Override
	public void inputMoney() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("금액 입력 : ");
			int mymoney = scanner.nextInt();
			re = moneyInter.calcMoney(mymoney);
		} catch (Exception e) {
			System.out.println("inputMoney err"+e.getMessage());
		}
		
	}
	
	@Override
	public void showMoney() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("만원"+re[0]+"천원"+re[1]+"백원"+re[2]+"십원"+re[3]+"일원"+re[4]);
		System.out.println(stringBuffer.toString());

	}
}