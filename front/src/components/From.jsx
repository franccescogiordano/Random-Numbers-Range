import React, { useState } from 'react'
import { connect } from 'react-redux';
import { fetchRandom } from '../actions';

const From = (props) => {// component stateless
  const [state, setState] = useState({bignumber:0,columns:0,smallnumber:0});
  const onSubmit = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(state));
    console.log(JSON.stringify(state));
  };
  return <div>
    <form onSubmit={onSubmit}>
      <label htmlFor="list">Numero mas chico:</label>
      <input id="smallnumber" 
        onChange={(e) => setState({...state, [e.target.id]: e.target.value}) }
      ></input>
        <label htmlFor="bignumber">Numero mas grande:</label>
      <input id="bignumber" 
        onChange={(e) =>setState({...state, [e.target.id]: e.target.value})}
      ></input>
         <label htmlFor="columns">¿Cuantas columnas?:</label>
      <input id="columns" 
        onChange={(e) => setState({...state, [e.target.id]: e.target.value})}
      ></input>
      <br />
      <button type="submit" disabled={props.loading}>
        Enviar
      </button>
    </form>
  </div>
}


const stateMapToPros = state => {
  return {
    loading: state.view.loading
  }
}


export default connect(stateMapToPros)(From)
