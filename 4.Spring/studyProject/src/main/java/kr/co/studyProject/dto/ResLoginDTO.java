package kr.co.studyProject.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter	// Getter 생성
@Setter	// Setter 생성
@NoArgsConstructor	// 기본 생성자
@AllArgsConstructor	// 모든 필드가 다 있는 생성자
@ToString
@Builder
public class ResLoginDTO {
	
	private Long id;
	private String userId;
	private String userName;
	private String email;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

}
