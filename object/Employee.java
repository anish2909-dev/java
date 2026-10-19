package object;


import java.util.List;

public record Employee(String name, Integer salary, String department) {
    public  static List<Employee> getEmployeeList(){
        return List.of(
                new Employee("Albatross", 89000, "IT"),
                new Employee("Falcon", 95000, "HR"),
                new Employee("Eagle", 78000, "Finance"),
                new Employee("Dolphin", 85000, "IT"),
                new Employee("Panther", 92000, "Marketing"),
                new Employee("Wild Boar", 92000, "IT"),
                new Employee("Tiger", 88000, "Engineering")
        );
    }
}
