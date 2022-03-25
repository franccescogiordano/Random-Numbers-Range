import React from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
 
  console.log(props.result)
  return <div>
     {props.result && 'Resultado: '+ props.result.map(function(num) {
    return Math.sqrt(num);
})} 
  </div>
}


const stateMapToPros = state => {
  return {
  
    result: state.random.result?.todoarmado
    
  }
}


export default connect(stateMapToPros)(Result)
