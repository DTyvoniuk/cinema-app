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

* <b>GET /movies</b> get a list of all movies;
* <b>GET /cinema-halls</b> get a list of cinema hall;
* <b>GET /movie-sessions/available</b> get a list of available movie session;
* <b>PUT shopping-carts/movie-sessions</b> add tickets to available movie session to your shopping cart;
* <b>GET /shopping-carts/by-user</b> get tickets added to the shopping cart;
* <b>POST /orders/complete</b> complete the order;
* <b>GET /orders</b> get order history;

### With Admin role:

* <b>POST /cinema-halls</b> movie add a new cinema hall;
* <b>GET /cinema-halls</b> get a list of cinema hall;
* <b>POST /movies</b> add a new movie;
* <b>GET /movies</b> get a list of all movies;
* <b>POST movie-sessions</b> add a new movie session;
* <b>GET /movie-sessions/available</b> get a list of available movie session;
* <b>PUT /movie-sessions/{id}</b> upgrade movie session by id;
* <b>DELETE /movie-sessions/{id}</b> delete movie session;
* <b>GET /users/by-email</b> get information about user by email;

## Technologies used

- Frameworks: Spring - Core / MVC / Security
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
