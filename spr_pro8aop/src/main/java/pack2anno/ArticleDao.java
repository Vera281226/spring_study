package pack2anno;

import org.springframework.stereotype.Repository;

@Repository // DB 처리용 클래스에 대한 객체 생성 어노테이션
public class ArticleDao implements ArticleInter {
	@Override
	public void selectAll() {
		System.out.println("핵심 로직의 selectAll : 테이블 자료 읽기 수행");
	}
}