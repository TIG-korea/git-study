import { useState } from "react";


function InputFiled(){
    const [name, setName] = useState('');
    const [email, setEmail] =useState('');

    function handleName (e){
        setName(e.target.value)
    }

    function handleEmail(e){
        setEmail(e.target.value)
    }


    return(
        <form action="">
            <input type="text" onChange={handleName}/>
            <input type="text" onChange={handleEmail}/>
            {/* <input type="text" onChange={(e) => setName(asdasd)}/> */}
        </form>
    )
}
export default InputFiled;