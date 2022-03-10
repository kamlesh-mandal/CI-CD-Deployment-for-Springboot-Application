package com.ecomerce.webapp;

import org.springframework.stereotype.Repository;
 
import com.ecomerce.webapp.Employee;
import com.ecomerce.webapp.Employees;
 
@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "lokeshgupta@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "alex@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "david@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Nisha", "Singh", "nisha@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
