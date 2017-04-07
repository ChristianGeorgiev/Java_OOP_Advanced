package p03_employee_info.DB;


import p03_employee_info.contracts.Database;
import p03_employee_info.models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabase implements Database {


    public List<Employee> readEmployees(Employee... employeeInput) {
        List<Employee> employees = new ArrayList<>();
        Collections.addAll(employees, employeeInput);
        return employees;
    }
}
