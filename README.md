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
-----------------------------------------------------------------------------------------------------------------------------------

**🏬 Shop Management System**

A simple Java console-based application to manage shop inventory.
This system allows users to add, search, update, delete, and display products along with calculating the total inventory value.

**✨ Features**

✅ Add new products with ID, Name, Price, and Quantity
✅ Display all products neatly
✅ Search product by ID
✅ Update product quantity easily
✅ Remove product from inventory by ID
✅ Calculate total inventory value in real-time
✅ Simple menu-driven interface for smooth navigation

**🛠️ Tech Stack**

Language: Java

Concepts Used:

Classes & Objects

Encapsulation (getters & setters)

Arrays

Loops & Conditional Statements

User Input with Scanner

**📂 Project Structure**
lab5/
│
├── Product.java              # Product class with attributes and methods
├── Shop.java                 # Shop class with product management logic
└── ShopManagementSystem.java # Main menu-driven program

**🚀 How to Run**

Clone or download the project.

Open in any Java IDE (Eclipse, IntelliJ, or VS Code).

Compile all .java files.

Run ShopManagementSystem.java.

Use the menu to interact with the shop system.

**🖥️ Sample Menu**
---- Shop Menu ----
1. Add Product
2. Delete Product by ID
3. Search Product by ID
4. Update Product Quantity
5. Display all Product
6. Total Inventory Value
7. Exit
Enter your choice: 

**📊 Example Output**
---- Shop Menu ----
1. Add Product
2. Delete Product by ID
3. Search Product by ID
4. Update Product Quantity
5. Display all Product
6. Total Inventory Value
7. Exit
Enter your choice: 1
Enter product id,name ,price and quantity
101 Mobile 15000 5

---- Shop Menu ----
Enter your choice: 1
Enter product id,name ,price and quantity
102 Laptop 55000 2

---- Shop Menu ----
Enter your choice: 5
Product [id=101, name=Mobile, qty=5, price=15000.0]
Product [id=102, name=Laptop, qty=2, price=55000.0]

---- Shop Menu ----
Enter your choice: 3
Enter ID:
102
Found
Product [id=102, name=Laptop, qty=2, price=55000.0]

---- Shop Menu ----
Enter your choice: 4
Enter Id:
101
Enter Quantity
10
Quantity updated successfully

---- Shop Menu ----
Enter your choice: 6
Total Inventory value: 305000.0

---- Shop Menu ----
Enter your choice: 2
Enter the ID:
101
Product removed successfully

---- Shop Menu ----
Enter your choice: 5
Product [id=102, name=Laptop, qty=2, price=55000.0]

---- Shop Menu ----
Enter your choice: 7
Exiting..

