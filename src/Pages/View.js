import React from 'react';
import styles from './View.module.css';
import { Link } from 'react-router-dom';

const queriesData = [
  { name: 'John Doe', query: 'How can I reset my password?' },
  { name: 'Jane Smith', query: 'What are the office hours?' },
  { name: 'Bob Johnson', query: 'Can you provide information on upcoming events?' },
  // Add more queries as needed
];

export default function View() {
  return (
    <div className={styles.container}>
      <h1><Link to=".." relative="path">Back</Link></h1>
     <h1>View the queries</h1>   
    <div className={styles.queryViewContainer}>
      
      <table className={styles.queryTable}>
        <thead>
          <tr>
            <th>Name</th>
            <th>Query</th>
          </tr>
        </thead>
        <tbody>
          {queriesData.map((query, index) => (
            <tr key={index}>
              <td>{query.name}</td>
              <td>{query.query}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
    </div>
  );
}
