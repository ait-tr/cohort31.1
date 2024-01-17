import { Route, Routes } from "react-router-dom"
// import JokeGenerator from "components/JokeGenerator"
// import CatFacts from "components/CatFacts"
import GlobalStyles from "styles/GlobalStyles"
import Weather from "pages/Weather"
import WeatherHome from "pages/Weather/components/WeatherHome"
import Weathers from "pages/Weather/components/Weathers"
// import TodoList from "components/TodoList"
// import Layout from "components/Layout"

// import Home from "pages/Home"
// import Users from "pages/Users"

// Homeworks
// import Homework29 from "homeworks/Homework29"
// import Homework31 from "homeworks/Homework31"

// Lessons
// import Lesson30 from "lessons/Lesson30"

function App() {
  return (
    <>
      <GlobalStyles />
      <Weather>
        <Routes>
          <Route path="/" element={<WeatherHome />} />
          <Route path="/weathers" element={<Weathers />} />
          <Route path="*" element="Page is not found" />
        </Routes>
      </Weather>
      {/* <CatFacts /> */}
      {/* <JokeGenerator /> */}
      {/* <TodoList /> */}
      {/* <Layout>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/users" element={<Users />} />
          <Route path="*" element="Page is not found" />
        </Routes>
      </Layout> */}
      {/* <Homework31 /> */}
      {/* <Homework29 /> */}
      {/* <Lesson30 /> */}
    </>
  )
}

export default App
