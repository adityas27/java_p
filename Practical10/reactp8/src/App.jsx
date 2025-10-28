import { useState } from 'react'
import './App.css'

function App() {
 const [message, setMessage] = useState("Happy Learning React!");


  return (
    <>
     <div>
      <h1>{message}</h1>
      <button onClick={() => setMessage("You just Reacted by clicking!")}>
        Click Me
      </button>
    </div>
    </>
  )
}

export default App
