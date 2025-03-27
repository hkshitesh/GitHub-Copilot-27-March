package com.example.employeeapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service class for managing employee records.
 */
@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();
    private int nextId = 3; // To assign unique IDs, starting after the sample data

    /**
     * Initializes the service with sample employee data.
     */
    public EmployeeService() {
        employees.add(new Employee(1, "John Doe", "Engineering", "john.doe@example.com"));
        employees.add(new Employee(2, "Jane Smith", "Marketing", "jane.smith@example.com"));
    }

    /**
     * Retrieves all employees.
     *
     * @return a list of all employees
     */
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param id the ID of the employee to retrieve
     * @return an Optional containing the employee if found, or empty if not found
     */
    public Optional<Employee> getEmployeeById(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst();
    }

    /**
     * Adds a new employee to the list, assigning a unique ID.
     *
     * @param name       the name of the new employee
     * @param department the department of the new employee
     * @param email      the email address of the new employee
     * @return the newly added employee
     */
    public Employee addEmployee(String name, String department, String email) {
        Employee newEmployee = new Employee(nextId++, name, department, email);
        employees.add(newEmployee);
        return newEmployee;
    }
}
