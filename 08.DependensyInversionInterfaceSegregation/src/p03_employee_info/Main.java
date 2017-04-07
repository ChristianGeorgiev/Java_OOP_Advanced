package p03_employee_info;

import p03_employee_info.DB.EmployeeDatabase;
import p03_employee_info.UI.ConsoleClient;
import p03_employee_info.UI.ConsoleFormatter;
import p03_employee_info.UI.EmployeeInfoProvider;
import p03_employee_info.contracts.Database;
import p03_employee_info.contracts.Formatter;
import p03_employee_info.contracts.InfoProvider;
import p03_employee_info.models.Employee;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Database db = new EmployeeDatabase();

        InfoProvider provider = new EmployeeInfoProvider(db);
        Formatter formatter = new ConsoleFormatter();

        ConsoleClient consoleClient = new ConsoleClient(provider, formatter);

        System.out.println(consoleClient.getResult(Comparator.comparing(Employee::getName)));
    }
}
