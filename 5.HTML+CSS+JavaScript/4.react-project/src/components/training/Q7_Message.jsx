let isClick = false;

export default function Message(){
    function Click (){
        const target = document.getElementById("msg");

        if(isClick === true){
            target.innerText ="안녕하세요"
            isClick = true; 
        } else {
            target.innerText ="반갑습니다."
            isClick = false;
        }
    }


    return(
            
        <button onClick={Click}>버튼</button>
    )
}