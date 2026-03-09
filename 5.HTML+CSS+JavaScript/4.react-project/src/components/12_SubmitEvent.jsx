import { useState } from "react";


function SubmitEvent(){
    const [formData, setFormData] = useState({});



    function handleSubmit(e){
        e.preventDefault();  // form의 기본 동작을 막아줌 (새로고침)

        setFormData({
            name: e.target.name.value,
            email: e.target.email.value
        });
        console.log(formData);

    }

    return(
    
        <form onSubmit={handleSubmit}>
            <input type="text" name="name" />
            <input type="text" name="email" />
            <button type="submit">제출</button>
        </form>
    )
}

export default SubmitEvent;