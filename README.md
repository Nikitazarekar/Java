                                                    ## Java 


# Hospital Management System

## Project Overview

This project is a **Hospital Management System** implemented in Java.
It allows managing patient information efficiently in a hospital setting.
Users can **add, search, discharge, and display patients** using a simple console interface.
The system demonstrates **object-oriented programming concepts** like classes, objects, and encapsulation.
It is designed to be **easy to use and understand** for beginners learning Java.

## Features

* Add new patients with details like **ID, Name, Age, and Disease**.
* Display a **list of all patients** in the hospital.
* Search for a patient using their **unique ID**.
* Discharge a patient and remove them from the system.
* Display **currently admitted patients** at any given time.

## Classes and Methods

* **Patient (Class)**: Stores patient information with methods to access and modify data.
* **PatientDetails (Class)**: Manages an array of Patient objects with methods like `addPatient()`, `displayAll()`, `SearchById()`, `DischargePatient()`, and `AdmittedPatient()`.
* **HospitalManagementSystem (Class)**: Contains the `main` method and provides a **menu-driven interface** for user interaction.
* Demonstrates **encapsulation** by using private attributes with getters and setters.
* Uses **arrays** to store patient objects and keeps track of the total count.

## How to Use

1. Run the `HospitalManagementSystem` class to start the application.
2. Use the menu to **add new patients**, display all patients, search by ID, or discharge a patient.
3. Enter the **required patient details** when prompted.
4. Select the **appropriate option** to view admitted patients or exit the system.
5. The system will show messages confirming actions like **patient added** or **discharged successfully**.

## Sample Output

```
------Hospital Management System--------
1.Add Patient
2.Display All Patient
3.Search Patient by ID
4.Discharge Patient
5.Display Admitted Patients
6.Exit
Enter your choice: 
1
Enter Patient Id,Name,age and disease:
101 John 25 Fever
Patient Added Successfully

Enter your choice:
2
Patient [id=101, name=John, age=25, disease=Fever, isAdmitted=false]

Enter your choice:
3
Enter ID
101
Found
Patient [id=101, name=John, age=25, disease=Fever, isAdmitted=false]
```

## Learning Outcomes

* Understand **object-oriented programming** with a real-world example.
* Learn **array management** and dynamic object storage in Java.
* Practice creating **menu-driven console applications**.
* Understand **encapsulation and data access** using getters and setters.
* Gain experience in **handling basic operations** like add, search, and delete in a system.


-----------------------------------------------------------------------------------------------------------------------------------

##🏬 Shop Management System

A simple Java console-based application to manage shop inventory.
This system allows users to add, search, update, delete, and display products along with calculating the total inventory value.

##✨ Features

✅ Add new products with ID, Name, Price, and Quantity
✅ Display all products neatly
✅ Search product by ID
✅ Update product quantity easily
✅ Remove product from inventory by ID
✅ Calculate total inventory value in real-time
✅ Simple menu-driven interface for smooth navigation

##🛠️ Tech Stack

Language: Java

Concepts Used:

Classes & Objects

Encapsulation (getters & setters)

Arrays

Loops & Conditional Statements

User Input with Scanner

##📂 Project Structure
lab5/
│
├── Product.java              # Product class with attributes and methods
├── Shop.java                 # Shop class with product management logic
└── ShopManagementSystem.java # Main menu-driven program

##🚀 How to Run

Clone or download the project.

Open in any Java IDE (Eclipse, IntelliJ, or VS Code).

Compile all .java files.

Run ShopManagementSystem.java.

Use the menu to interact with the shop system.

##🖥️ Sample Menu
---- Shop Menu ----
1. Add Product
2. Delete Product by ID
3. Search Product by ID
4. Update Product Quantity
5. Display all Product
6. Total Inventory Value
7. Exit
Enter your choice: 

##📊 Example Output
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
----------------------------------------------------------------------------------------------------------------------------

**# Bank Management System**

## Project Overview

This project is a simple **Bank Management System** implemented in Java.
It demonstrates the use of **interfaces**, **classes**, **polymorphism**, and **method overriding**.
The system supports two types of bank accounts: **Saving Account** and **Fixed Deposit Account**.
Users can perform basic operations like **deposit**, **withdraw**, and **calculate interest**.
It helps understand **OOP concepts in Java** with a practical, real-world example.

## Features

* Create and manage **Saving Accounts** and **Fixed Deposit Accounts**.
* **Deposit money** into an account.
* **Withdraw money** with a check for sufficient balance.
* **Calculate interest** automatically based on account type.
* Display account details in a **clear and user-friendly format**.

## Classes and Interface

* **BankAccount (Interface)**: Declares common methods like `calInterest()` and `display()`.
* **SavingAccount (Class)**: Implements `BankAccount` for a savings account with 4% interest.
* **FixDeposite (Class)**: Implements `BankAccount` for a fixed deposit account with 7% interest.
* **Tester (Class)**: Contains the `main` method to demonstrate functionality.
* Demonstrates **polymorphism** by using interface references for different account objects.

## How to Use

1. Create objects of `SavingAccount` or `FixDeposite` using the constructor.
2. Use `deposite(amount)` to add money to the account.
3. Use `withdraw(amount)` to remove money (balance must be sufficient).
4. Call `calInterest()` to calculate interest for the account.
5. Call `display()` to show account details and interest.

## Sample Output

```
Account holder Name: ABC
Account No: 1001
Interest rate: 400.0
5000 deposited successfully !

Account holder Name: PQR
Account No: 2001
Interest rate: 1750.0
Insufficient funds
```

* For **SavingAccount**, the interest is calculated as `balance * 0.04`.
* For **FixDeposite**, the interest is calculated as `balance * 0.07`.
* Withdrawals check for sufficient balance to avoid negative amounts.

## Learning Outcomes

* Understand **interfaces and their implementation** in Java.
* Learn **method overriding** and polymorphism with real-world examples.
* Practice **basic banking operations** programmatically.
* Understand **interest calculation logic** for different account types.
* Gain experience in writing **modular and maintainable code**.



