
export default function FruitList({fruit}) {

    console.log(fruit)

    return(
        <>
        <ul>
        {fruit
            .map((fruit, index) =>{
                return <li key={index}>{fruit}</li>
                
                
            })   
        }
            </ul>
        </>
    )

}