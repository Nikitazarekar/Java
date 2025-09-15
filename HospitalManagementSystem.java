package HospitalManagementSystem;

import java.util.Scanner;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PatientDetails p=new PatientDetails();
		int ch;
		System.out.println("------Hospital Management System--------");
		do
		{

			System.out.println("1.Add Patient");
			System.out.println("2.Display All Patient");
			System.out.println("3.Search Patient by ID");
			System.out.println("4.Discharge Patient");
			System.out.println("5.Display Admitted Patients");
			System.out.println("6.Exit");
			
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				p.addPatient();
				break;
			case 2:
				p.displayAll();
				break;
			case 3:
				p.SearchById();
				break;
			case 4:
				p.DischargePatient();
				break;
			case 5:
				p.AdmittedPatient();
				break;
			case 6:
				System.out.println("Exiting....");
			
		}
	}while(ch!=6);
}


}
