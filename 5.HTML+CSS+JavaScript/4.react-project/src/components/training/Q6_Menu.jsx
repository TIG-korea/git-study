
export default function Menu({menus}){
    return(
        <>
            <ul>

            {menus
                    .map((menu, index) =>{
                        return <li key={index}>{menu}</li>
                    })    
                }

                </ul>



        </>
    )
}