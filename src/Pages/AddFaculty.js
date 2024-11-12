import React,{useState} from 'react';
import styles from './Add.module.css';
import { Link, useNavigate } from 'react-router-dom';

export default function AddFaculty() {
    const navigate=useNavigate();
    const [formData, setFormData] = useState({
        facultyName: "",
        designation: "",
        userName: "",
        password: "",
      });
    
      const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({
          ...formData,
          [name]: value,
        });
      };
    
      const handleSubmit = (e) => {
        e.preventDefault();
        // You can perform actions with the form data here, such as sending it to a server or processing it further.
        console.log("Form submitted with data:", formData);
        alert("Added Faculty");
        navigate("/adminlogin/adminview");
      };
  return (
    <div className={styles.container}>
      <h1><Link to=".." relative="path">Back</Link></h1>
      <h1>Add a Faculty</h1>
    <div className={styles.formContainer}>
        Faculty Name:
        <input
          type="text"
          id="facultytName"
          name="facultyName"
          value={formData.facultyName}
          onChange={handleChange}
          className={styles.formInput}
        />
        Designation:
        <input
          type="text"
          id="designation"
          name="designation"
          value={formData.designation}
          onChange={handleChange}
          className={styles.formInput}
        />     
        Username:
        <input
          type="text"
          id="userName"
          name="userName"
          value={formData.userName}
          onChange={handleChange}
          className={styles.formInput}
        />
        Password:
        <input
          type="password"
          id="password"
          name="password"
          value={formData.password}
          onChange={handleChange}
          className={styles.formInput}
        /> 
        <button type="submit" className={styles.submitButton} onClick={handleSubmit}>
        ADD
      </button>
    </div>
    </div>
  );
}
