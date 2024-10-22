# springboot-multi-tenancy-with-PostgreSQL


[Spring Boot](http://projects.spring.io/spring-boot/) sample app to implement Dynamic Multi-tenancy with Postgres.\
This repository contains the code for the How to implement Multi-tenancy using PostgreSQL in a spring boot application.

## Approach
There are three main approaches to multi-tenant systems:

- Separate Database
- Shared Database and Separate Schema
- Shared Database and Shared Schema

Here I'm using Separate Database per tenant

## Requirements

For building and running the application you need:

- Java 1.8 + ( In this project Java 21 is used, which can be changed)
- Maven
- PostgreSQL

## Set up
- First create all the necessary tenants database in Postgres Server
- Then run the create table script for each tenant

## Running the application locally

There are several ways to run a Spring Boot application on your local machine.

* Execute the `main` method in the `in.debjitpan.postgreSqlmultitenancy.PostgreSqlMultitenancyApplication.class` class from your IDE.

## Multi-tenancy
Here, we are following, database per tenant in same cluster. There is a default tenant which will be used if you \
don't provide "X-TenantId" in header of API request.
