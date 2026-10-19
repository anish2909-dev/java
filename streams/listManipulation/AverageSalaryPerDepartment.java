package streams.listManipulation;

import object.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryPerDepartment {
    public static void main(String[] args) {
       Map<String, Double> averageSalaryMap = Employee.getEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::department,
                                               Collectors.collectingAndThen(Collectors.toList(),
                                                                            employees -> employees.stream()
                                                                                    .mapToInt(Employee::salary)
                                                                                    .average().orElse(0.0))));
    }
}
