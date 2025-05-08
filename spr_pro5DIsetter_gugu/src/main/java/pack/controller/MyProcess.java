package pack.controller;

import pack.model.GuguInter;

public class MyProcess implements MyBusinessInter {
	private String programmerName;
	private GuguInter guguInter;
	private int dan;
	
	public MyProcess() {
		
	}
	
	public void setProgrammerName(String programmerName) {
		this.programmerName = programmerName;
	}
	
	public void setGuguInter(GuguInter guguInter) {
		this.guguInter = guguInter;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public String showData() {
		int[] result = guguInter.numberCalc(3);

		String str = "";
		for(int i=0; i<result.length; i++){
			str += dan+" * "+(i+1)+" = "+result[i]+"\n";
		}
		
		return "작성자 : "+ programmerName +"\n"+dan+"단 결과 : \n"+str;
	}
}
