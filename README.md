# NimapJavaMachineTest

## Table of Contents

- [Java Machine Test](#project-title)
- [Below requirements need to be implemented in machine tests.


A) Use Spring boot

B) Use Rest controller

C) Need DB configuration (Use RDB instead of in-memory)

D) Use annotation based configuration (Not XML).

E) JPA & Hibernate

 

1) Category CRUD operation.




# APIs Required to be Developed

## Categories

| #  | API URL                                          | Description                   |
|----|--------------------------------------------------|-------------------------------|
| 1  | http://localhost:8080/api/categories?page=3     | GET all the categories         |
| 2  | http://localhost:8080/api/categories             | POST - create a new category   |
| 3  | http://localhost:8080/api/categories/{id}        | GET category by Id             |
| 4  | http://localhost:8080/api/categories/{id}        | PUT - update category by id    |
| 5  | http://localhost:8080/api/categories/{id}        | DELETE - Delete category by id |

## Products

| #  | API URL                                          | Description                   |
|----|--------------------------------------------------|-------------------------------|
| 1  | http://localhost:8080/api/products?page=2       | GET all the products           |
| 2  | http://localhost:8080/api/products               | POST - create a new product    |
| 3  | http://localhost:8080/api/products/{id}          | GET product by Id              |
| 4  | http://localhost:8080/api/products/{id}          | PUT - update product by id     |
| 5  | http://localhost:8080/api/products/{id}          | DELETE - Delete product by id  |



3) Relation between Category-Products should have one-to-many relation. (One category can have multiple products).

4) Machine test should have Server side pagination.

5) While fetching single product details the response should be populated with respective category details.
