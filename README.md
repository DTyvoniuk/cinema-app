# Cinema app
A RESTful web app simulating a simple cinema service,
where user can buy tickets for a movie session with a specific movie, cinema hall and air time.
User can add multiple tickets to their shopping cart and finalize the order when ready.
Using Spring Security for the authentication and authorization of the user.
Here are some actions depending on the user's role (anonymous, admin, user):

### Anonymous:

- registration
- login

### With User role:

* get a list of all movies;
* get a list of cinema hall;
* get a list of avialable movie session;
* get a list of avialable movie session;
* add tickets to available movie session to your shopping cart;
* get tickets added to the shopping cart;
* complete the order;
* get order history;

### With Admin role:

* add a new cinema hall;
* get a list of cinema hall;
* add a new movies;
* get a list of all movies;
* add a new movie session;
* get a list of avialable movie session;
* upgrade movie session by id;
* delete movie session;
* get information about user by email;

## Technologies used

- Frameworks: Spring - Core / MVC / Web / Security
- ORM: Hibernate
- DB: MySQL
- Packaging - Apache Maven
- WebServer: Tomcat

## Configuration:

- Clone this project.
- Edit database information in the "db.properties" file to yours.
- Configure Tomcat.
- Run a project.
- You can test the API with the existing user with ADMIN and USER roles (login: user@gmail.com, password: 123) 
