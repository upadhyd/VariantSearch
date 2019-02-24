import React from "react";
import ReactTable from "react-table";
import "react-table/react-table.css";

const DisplayTable = props => {
  const columns = [
    {
      Header: "GENE",
      accessor: "gene"
    },
    {
      Header: "NUCLEOTIDE CHANGE",
      accessor: "nucleotideChange"
    },
    {
      Header: "PROTEIN CHANGE",
      accessor: "proteinChange"
    },
    {
      Header: "OTHER MAPPINGS",
      accessor: "otherMappings"
    },
    {
      Header: "ALIAS",
      accessor: "alias"
    },
    {
      Header: "TRANSCRIPTS",
      accessor: "transcripts"
    },
    {
      Header: "REGION",
      accessor: "region"
    },
    {
      Header: "REPORTED CLASSIFICATION",
      accessor: "reportedClassification"
    },
    {
      Header: "INFERRED CLASSIFICATION",
      accessor: "inferredClassification"
    },
    {
      Header: "SOURCE",
      accessor: "source"
    },
    {
      Header: "LAST EVALUATED",
      accessor: "lastEvaluated"
    },
    {
      Header: "LAST UPDATED",
      accessor: "lastUpdated"
    }
  ];

  return <ReactTable columns={columns} data={props.geneNames} />;
};

export default DisplayTable;
