import React, { Fragment } from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
  let contador = 0;

  
/*for (let value of values) {
  contents.push(<span key={value.key}>{value.name}</span>);

  if (value.condition) {
    contents.push(<br key={`${value.key}-br`} />);
  }
})*/
const contents = props.result?.todoarmado?.map((value,contador) => {

  if (contador % props.result?.columns == 0)
    return (<><br key={contador+"-br"}/>
      <span key={contador}>{value},</span></>);
  return (<span key={contador}>{value},</span>)
})

  console.log("props!!!!!!!!:" + props)
  return <div>
    Resultado:
 {contents}

  </div>
}


const stateMapToPros = state => {
  return {

    result: state.random.result

  }
}


export default connect(stateMapToPros)(Result)
