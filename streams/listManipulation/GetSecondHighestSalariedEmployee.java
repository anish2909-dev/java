/**
 * Another approach is using distinct,sorting,filter O(n log n)
 * Map based : O(n + k log k) since sorting is done for keys
 * Single pass algo : O(n)
 */
package streams.listManipulation;

import object.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetSecondHighestSalariedEmployee {
    public static void main(String[] args) {

        Map<Integer, List<Employee>> employeeGroupedBySalary = Employee.getEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::salary));

        Integer secondHighestSalary = employeeGroupedBySalary
                .keySet()
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(" List of Employee  "+ employeeGroupedBySalary.get(secondHighestSalary));



    }
}
