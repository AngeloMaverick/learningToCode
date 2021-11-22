import React from 'react'

function ComponentA(props) {
    return(
        <>
            <div>Componente A =D</div>
            <div>{props.children}</div>
        </>
    )
}

export default ComponentA