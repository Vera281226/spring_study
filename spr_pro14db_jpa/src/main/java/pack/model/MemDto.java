package pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity // 원본 테이블 매핑
@Table(name="mem") // 실제 테이블 이름
public class MemDto {
	@Id // 기본키
	@Column(name="num")
	private int num;
	@Column(name="name", nullable = true)
	private String name;
	// @Column(name="addr", nullable = true)
	private String addr;
}