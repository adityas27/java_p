import { useState } from 'react'
import './App.css'

function App() {
  const [selectedColor, setSelectedColor] = useState(''); 
  const handleColorClick = (color) => { 
    setSelectedColor(color); 
  }; 
  return ( 
    <div style={{ textAlign: 'center', marginTop: '50px' }}> 
      <h2>Select a Color</h2> 
      <div style={{ marginBottom: '20px' }}> 
        <button onClick={() => handleColorClick('Red')} style={{ margin: '5px',backgroundColor: 'red', color: 'white', padding: '10px 20px' }}>Red</button> 
        <button onClick={() => handleColorClick('Blue')} style={{ margin: '5px', backgroundColor: 'blue', color: 'white', padding: '10px 20px' }}>Blue</button> 
        <button onClick={() => handleColorClick('Green')} style={{ margin: '5px', backgroundColor: 'green', color: 'white', padding: '10px 20px' }}>Green</button> 
        <button onClick={() => handleColorClick('Yellow')} style={{ margin: '5px', backgroundColor: 'gold', color: 'black', padding: '10px 20px' }}>Yellow</button> 
      </div> 
      {selectedColor && ( 
        <h3>You have selected <span style={{ color: selectedColor.toLowerCase() }}>{selectedColor}</span>.</h3> 
      )} 
    </div> 
  )
}

export default App
