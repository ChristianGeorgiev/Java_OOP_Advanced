package p03_employee_info.UI;

import p03_employee_info.contracts.Database;
import p03_employee_info.DB.EmployeeDatabase;
import p03_employee_info.contracts.Formatter;
import p03_employee_info.contracts.InfoProvider;
import p03_employee_info.models.Employee;

import java.util.Comparator;

public class ConsoleClient {
    private InfoProvider provider;
    private Formatter formatter;

    public ConsoleClient(InfoProvider provider, Formatter formatter){
        this.provider = provider;
        this.formatter = formatter;
    }

    public String getResult(Comparator<Employee> comparator){
        return this.formatter.format(this.provider.getEmployeesBy(comparator));
    }



}
