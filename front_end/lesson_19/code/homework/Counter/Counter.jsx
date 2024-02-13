// Забирает все из библиотеки, но делать так не нужно, только когда неоюходимо
// import * as React from 'react';

import Button from "../Button";

import "./styles.css";

function Counter({ count, onPlus, onMinus }) {
  return (
    <div className="counter-wrapper">
      <div className="button-control">
        <Button name="-" onClick={onMinus} />
      </div>
      <p className="counter-text">{count}</p>
      <div className="button-control">
        <Button name="+" onClick={onPlus} />
      </div>
    </div>
  );
}

export default Counter;
