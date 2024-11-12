// AddResult.js
import React, { useState } from 'react';
import styles from './AddResult.module.css';
import { useNavigate ,Link} from 'react-router-dom';

export default function AddResult(){
  const navigate=useNavigate();
  const [subjectName, setSubjectName] = useState('');
  const [internalMarks, setInternalMarks] = useState('');
  const [externalMarks, setExternalMarks] = useState('');
  const [grade, setGrade] = useState('');

  const handleAddResult = () => {
    console.log('Adding result:', {
      subjectName,
      internalMarks,
      externalMarks,
      grade,
    });
    alert("Successfully Added");
    navigate("/facultylogin/facultyview")
  };

  return (
    <div className={styles.result}>
        <h1><Link to=".." relative="path">Back</Link></h1>
        <h1>Add Results</h1>
        <div className={styles.addResultContainer}>
        <div className={styles.formContainer}>
        Subject Name:
        <input
          type="text"
          id="subjectName"
          value={subjectName}
          onChange={(e) => setSubjectName(e.target.value)}
          className={styles.formInput}
        />

        Internal Marks:
        <input
          type="number"
          id="internalMarks"
          value={internalMarks}
          onChange={(e) => setInternalMarks(e.target.value)}
          className={styles.formInput}
        />

       External Marks:
        <input
          type="number"
          id="externalMarks"
          value={externalMarks}
          onChange={(e) => setExternalMarks(e.target.value)}
          className={styles.formInput}
        />

        Grade:
        <input
          type="text"
          id="grade"
          value={grade}
          onChange={(e) => setGrade(e.target.value)}
          className={styles.formInput}
        />

        <button onClick={handleAddResult} className={styles.submitButton}>
          Add Result
        </button>
      </div>
    </div>
    </div>
  );
};

