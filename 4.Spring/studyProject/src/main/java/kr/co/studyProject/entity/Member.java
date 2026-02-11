package kr.co.studyProject.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // JPA 엔티티로 선언
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Member {
	@Id  // PK(Primary Key) 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 자동 증가 (auto_increment)
	private Long id;
	private String userName;
	private String email;
	private String userId;
	private String password;
	private String phoneNumber;
	
	
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	@PrePersist
	public void prePersist() {
		this.createdAt = LocalDateTime.now();
	}
	
}
