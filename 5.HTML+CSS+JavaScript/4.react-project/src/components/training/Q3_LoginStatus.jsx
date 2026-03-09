
export default function LoginStatus(login) {

    return(

        <>
        {login ? <h3>로그인 성공</h3> : <h3>로그인 필요</h3>}
                            
        {/* {login === true && 
                            <h3>로그인 성공</h3>
        }
        
        
        {login === false && <h3>로그인 필요</h3>} */}
        </>
    )
    
}