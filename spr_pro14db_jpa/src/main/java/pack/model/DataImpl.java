package pack.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

@Repository
public class DataImpl implements DataInterface {
	@Override
	public List<MemDto> selectDataAll() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("hello");
		EntityManager entityManager = entityManagerFactory.createEntityManager(); // 기초 CRUD 수행
		EntityTransaction entityTransaction = entityManager.getTransaction(); // 트랜잭션 관리
		
		List<MemDto> list = null;
		
		try {
			// 레코드 하나 조회
			MemDto dto = entityManager.find(MemDto.class, 1); // SELECT 수행됨
			System.out.println(dto.getNum()+" "+dto.getName()+" "+dto.getAddr());
			// 전체 자료 얻기
			list = findAll(entityManager, MemDto.class);
		} catch (Exception e) {
			System.out.println("selectDataAll 에러 "+e.getMessage());
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return list;
	}
	
	public List findAll(EntityManager entityManager, Class cl) {
		// JPQL : JPA는 SQL을 추상화한 JPQL이라는 언어를 제공한다
		return entityManager.createQuery("SELECT e FROM "+cl.getName()+" e", cl).getResultList();
	}
}