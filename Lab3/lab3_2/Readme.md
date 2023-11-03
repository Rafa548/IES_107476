# Lab 3.2 

API for a simple employee management system.

These are the six controller handler methods created:

- **Get all employees**
    - Method: GET
    - Endpoint: `http://localhost:8080/api/employees`
    - Description: Retrieve a list of all employees.

- **Get employee by id**
    - Method: GET
    - Endpoint: `http://localhost:8080/api/employees/{id}`
    - Description: Retrieve an employee by their unique ID.

- **Get employee by email**
    - Method: GET
    - Endpoint: `http://localhost:8080/api/employees?email={email}`
    - Description: Retrieve an employee by their email address.

- **Add new employee**
    - Method: POST
    - Endpoint: `http://localhost:8080/api/employees`
    - Description: Add a new employee to the system.

- **Update employee**
    - Method: PUT
    - Endpoint: `http://localhost:8080/api/employees/{id}`
    - Description: Update an existing employee's information.

- **Delete employee**
    - Method: DELETE
    - Endpoint: `http://localhost:8080/api/employees/{id}`
    - Description: Delete an employee from the system.

## **Creating the project**
*Spring Initializr* was used with the following configuration:
![Methods](assets/config.png?raw=true "Methods")

## **Project structure**
* Controller (*EmployeeController*)
* Repository (*EmployeeRepo*)
* Model (*Employee*)
* Services (*EmployeeService* and *EmployeeServiceImpl*)

## **API testing usinhg Postman**

<div align="center">

### Adding a new employee to the database:
![post](assets/post.png?raw=true "post1")

### Get a specific employee given by id:
![getbyid](assets/getbyid.png?raw=true "getbyid")

### Get a specific employee given by email:
![getbyemail](assets/getbyemail.png?raw=true "getbyemail")

### Get all employees:
![getall](assets/getall.png?raw=true "getall")

### Updating a specific employee given by id:
![update](assets/update.png?raw=true "update")

### Delete a specific employee given by id:
![delete](assets/delete.png?raw=true "delete")

</div>