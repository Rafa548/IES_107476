package ies.lab3.restapp.Services;

import lombok.AllArgsConstructor;

import ies.lab3.restapp.Model.Employee;
import ies.lab3.restapp.Repository.EmployeeRepo;
import ies.lab3.restapp.Services.EmployeeService;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(employeeId);
        return optionalEmployee.get();
    }

    @Override
    public Employee getEmployeeByEmail(String employeeEmail) {
        Optional<Employee> optionalEmployee = employeeRepo.findByEmail(employeeEmail);
        return optionalEmployee.get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepo.findById(employee.getId()).get();
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        Employee updatedEmployee = employeeRepo.save(existingEmployee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepo.deleteById(employeeId);
    }
}