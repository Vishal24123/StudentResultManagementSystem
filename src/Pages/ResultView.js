import React from "react";
import styles from "./ResultView.module.css";
import { Link } from "react-router-dom";

const subjectsData = [
  { subjectName: "Math", internalMarks: 80, externalMarks: 90, grade: "A" },
  { subjectName: "Science", internalMarks: 75, externalMarks: 85, grade: "B" },
  { subjectName: "English", internalMarks: 90, externalMarks: 80, grade: "A" },
];

export default function ResultView() {
  return (
    <div className={styles.result}>
    
    <h1>Result View Page</h1>
    <h1><Link to=".." relative='path'>Back</Link></h1>
    <div className={styles.resultViewContainer}>
      <table className={styles.resultTable}>
        <thead>
          <tr>
            <th>Subject Name</th>
            <th>Internal Marks</th>
            <th>External Marks</th>
            <th>Grade</th>
          </tr>
        </thead>
        <tbody>
          {subjectsData.map((subject, index) => (
            <tr key={index}>
              <td>{subject.subjectName}</td>
              <td>{subject.internalMarks}</td>
              <td>{subject.externalMarks}</td>
              <td>{subject.grade}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
    </div>
  );
}
 