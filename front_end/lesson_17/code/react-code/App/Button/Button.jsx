import "./styles.css";

function Button({ name = "Send", type = "button", children }) {
  console.log(name);
  return (
    <button className="button-component" type={type}>
      {name}
      {children}
    </button>
  );
}

export default Button;
