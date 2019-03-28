# BookSearch

This web application allows the user to search for cheapest books.
It's based on a template project: https://github.com/jonashackt/spring-boot-vuejs.

[screenshot]: https://raw.githubusercontent.com/whryniewski/booksearch/master/screenshot.png
![Screenshot of BookSearch][screenshot]

# Compile and Run

In order to build the project and execute tests, use command:
```shell
mvn clean install
```
In order to run:
```shell
mvn --project backend spring-boot:run
```

# Project details

Application works by communicating with certain API-s to find ISBN of a book and then uses this data to browse through
some Internet bookstores to find offers with the lowest price.


