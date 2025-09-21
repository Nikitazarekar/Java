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

Absolutely! Here’s a **user-friendly README** for your project, which combines both the **Bank Management System** and **Shop Management System**. Each section has a brief, 5-line explanation.

---

# Java Management Systems

This project contains two small management systems implemented in Java:

1. **Bank Management System** – to manage different types of bank accounts.
2. **Shop Management System** – to manage products in a shop inventory.
   Both systems are **menu-driven console applications** demonstrating OOP concepts.
   The project is designed to be **easy to understand and practical** for beginners learning Java.

---

## Bank Management System

### Project Overview

This module simulates a bank environment with two account types: **Saving Account** and **Fixed Deposit**.
Users can **deposit, withdraw, and calculate interest** for each account.
The system uses **interfaces, classes, and polymorphism** to structure the code.
It demonstrates **method overriding** to calculate interest differently for each account type.
The `Tester` class shows **practical usage** of these accounts using an example.

### Classes and Interface

* **BankAccount (Interface)** – Declares methods `calInterest()` and `display()`.
* **SavingAccount** – Implements BankAccount for savings accounts with 4% interest.
* **FixDeposite** – Implements BankAccount for fixed deposit accounts with 7% interest.
* **Tester** – Demonstrates adding money, calculating interest, and withdrawals.
* Illustrates **polymorphism** by using an interface reference for multiple account types.

### Sample Output

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

### Learning Outcomes

* Learn **interfaces and their implementation** in Java.
* Understand **method overriding and polymorphism**.
* Perform **basic banking operations programmatically**.
* Calculate interest dynamically based on account type.
* Practice writing **modular and maintainable code**.

-------------------------------------------------------------------------------------------------------------------

## Shop Management System

### Project Overview

This module manages a **shop’s inventory of products**.
Users can **add, delete, search, and update products**, and calculate total inventory value.
It demonstrates **object-oriented programming concepts** like classes, objects, and encapsulation.
The system stores products in an **array** and uses **menu-driven operations** for interaction.
It’s a practical example for understanding inventory management using Java.

### Classes and Methods

* **Product** – Represents each product with id, name, quantity, and price.
* **Shop** – Manages an array of products with methods for CRUD operations and inventory value.
* **ShopManagementSystem** – Contains `main()` with a menu-driven interface for user interaction.
* Shows **encapsulation** using private fields and public getters/setters.
* Demonstrates **basic array manipulation** and simple calculations.

### Sample Output


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
101 Apple 50 10.5
Product added successfully

Enter your choice: 5
Product [id=101, name=Apple, qty=50, price=10.5]
Total Inventory value: 525.0
```

### Learning Outcomes

* Understand **object-oriented programming** with real-world examples.
* Learn **array management** for storing and manipulating multiple objects.
* Create **menu-driven console applications**.
* Understand **encapsulation** and object data handling.
* Calculate **inventory values and perform CRUD operations**.


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



