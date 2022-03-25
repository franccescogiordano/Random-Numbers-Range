import React from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
  let contador = 0;

  let numeritos = props.result?.todoarmado?.map(function (num) {
    contador++;
    if (contador % props.result?.columns == 0) {


      return  (<span><br/>{num}</span>);
    }
    return  <span>{num}</span>;
  }

  )
    .join()
  console.log("props!!!!!!!!:" + props)
  return <div>
    Resultado:
 {numeritos}

  </div>
}


const stateMapToPros = state => {
  return {

    result: state.random.result

  }
}


export default connect(stateMapToPros)(Result)
