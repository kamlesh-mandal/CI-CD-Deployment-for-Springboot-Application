package com.ecomerce.webapp;

public class Employee {
 
    public Employee() {
 
    }
 
    public Employee(Integer id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
  
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
 
    //Getters and setters
    public Integer getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getEmail() {
        return this.email;
    }

    public void setId(Integer id) {
        this.id= id;
    }

    public void setFirstName(String firstName) {
        this.firstName= firstName;
    }

    public void setLastName(String lastName) {
        this.lastName= lastName;
    }

    public void setEmail(String email) {
        this.email= email;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }
}
