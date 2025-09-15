package HospitalManagementSystem;

import java.util.Scanner;

public class PatientDetails {
		
	Scanner sc=new Scanner(System.in);
	Patient p[];
	   static int patientCount;
	   public PatientDetails()
	   {
		   p=new Patient[100];
		   patientCount=0;
	   }
	   
	   public void addPatient()
	   {
		   System.out.println("Enter Patient Id,Name,age and disease:");
		   int id=sc.nextInt();
		   String name=sc.next();
		   int age=sc.nextInt();
		   String disease=sc.next();
		   p[patientCount]=new Patient(id, name, age, disease);
		   patientCount++;
		   System.out.println("Patient Added Successfully");
		   
	   }
	   public void displayAll()
	   {
		   for(int i= 0 ; i<patientCount;i++)
		   {
			   System.out.println(p[i].toString());
		   }
	   }
	   public void SearchById()
	   {
		   System.out.println("Enter ID ");
		   int id=sc.nextInt();
		   for(int i=0;i<patientCount;i++)
		   {
			   if(p[i].getId()==id)
			   
				   System.out.println("Found");
				   System.out.println(p[i].toString());
				   return;
			   }
		   
			   System.out.println("Not found");
		 }
		   
		   
	   public void DischargePatient()
	   {
		   System.out.println("Enter Patient ID ");
		   int id=sc.nextInt();
		   for(int i =0;i<patientCount;i++)
		   {
			   if(p[i].getId()==id)
			   {
				   for(int j=1;j<patientCount;j++)
				   {
					   p[j]=p[j+1];
				   }
				   p[patientCount-1]=null;
				   patientCount--;
				   System.out.println("Patient Got Discharge Sucessfully\nThank You.. Take Care..");
				   return;
			   }
			   System.out.println("Patient Id Not Availabele ");
		   }
		   
	   }
	   public void AdmittedPatient()
		{
			for(int i=0;i<patientCount;i++)
			{
				System.out.println(p[i].toString());
			}
		}

}
