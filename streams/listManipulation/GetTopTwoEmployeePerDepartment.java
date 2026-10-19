package streams.listManipulation;

import object.Employee;

import java.util.stream.Collectors;

public class GetTopTwoEmployeePerDepartment {
    public static void main(String[] args) {
        Employee.getEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::salary,
                                               Collectors.collectingAndThen(Collectors.toList(),
                                                                            list -> list.stream()
                                                                                    .limit(2)
                                                                                    .toList())));
    }
}
