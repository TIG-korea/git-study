package kr.co.studyProject.service;

import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqsignupDTO;
import kr.co.studyProject.dto.ResLoginDTO;

public interface MServic {
	
	
	
	void singup(ReqsignupDTO request);
	
	
	ResLoginDTO login(ReqLoginDTO request);

}
