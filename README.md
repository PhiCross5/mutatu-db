# mutatu-db
### database of mobile games
This Spring Boot - based application is meant to handle listing, cherry-picking and filtering mobile games.
Instead of crawling aimlessly through your respective appstore, you can search for games by many criteria, ranging from 
date of release to parts of the name to genres, tags, framerate, even authors!
Ever wanted another game your favourite musician composed for? You'll find it here! 
### WARNING: VERY EARLY STATE
All those advanced filtering capabilities are just a sales pitch for now. You may increment the code to do them but right now only the bare minimum stands:
* **List games:** title, name and link to whatever page lets you download the game.
* **Add game entries:** if it's not in the list, `POST` it to the server so everyone can find it
* **Remove game entries:** the game could be a hoax or just not allowed as per mutatu policies. Yeet it out of existance by `DELETE`-ing at its link.

### How do i run this?
You need to set a few spring application properties:
* Set up your database: the JPA backend does most of the work, just point it to your database with the credentials.
  * `spring.datasource.url` = URL to your postgres database (e.g. `postgres://data.yaichao.com.br:5432/postgres`)
  * `spring.datasource.username`
  * `spring.datasource.password`
  * **HINT:** setting these on the file `/application.properties` might accidentaly leak into source control to the net.
  Try setting as environment variables like `SPRING_DATASOURCE_PASSWORD` instead.
* Set user and password: if left at default, you'll have to copy and paste the password from the console (if it's even available)
  * `spring.security.user.password` is your password.
  * `spring.security.user.name` is your name.
friendly reminder: 
## DON'T PUT YOUR PASSWORDS ON VERSION-CONTROLLED FILES!
Just to be sure, **don't save anything secret on the project's folder**. Don't wanna get doxxed or pwned by random fellas on the net, do you?
