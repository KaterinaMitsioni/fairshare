
# Spring Boot Local Server Application



## Overview



This project represents a Spring Boot server application hosted locally, designed to fulfill a specific use case as part of a larger application.


## Utilizes


- Spring Boot

- JavaFX

- H2


## Set up and Build

1. **Clone the repository:**

    ```bash
    git clone https://github.com/KaterinaMitsioni/fairshare
    ```


2. **Navigate to the project resources:**

    ```bash
    cd fairshare/src/main/resources
    ```




2. **Open [application.properties](gui/src/main/resources/application.properties) file in a text editor**



4. **Customize the configurations to your liking**

	- provide configurations for
	  `spring.datasource.username`
	  and
	   `spring.datasource.password`
	- The same credentials can be used later to access the data in http://localhost:8080/h2-console

	- After setting your desired username and password for the embedded database, it should look something like this:


	```
	spring.datasource.driverClassName=org.h2.Driver

	spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

	spring.h2.console.enabled=true

	spring.datasource.url=jdbc:h2:mem:testdb

	spring.datasource.username=your_username

	spring.datasource.password=your_password
	```
3. **Build the project :**

    ```bash
    mvn clean install
    ```

4. **Run the application:**

    ```bash
    java -jar target/fairshare-0.0.1-SNAPSHOT.jar
    ```

5. **Show in a browser:**
	URL : http://localhost:8080/history/1


## Use Case


The use case involves retrieving and displaying all payments based on the user ID.
