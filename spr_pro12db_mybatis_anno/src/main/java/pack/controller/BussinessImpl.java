package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pack.model.SangpumDto;
import pack.model.SangpumInter;

@Service
public class BussinessImpl implements BussinessInter {
	@Autowired
	@Qualifier("sangpumImpl")
	private SangpumInter sangpumInter;
	
	@Override
	public void dataPrint() {
		List<SangpumDto> list = sangpumInter.selectList();
		for(SangpumDto s:list) {
			System.out.println(s.getCode()+" "+s.getSang()+" "+s.getSu()+" "+s.getDan());
		}
	}
}