# E-Commerce-SpringBoot-Backend

## E-R Diagram for the application

![E-R Diagram](./ER%20Diagram/E-Commerce%20API%20ER%20Diagram.jpeg?raw=true)

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

## Modules

* Login, Logout Module
* Seller Module
* Customer Module
* Product Module
* Cart Module
* Order Module

## Features

* Customer and Seller authentication & validation with session token having validity of 1 hour for security purposes
* Seller Features:
    * Administrator Role of the entire application
    * Only registered seller with valid session token can add/update/delete products from main database
    * Seller can access the details of different customers, orders
* Customer Features:
    * Registering themselves with application, and logging in to get the valid session token
    * Viewing different products and adding them to cart and placing orders
    * Only logged in user can access his orders, cart and other features.
