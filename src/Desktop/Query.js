import React, { useState } from "react";
import MainNavigation from "../Components/MainNavigation";
import styles from "./Query.module.css";

export default function Query() {
  const [usn, setUsn] = useState("");
  const [query, setQuery] = useState("");

  const handleSubmit = () => {
    console.log("Submitted:", { usn, query });
    alert("Submitted Succesfully!!");
  };

  return (
    <div className={styles.query}>
      <MainNavigation />
      <div className={styles.queryContainer}>
        <h1>Please provide the following to enquire.</h1>
        <form className={styles.formContainer}>
          USN:
          <input
            type="text"
            id="usn"
            name="usn"
            value={usn}
            onChange={(e) => setUsn(e.target.value)}
            className={styles.formInput}
          />
          Query:
          <textarea
            id="query"
            name="query"
            value={query}
            onChange={(e) => setQuery(e.target.value)}
            className={styles.formTextarea}
          />
          <button
            type="button"
            onClick={handleSubmit}
            className={styles.submitButton}
          >
            Submit
          </button>
        </form>
      </div>
    </div>
  );
}
