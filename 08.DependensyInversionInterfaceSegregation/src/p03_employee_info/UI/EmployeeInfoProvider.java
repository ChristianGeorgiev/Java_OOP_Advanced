package p03_employee_info.UI;

import p03_employee_info.contracts.Database;
import p03_employee_info.models.Employee;
import p03_employee_info.contracts.InfoProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeInfoProvider implements InfoProvider {

    private Database database;

    public EmployeeInfoProvider(Database database) {
        this.database = database;
    }

    @Override
    public List<Employee> getEmployeesBy(Comparator<Employee> comparator) {
        return this.database.readEmployees().stream()
                .sorted(comparator::compare)
                .collect(Collectors.toList());
    }
}
