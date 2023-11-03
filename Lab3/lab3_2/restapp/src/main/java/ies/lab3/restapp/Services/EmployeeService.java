package ies.lab3.restapp.Services;

import ies.lab3.restapp.Model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    Employee getEmployeeByEmail(String employeeEmail);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long employeeId);
}