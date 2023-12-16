# Super-fields error reproducer

## Issue description

Running the app in dev mode with super-fields version 0.19.0 (or version 0.18.3), Vaadin version 24.3.0 and Quarkus
3.3.0 leads to
Javascript errors and
the fields are not rendered. When running the app in prod mode everything works.

## Reproduce

To reproduce run the app with ```quarkus:dev``` go to http://localhost:8080/
Errors are present in the console.

Running the app in production mode does not result in the errors and everything works as expected.

To run app in prod mode locally :
``mvn package -Pproduction``
and then
``java -jar target/quarkus-app/quarkus-run.jar``

## Javascript errors thrown in dev mode

- ``Uncaught TypeError: Cannot set properties of undefined (setting 'inputMode')``
- ``Uncaught TypeError: $0.preventInvalidInput is not a function``
- ``Uncaught TypeError: $0.setCallingServer is not a function``


