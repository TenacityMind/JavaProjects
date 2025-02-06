# UML Diagrams for Bank Account Management System

This folder contains the UML diagrams for the Bank Account Management System project. These diagrams illustrate the system's design, showcasing its structure and interactions between different components.

### 1.Use Case Diagram

The Use Case Diagram illustrates the primary interactions between the user and the system. It provides an overview of the system's functionality by defining the roles (actors) and the use cases (functionalities) they can access.

Actors:

User: Represents the customer interacting with the system to manage their bank account.

#### Use Cases:

**Create Account:** Enables the user to create a new bank account.
**Deposit Money:** Allows the user to add funds to their account.
**Withdraw Money:** Allows the user to withdraw money, provided there is sufficient balance.
**View Balance:** Enables the user to check the current balance of their account.

#### Key Insights:

Each use case is independent, and the user can access them directly.
The diagram showcases the modularity of the system and highlights its core functionalities.

#### Diagram Files and Code Draw.io Diagram:

The Use Case Diagram was created using Draw.io (diagrams.net).
File Name: UseCaseDiagram.drawio
Location: diagrams/UseCaseDiagram.drawio
Exported as: UseCaseDiagram.png (viewable in the diagrams folder).

PlantUML Code:
The Use Case Diagram can also be generated using PlantUML.
File Name: UseCaseDiagram.puml
Location: diagrams/UseCaseDiagram.puml
To render the diagram:
Use a PlantUML-supported tool (e.g., IntelliJ, Visual Studio Code, or PlantUML Online).
Execute the .puml file to generate the diagram.

### 2.Class Diagram
The Class Diagram represents the static structure of the Bank Account Management System. It defines the classes in the system, their attributes, methods, and the relationships between them.

#### Key Classes:

**Bank:** Manages all accounts in the system. Provides methods to create accounts and retrieve account details.

**Account:** Serves as the base class for all account types. Defines common attributes like accountNumber, accountHolderName, and balance. Includes methods for deposit, withdrawal, and viewing balance.

**SavingsAccount:** A specialized account that inherits from Account. Includes additional attributes such as interestRate and methods like calculateInterest().

**CurrentAccount:** A specialized account that inherits from Account. Includes additional attributes such as overdraftLimit and methods like applyOverdraft(). 

#### Relationships:

Bank ↔ Account: Type: Association (one-to-many).
Explanation: A Bank manages multiple Account objects.

Account ↔ SavingsAccount/CurrentAccount: Type: Inheritance (generalization).
Explanation: SavingsAccount and CurrentAccount inherit from the base Account class.

#### Diagram Files
The Use Case Diagram was created using Draw.io (diagrams.net).
File Name: BAM_ClassDiagram.drawio.png
Location: diagrams/BAM_ClassDiagram.drawio.png


PlantUML Code:
The Use Case Diagram can also be generated using PlantUML.
File Name: BAM_ClassDiagram.puml
Location: diagrams/BAM_ClassDiagram.puml
To render the diagram:
Use a PlantUML-supported tool (e.g., IntelliJ, Visual Studio Code, or PlantUML Online).
Execute the .puml file to generate the diagram.

### 3.Sequence Diagram
The Sequence Diagram illustrates the dynamic flow of interactions between the user and the system. It helps visualize how different objects collaborate to perform various banking operations.

Scenarios Represented
The following sequence diagrams are included:

**Account Creation**
The user provides account details.
The Bank class generates a unique account number and creates an instance of either SavingsAccount or CurrentAccount.
The system stores the new account.
**Deposit Money**
The user provides an account number and a deposit amount.
The Bank retrieves the corresponding Account and updates the balance.
The updated balance or confirmation is returned to the user.
**Withdraw Money**
The user requests a withdrawal.
The system checks if the balance is sufficient or if the CurrentAccount overdraft can be used.
The withdrawal is either processed successfully or denied.
**View Balance**
The user requests their balance.
The Bank retrieves and returns the account balance.

Diagram Files
Generated Image:
The exported sequence diagram image is available for quick reference.
File Name: BAM_SequenceDiagram.png
Location: BankAccountManagement/Diagrams/SequenceDiagram.png