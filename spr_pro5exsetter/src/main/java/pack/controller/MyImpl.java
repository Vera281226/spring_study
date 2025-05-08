package pack.controller;

import java.util.Scanner;

import pack.model.SangpumInter;

public class MyImpl implements MyInter {
	private SangpumInter sangpumInter;
	String result;
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
	
	
	public void setSangpumInter(SangpumInter sangpumInter) {
		this.sangpumInter = sangpumInter;
	}
	
	@Override
	public String inputData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("상품명 : ");
        sangpumInter.setName(scanner.nextLine());

        System.out.print("수량 : ");
        sangpumInter.setSu(scanner.nextInt());

        System.out.print("단가 : ");
        sangpumInter.setDan(scanner.nextInt());
		
		result = sangpumInter.calcMoney();
		
		return result;
	}
	@Override
	public void showResult() {
		System.out.println(result);
	}	
}