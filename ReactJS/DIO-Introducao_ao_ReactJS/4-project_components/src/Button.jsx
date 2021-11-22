import React from 'react'

//Nome de Componente começa com letra maiúscula! (CamelCase)
function Button(props) {
    
    //const name = props.name
    const { name, onClick } = props
    
    return(
        <button onClick={onClick}> {name} </button>
    )
}

export default Button


