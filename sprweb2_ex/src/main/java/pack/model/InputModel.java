package pack.model;

import org.springframework.stereotype.Service;

import pack.controller.InputBean;

@Service
public class InputModel {
	public String computeResult(InputBean bean) {
		String data="결과:"+bean.getName()+",님의 총점은:"+(bean.getJava()+bean.getPy())+"평균은 "+(bean.getJava()+bean.getPy())/2;	
		return data;
	}
}