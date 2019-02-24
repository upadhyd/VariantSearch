import React from "react";
import ReactDOM from "react-dom";
import DisplayTable from "../components/DisplayTable";

it("renders without crashing", () => {
  const div = document.createElement("div");
  ReactDOM.render(<DisplayTable />, div);
  ReactDOM.unmountComponentAtNode(div);
});
