package kr.co.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.studyProject.entity.Member;

public interface MemberRepository extends JpaRepository <Member, Long>{

	boolean existsByUserId(String userId);
	
	
	boolean existsByEmail(String email);
	
	boolean existsByPhoneNumber(String phoneNumber);
	
	Member findByUserId(String userId);

}
