# Java 
**🏥 Hospital Management System**

A Java-based console application designed to manage hospital patients effectively.
This system allows hospitals to add, view, search, and discharge patients, making patient record handling simple and efficient.

**✨ Features**

🔹 Add Patient → Register new patients with ID, Name, Age, and Disease.
🔹 Display All Patients → View complete patient details in the system.
🔹 Search Patient by ID → Quickly find a patient using their unique ID.
🔹 Discharge Patient → Remove a patient’s record once discharged.
🔹 Display Admitted Patients → View all patients currently admitted.
🔹 Exit → Safely exit the system.

**🛠️ Technologies Used**

Java (Core Java concepts like Classes, Objects, Arrays, Encapsulation)

OOP Principles (Encapsulation, Data Abstraction)

Scanner Class for user input

**📂 Project Structure**
HospitalManagementSystem/
│
├── HospitalManagementSystem.java   # Main class (menu-driven system)
├── Patient.java                     # Patient entity with attributes & methods
└── PatientDetails.java              # Handles patient operations (CRUD logic)

**🧑‍💻 How It Works**

The program starts with a menu-driven interface.

The user selects an option (Add, Search, Display, etc.).

The corresponding method in PatientDetails is called.

Patients are stored in an array of Patient objects.

The system updates dynamically when patients are added or discharged.

**🔑 Sample Output**
------Hospital Management System--------
1. Add Patient
2. Display All Patient
3. Search Patient by ID
4. Discharge Patient
5. Display Admitted Patients
6. Exit
Enter your choice: 


➡️ When you add a patient:

Enter Patient Id, Name, Age and Disease:
101 John 25 Fever
Patient Added Successfully


➡️ When you search by ID:

Enter ID: 
101
Found
Patient [id=101, name=John, age=25, disease=Fever, isAdmitted=false]


➡️ When you discharge a patient:

Enter Patient ID 
101
Patient Got Discharge Successfully
Thank You.. Take Care..


This project demonstrates the real-world application of Object-Oriented Programming (OOP) in Healthcare Systems.

Encapsulation → Patient data is stored inside the Patient class, accessed through getters & setters.

Abstraction → Complex operations like searching or discharging patients are abstracted in the PatientDetails class.

Arrays of Objects → Used to manage multiple patients efficiently.

Menu-driven console → Makes it interactive and user-friendly.
