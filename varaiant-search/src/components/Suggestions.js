import React from "react";

const Suggestions = props => {
  let i = 1;
  console.log("--Insude Suggestions");

  const options = props.results.map(r => <li key={i++}>{r}</li>);
  return <ul>{options}</ul>;
};

export default Suggestions;
