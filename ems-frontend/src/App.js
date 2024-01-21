
import './App.css';
import {BrowserRouter as BrowserRouter, Route, Routes} from 'react-router-dom';
import ListEmployeeComponent from './Components/ListEmployeeComponent';
import HeaderComponent from './Components/HeaderComponent'
import FooterComponent from './Components/FooterComponent'
import AddEmployeeComponent from './Components/AddEmployeeComponent'

function App() {
  return (
    <div>
      <BrowserRouter>
      <HeaderComponent />
      <Routes>
        <Route index element={<ListEmployeeComponent />} />
        <Route path="/" element={<ListEmployeeComponent />}></Route> 
        <Route path="/employees" element={<ListEmployeeComponent />}></Route>
        <Route path="*" element={<ListEmployeeComponent />}></Route>
        <Route path="/add-employee" element={<AddEmployeeComponent />}></Route>
        <Route path="/edit-employee/:id" element={<AddEmployeeComponent />}></Route>
      </Routes>
      <FooterComponent />
      </BrowserRouter>
    </div>
  );
}

export default App;
