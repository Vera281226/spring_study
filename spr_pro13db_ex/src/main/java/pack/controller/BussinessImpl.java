package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Service
public class BussinessImpl implements BussinessInter {
	@Autowired
	private JikwonInter jikwonInter;
	
	@Override
	public void dataPrintAll() {
		List<JikwonDto> list = jikwonInter.selectAllList();
		System.out.println("직원 자료");
		System.out.println("사번\t이름\t부서명\t입사년");
		for(JikwonDto j:list) {
			System.out.println(j.getJikwonno()+"\t"+j.getJikwonname()+"\t"+j.getJikwonbusername()+"\t"+j.getJikwonibsail());
		}
	}
	@Override
	public void dataPrintCount() {
		List<JikwonDto> list = jikwonInter.selectCountList();
		System.out.println("부서별 인원수");
		for(JikwonDto j:list) {
			System.out.println(j.getJikwonbusername()+"\t"+j.getJikwoncount());
		}
	}
	@Override
	public void dataPrintMaxpay() {
		List<JikwonDto> list = jikwonInter.selectMaxPayList();
		System.out.println("부서별 최대 급여자");
		for(JikwonDto j:list) {
			System.out.println(j.getJikwonbusername()+" : "+j.getJikwonname()+"("+j.getJikwonmaxpay()+")");
		}
	}
}