<p align="center">
  <img src="http://www.gregoriopalama.com/wp-content/uploads/2016/06/cloud.png" alt="Spring Cloud Netflix"/>
</p>

## Lab 3 - Create a Spring Cloud Config Server and Client

**Part 1 - Config Server:**

1. Create a new Spring Boot application.  Name the project "lab-3-server”, and use this value for the Artifact.  Use Jar packaging and the latest versions of Java.  Use a version of Boot < 1.3.x.   No need to select any dependencies.

1. Edit the POM (or gradle) file.  Alter the parent group Id to be "org.springframework.cloud" and artifact to be "spring-cloud-starter-parent".  Version "Camden.SR2" is the most recent stable version at the time of this writing..

1. Add a dependency for group "org.springframework.cloud" and artifact "spring-cloud-config-server".  You do not need to specify a version -- this is already defined in the parent project.

1. Edit the main Application class (probably named Lab3ServerApplication).  Add the @EnableConfigServer to this class.

1. Create a new repository on GitHub to hold your application configuration data.  Call the repository "ConfigData" or a name of your choosing.  Note the full URI of the repository, you will need this in a following step.

1. Add a new file to your GitHub repository called "lab-3-client.yml” (or lab-3-client.properties).  Add a key called "lucky-word" and a value of "Irish", "Rabbit's Foot", "Serendipity", or any other value of your choosing.

1. Back in your project, create an application.yml (or application.properties) file in the root of your classpath (src/main/resources recommended).  Add the key "spring.cloud.config.server.git.uri" and the value "https://github.com/"YOUR-GITHUB-ID"/ConfigData", substituting the value for Github ID and repository name as needed.  Also set the “server.port” to 8001.

8. Run the application.  Open the URL [http://localhost:8001/lab-3-client/default/](http://localhost:8001/lab-3-client/default/).  You should see the JSON result that will actually be used by Spring.  If the server is not working, review the prior steps to find the issue before moving on.

##Info

- [x] **[Microservices with Spring Cloud (Udemy)](https://www.udemy.com/microservices-with-spring-cloud/learn/v4/overview)**

- [x] **Instructor: [Ken Krueger, Technical Instructor in Software Development topics](https://linkedin.com/in/ken-krueger-43670111)**
