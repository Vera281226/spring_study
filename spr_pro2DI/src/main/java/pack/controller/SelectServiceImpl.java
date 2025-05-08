package pack.controller;

import pack.model.DataDao;

public class SelectServiceImpl implements SelectService {
	private DataDao dataDao; // 모델이 가진 DB를 컨트롤러 영역에서 처리하기 위해 사용
	
	public SelectServiceImpl(DataDao dataDao) {
		// 생성자를 이용해 DataDao에게 주소를 치환
		System.out.println("SelectServiceImpl 생성자");
		this.dataDao = dataDao; // DI 중 하나 생성자 주입(Constructor Injection)
	}
	
	@Override
	public void selectProcess() {
		System.out.println("컨트롤러 영역 selectProcess 수행");
		dataDao.selectData();
	}
}