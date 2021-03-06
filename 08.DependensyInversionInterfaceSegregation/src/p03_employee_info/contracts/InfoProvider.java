package p03_employee_info.contracts;


import p03_employee_info.models.Employee;

import java.util.Comparator;
import java.util.List;

public interface InfoProvider {
    Iterable<Employee> getEmployeesBy(Comparator<Employee> comparator);

}
