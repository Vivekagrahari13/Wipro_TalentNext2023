public class Project1 {
	static private int EmpNo[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
	static private String EmpName[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
	static private String JoinDate[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005",
			"1/1/2000", "12/06/2006" };
	static private char DesignationCode[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
	static private String Department[] = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
	static private int Basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
	static private int HRA[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
	static private int IT[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };

	public static int cal_DA(int i) {
		char des = DesignationCode[i];
		switch (des) {
		case 'e':
			return 20000;
		case 'c':
			return 32000;
		case 'k':
			return 12000;
		case 'r':
			return 15000;
		case 'm':
			return 40000;
		}
		return 0;
	}

	public static int getIndex(int id) {
		for (int i = 0; i < 7; i++) {
			if (EmpNo[i] == id)
				return i;
		}
		return -1;
	}

	public static boolean employeeExist(int id) {
		return getIndex(id) == -1;
	}

	public static String getEmpName(int id) {
		return EmpName[getIndex(id)];
	}

	public static String getDepart(int id) {
		return Department[getIndex(id)];
	}

	public static String getDesignation(int id) {
		char desCode = DesignationCode[getIndex(id)];
		switch (desCode) {
		case 'e':
			return "Engineer";
		case 'c':
			return "Consultant";
		case 'k':
			return "Clerk";
		case 'r':
			return "Receptionist";
		case 'm':
			return "Manager";
		}
		return " ";
	}

	public static int getEmpSalary(int id) {
		int ind = getIndex(id);
		return (Basic[ind] + HRA[ind] + cal_DA(ind) - IT[ind]);
	}

	public static void main(String[] args) {
		if (args.length == -1) {
			System.out.println("Usage Code");
		}
		int id = Integer.parseInt(args[0]);
		if (employeeExist(id)) {
			System.out.println("There is no employee with empid: " + id);
		} else {
			System.out.println("EmpNo: " + id);
			System.out.println("EmpName: " + getEmpName(id));
			System.out.println("Department: " + getDepart(id));
			System.out.println("Designation: " + getDesignation(id));
			System.out.println("Salary: " + getEmpSalary(id));
		}

	}
}