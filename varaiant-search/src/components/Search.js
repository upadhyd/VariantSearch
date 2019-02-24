import React, { Component } from "react";
import axios from "axios";
import Suggestions from "./Suggestions";
import DisplayTable from "./DisplayTable";

const API_URL = "http://localhost:8080/api/variant/search";

class Search extends Component {
  constructor() {
    super();

    this.state = {
      geneName: "",
      errors: {},
      query: "",
      results: [],
      genes: []
    };

    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }

  getInfo = () => {
    axios
      .get(`${API_URL}?term=${this.state.query}&limit=7`)
      .then(({ data }) => {
        this.setState({
          results: data.suggestions
        });
      });
  };

  handleInputChange = () => {
    this.setState(
      {
        query: this.search.value
      },
      () => {
        if (this.state.query && this.state.query.length > 0) {
          // if (this.state.query.length % 2 === 0) {
          this.getInfo();
          // }
        } else if (!this.state.query) {
        }
      }
    );
  };

  onChange(event) {
    this.setState({ [event.target.name]: event.target.value });
  }

  onSubmit(e) {
    e.preventDefault();
    axios
      .get(`http://localhost:8080/api/variant/${this.search.value}`)
      .then(response => {
        console.log(response);
        let genes = [];
        if (Array.isArray(response.data)) {
          genes = response.data;
        } else {
          genes.push(response.data);
        }
        this.setState({
          genes: genes
        });
      });
  }

  render() {
    return (
      <div className="project">
        <div className="container">
          <div className="row">
            <div className="col-md-8 m-auto">
              <h5 className="display-4 text-center">Variant Search</h5>
              <hr />
              <form onSubmit={this.onSubmit}>
                <div className="form-group">
                  <input
                    type="text"
                    className="form-control form-control-lg"
                    placeholder="Gene Name"
                    name="geneName"
                    ref={input => (this.search = input)}
                    onChange={this.handleInputChange}
                  />
                  <Suggestions results={this.state.results} />
                </div>
                <input
                  type="submit"
                  className="btn btn-primary btn-block mt-4"
                />
              </form>
            </div>
          </div>
        </div>
        <DisplayTable geneNames={this.state.genes} />
      </div>
    );
  }
}

export default Search;
