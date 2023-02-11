import React from 'react'
import { useParams, useResolvedPath } from 'react-router-dom'

export default  function Users(){
   const {id}= useParams()
   return(
    <div>
        <h3>Mostrando usuario con id: {id}</h3>
    </div>
)
}
