import "./App.css";
// import Lesson18 from "./lessons/Lesson18";
// import Lesson19 from "./lessons/Lesson19";
// import HomeWork18 from "./homeworks/Homework18";
import Homework19 from "./homeworks/Homework19";

function App() {
  return (
    <div className="App">
      {/* Использовать Lessons только во время обучения,
      когда начнем писать проект, такой структуры у нас не будет */}
      {/* <Lesson18 /> */}
      {/* <Lesson19 /> */}
      {/* All our HomeWorks */}
      {/* <HomeWork18 /> */}
      <Homework19 />
    </div>
  );
}

export default App;
