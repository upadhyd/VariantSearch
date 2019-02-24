# Variant Search

# Server Side Spring Boot project

## Environment Setup for Spring Boot Server Side Project:

1. Setup Java 1.8 on your system. Java binaries are available [here](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. Download the lastest binary of Maven from [here](https://maven.apache.org/download.cgi)
3. Setup maven as per the instruction [here](https://maven.apache.org/install.html)
4. Thats all. You are all set. As we are using in memory database H2, no other db setup is required.

## Starting up the server

1. Navigate to (https://github.com/upadhyd/VariantSearch/tree/master/VariantSearchFullStack) on your local.
2. Execute `mvn clean install`
3. Start the server `java -jar target/variant-search-rest-service-0.0.1-SNAPSHOT.jar`

## Api Calls

1. As we are using in memory h2-database, the data should already be pre-loaded.
2. Use curl or your favourite clent to make the following call:

   `curl -X GET \ http://localhost:8080/api/variant/BRAF \ -H 'Content-Type: application/json'`

# Client Side React App

## Environment Setup For React Web App

1. Download and install [node.js](https://nodejs.org/en/download/)
2. Navigate to [varaiant-search](https://github.com/upadhyd/VariantSearch/tree/master/varaiant-search)
3. Install npm packages by executing `npm install`

## Starting up the client server

1. Execute the command `npm start` to launch the React webapp.

## UI

### Autocomplete

![AutoComplete](https://github.com/upadhyd/VariantSearch/blob/master/variant-search-autosuggest.PNG)

### Display Table

![Display Table](https://github.com/upadhyd/VariantSearch/blob/master/Variant-search-search-result.PNG)
