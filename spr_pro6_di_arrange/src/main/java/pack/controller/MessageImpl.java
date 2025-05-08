package pack.controller;

import pack.model.MyInfo;
import pack.model.OurInfo;
import pack.other.OutFileInter;

public class MessageImpl implements MessageInter {
	private String name, name2;
	private int year;
	private MyInfo myInfo;
	private OurInfo ourInfo;
	private OutFileInter outFileInter;
	
	private String spec; // 고유 기술 세터 주입
	
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public void setOurInfo(OurInfo ourInfo) {
		this.ourInfo = ourInfo;
	}
	public void setOutFileInter(OutFileInter outFileInter) {
		this.outFileInter = outFileInter;
	}
	
	public MessageImpl(String name, String name2, int year, MyInfo myInfo) {
		this.name = name;
		this.name2 = name2;
		this.year = year;
		this.myInfo = myInfo;
	}
	
	@Override
	public void sayHi() {
		String msg = "안녕 "+name+" 안녕 "+name2+"\n";
		msg += year+2000+"년 ";
		msg += myInfo.myHobby();
		msg += "\n 보유 기술은"+spec;
		msg += "\n"+ourInfo.hello();
		System.out.println(msg);
		outFileInter.outFileString(msg);
	}
}