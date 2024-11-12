import styles from "./Form.module.css";
import MainNavigation from "../Components/MainNavigation";
import { useNavigate } from "react-router-dom";

export default function Student() {
  const navigate=useNavigate();
  function submitHandler(){
    alert("Form submitted");
    navigate("\rresult");
  }
  return (
    <div className={styles.student}>
      <MainNavigation />
      <p className={styles.paragraph}> LogIn to access the results!</p>
      <div className={styles.formContainer}>
        Username:
        <input
          type="text"
          id="username"
          name="username"
          className={styles.formInput}
        />
        Password:
        <input
          type="password"
          id="password"
          name="password"
          className={styles.formInput}
        />
        <button type="submit" className={styles.submitButton} onClick={submitHandler}>
          Submit
        </button>
      </div>
    </div>
  );
}
