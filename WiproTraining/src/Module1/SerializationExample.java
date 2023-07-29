package Module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
class Employee implements Serializable {
	private String name;
	private Date dateOfBirth;
	private String department;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Date dateOfBirth, String department, double salary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}


public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", new Date(), "IT", 50000.0);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(employee);
            System.out.println("Object saved to 'data' file successfully.");
        } catch (IOException e) {
            e.printStackTrace(); }
        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Deserialized object: " + deserializedEmployee);
        } catch (FileNotFoundException e) {
            System.err.println("File 'data' not found. Creating a new file.");
            try {
                File file = new File("data");
                if (file.createNewFile()) {
                    System.out.println("File 'data' created successfully.");
                } else {
                    System.err.println("Failed to create file 'data'.");
                }
            } catch (IOException ex) {
                ex.printStackTrace(); }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
