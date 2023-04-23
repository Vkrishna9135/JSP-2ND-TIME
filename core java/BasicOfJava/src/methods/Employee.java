package methods;

public class Employee {
	String name="MR.krishna";
	int empid=9999;
	void details() {
		System.out.println("name :"+name);
		System.out.println("empid :"+empid);
	}
	void dutyon() {
		String timein="10.30am";
		System.out.println("shift starts at "+timein);
	}
	void dutyoff() {
		String timeout="6.30pm";
		System.out.println("shift ending at "+timeout);
	}	
	void work() {
		System.out.println("Manufactoring");
	}
	/*public static void main(String[] args) {
		Employee e1=new Employee();
		e1.details();
		e1.dutyon();
		e1.work();
		e1.dutyoff();*/
	}


