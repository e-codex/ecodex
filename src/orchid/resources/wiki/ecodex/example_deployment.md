


 # Example Setup of e-Codex

The following setup describes an example example of how the ecodex components can be installed.

 ![Deployment Graphics](/assets/media/images/ecodex_example_deployment.png)

 ## Components

 |                                   | Description                           |
 |-----------------------------------|---------------------------------------|
 | Internet                          | Symbolizes the Internet, The connection between the Gateways is made through it |
 | Firewall, DDOS-Filter             | A Firewall which protects the internal network. The information distributed over the CMT can be used to reduce the range of IP-Addresses which can connect through this firewall to the Apache Web Server |
 | Apache Web Server                 | The Apache Web Server in this Setup is responsible for terminating the TLS-Connection, Authenticating the connecting Web-Clients (the remote Gateway) by checking the client certificate |
 | Tomcat Web Application Server - Domibus Gateway    | The domibus Gateway is deployed on a Tomcat Web Application Server |
 | Tomcat Web Application Server - Domibus Connector  | The domibusConnector is deployed on a Tomcat Web Application Server |
 | Tomcat Web Application Server - Connector Client Application | The Connector Client Application is deployed on a Tomcat Web Application Server. This can be a national solution of an eCodeX-UseCase or the ReferenceImplementation.
 | Database                          | The database (MYSQL) provides for each application a different database. | 

 **Note that each application is running on it's own tomcat application server in this example!**




### Example Apache Setup and alternatives

Possible alternatives for the apache in this use case can be:

 * NGINX
 * IIS 
 * ...





