import { useNavigate } from "react-router-dom";
import { noticeDeleteApi } from "../api/boardApi";
import { useMutation } from "@tanstack/react-query";

export const useNoticeDeleteMutation = (postId) => {
    const navigate = useNavigate();

    return useMutation({
        mutationFn: noticeDeleteApi(postId),
        onSuccess: (data) =>{
            alert("게시글을 삭제하였습니다.")
            navigate('/notice/list');
        },
        onError: (error) => {
            alert("게시글을 삭제 할 수 없습니다.")
        }
        
    })
}