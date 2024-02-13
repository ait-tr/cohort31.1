import "./styles.css";

function Button({ name = "Send", type = "button", onClick }) {
  return (
    <button onClick={onClick} className="button-component" type={type}>
      {name}
    </button>
  );
}

export default Button;
