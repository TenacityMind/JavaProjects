Bank Account Management System

The Bank Account Management System is a beginner-level Java project designed to demonstrate core Object-Oriented Programming (OOP) concepts, UML-based design, and basic design patterns. This project simulates a simple banking system where users can create accounts, perform transactions, and manage account details.

1. **Understand the Requirements
Features:**
Create accounts for customers.
Perform transactions: deposit, withdraw, and view balance.
Maintain account details (e.g., account number, holder's name, balance).
Concepts to include:
OOP: Classes, inheritance, encapsulation.
Design Patterns: Singleton (for a central Bank instance managing all accounts).
UML: Design a class diagram before coding.

2. **Plan the Design:**
Identify classes and relationships:
Account (base class):
Attributes: accountNumber, accountHolderName, balance.
Methods: deposit(), withdraw(), viewBalance().
SavingsAccount and CurrentAccount (subclasses of Account).
Bank (Singleton class to manage all accounts).
Create UML Diagrams:
Class Diagram:
Show relationships between Bank, Account, and its subclasses.
Sequence Diagram (optional):
Represent the process of creating an account or performing a transaction.

3. **Implement the Code:**
The Bank Account Management System requires implementing multiple Java classes, following Object-Oriented Programming (OOP) principles. Below is a detailed explanation of how to implement the system step by step.

📌 Step 1: Create the Base Account Class

The Account class is the base (abstract) class that represents a general bank account. All common attributes and behaviors of bank accounts should be defined here.

🔹 What This Class Does
Defines common attributes: accountNumber, accountHolderName, balance.
Provides methods for deposit(), withdraw(), and viewBalance().
Uses encapsulation (private/protected fields with getters).
Declares withdraw() as abstract so subclasses (SavingsAccount, CurrentAccount) can implement it differently.

📌 Step 2: Implement Subclasses (SavingsAccount, CurrentAccount)

Each subclass represents a specific type of bank account.

🔹 SavingsAccount (With Interest Calculation)
Inherits from Account.
Implements withdraw(): Only allows withdrawal if there are sufficient funds.
Adds calculateInterest() method.

🔹 CurrentAccount (With Overdraft)
Inherits from Account.
Implements withdraw(): Allows overdraft up to a limit.
Adds applyOverdraft() method.

📌 Step 3: Implement the Bank Class

The Bank class acts as a centralized system for:

Managing account creation.
Storing accounts in a data structure (HashMap).
Retrieving accounts using an account number.
🔹 Key Features
Implements the Singleton Pattern (Only one Bank instance manages all accounts).
Uses a HashMap<Integer, Account> to map account numbers to Account objects.
Provides methods to:
createAccount()
getAccount()

📌 Step 4: Implement the Main Class (User Interaction)

Provides a menu-driven CLI for users.
Uses Scanner for user input.
Calls methods from the Bank class.

