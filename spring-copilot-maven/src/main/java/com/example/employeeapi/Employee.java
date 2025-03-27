package com.example.employeeapi;

/**
 * Represents an Employee with an ID, name, department, and email.
 */
public class Employee {
    private int id;
    private String name;
    private String department;
    private String email;

    /**
     * Constructs an Employee with the specified details.
     *
     * @param id         the unique identifier of the employee
     * @param name       the name of the employee
     * @param department the department of the employee
     * @param email      the email address of the employee
     */
    public Employee(int id, String name, String department, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    /**
     * Gets the ID of the employee.
     *
     * @return the employee's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the employee.
     *
     * @param id the new ID of the employee
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the employee.
     *
     * @return the employee's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name the new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the department of the employee.
     *
     * @return the employee's department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the employee.
     *
     * @param department the new department of the employee
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the email address of the employee.
     *
     * @return the employee's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the employee.
     *
     * @param email the new email address of the employee
     */
    public void setEmail(String email) {
        this.email = email;
    }
}