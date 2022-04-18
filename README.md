
notes: 

this is the blog I followed to study springboot sample integration with okta

This example goes through how to use the okta oauth client. It is also shows that once a client has authenticated to the springboot app, only the session id is returned to the client, to protect the access token provided by Okta. The token is preserved in the client's session / associated to the client's session id. 

Before running this code correct the application.yml to insert the okta attributes. 

To build the application `./gradlew build`
To run the application: `./gradlew bootRun`