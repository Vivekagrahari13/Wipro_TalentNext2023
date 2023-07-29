package Module1;
//Vivek Agrahari
public class Employee1Test {
    public static void main(String[] args) {
        try {
            // Create an Employee object
            Employee1 originalEmployee = new Employee1("John Doe", 30, 50000.0);

            // Clone the Employee object
            Employee1 clonedEmployee = (Employee1) originalEmployee.clone();

            // Print the properties of both the original and clone objects
            System.out.println("Original Employee: " + originalEmployee);
            System.out.println("Cloned Employee: " + clonedEmployee);

            // Change the properties of the original Employee object
            originalEmployee.setName("Jane Doe");
            originalEmployee.setAge(35);
            originalEmployee.setSalary(60000.0);

            // Print the properties of both the original and clone objects again
            System.out.println("\nAfter Modification:");
            System.out.println("Original Employee: " + originalEmployee);
            System.out.println("Cloned Employee: " + clonedEmployee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
