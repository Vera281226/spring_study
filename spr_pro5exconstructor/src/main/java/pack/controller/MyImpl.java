package pack.controller;

import java.util.Scanner;

import pack.model.SangpumInter;

public class MyImpl implements MyInter {	
	private SangpumInter inter;
	private String re;
	
	public MyImpl(SangpumInter inter) {
		this.inter = inter;
	}
	
	@Override
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품명 입력 : ");
		String name = scanner.nextLine();
		System.out.println("수량 입력 : ");
		int su = scanner.nextInt();
		System.out.println("금액 입력 : ");
		int money = scanner.nextInt();
		
		re = inter.calcMoney(name, su, money);
	}

	@Override
	public void showResult() {
		System.out.println(re);
	}
}
