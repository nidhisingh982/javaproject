1.Project overview & how to run (JDK version, commands)
The Campus Course & Records Manager (CCRM) is a console-based Java SE application designed to simplify academic administration within an educational institution. It provides functionality for:
Student Management: Creation, updates, transcript generation.
Course Management: Creation, modification, search, and filtering.
Enrollment and Grading: Recording marks, computing GPA, generating academic reports.
File Operations: Import and export of data using CSV, backup and restore using Java NIO.2, and recursive directory utilities.
Tested Environment: JDK 17 and above
Recommended IDE: Eclipse / IntelliJ IDEA
2.Execution Instructions
->Clone the repository
->Compile source files
->Run the application
3.Evolution of Java
->1995: Java 1.0 introduced (Write Once, Run Anywhere).
->2004: Java 5 introduced Generics, Enums, Annotations.
->2014: Java 8 introduced Lambdas, Streams, Date/Time API.
->2017: Java 9 introduced the Module System.
->2021: Java 17 (LTS) introduced Records and Sealed Classes.
4.JDK/JRE/JVM explanation.
Java comes in three main editions: Java ME, Java SE, and Java EE, each serving different purposes. Java ME (Micro Edition) is a lightweight subset of Java designed for mobile and embedded devices with limited resources such as feature phones, IoT devices, and sensors. It provides a smaller API footprint suitable for constrained environments. Java SE (Standard Edition) is the core Java platform and forms the foundation of the language. It includes the essential libraries, APIs, and tools needed to build general-purpose desktop applications, console programs, and basic utilities. Features like collections, Streams, multithreading, and the Date/Time API are part of Java SE. Java EE (Enterprise Edition), now known as Jakarta EE, extends Java SE with additional APIs and specifications tailored for large-scale, distributed, and enterprise-level applications. It includes technologies such as Servlets, JSP, EJB, and Web Services, making it suitable for building web applications, enterprise portals, and large business systems.
5.JDK, JRE, JVM
JVM → Executes compiled Java bytecode.
JRE → JVM + standard libraries (for running programs).
JDK → JRE + development tools (compiler, debugger, etc).
6.Windows install steps (with your screenshots) and Eclipse setup steps(with screenshots).
Installing & Configuring Java on Windows
Step 1: Download the JDK
Open a browser and go to Oracle JDK Downloads or Adoptium
Select the latest Java SE Development Kit (JDK) version (e.g., JDK 24 or 17 LTS).
Download the Windows x64 Installer (.exe).
Step 2: Install JDK
Run the downloaded installer (.exe).
Accept the license agreement and select the installation path (default: C:\Program Files\Java\jdk-24).
Complete the installation by clicking Next → Install → Finish.
Step 3: Set Environment Variables
Open System Properties:
Press Win + Pause/Break → click Advanced system settings → Environment Variables Or, search “Environment Variables” in Windows Search.
Under System variables, click New and add:
Variable value: C:\Program Files\Java\jdk-24 (your installation path)
Find the Path variable, select Edit → New, and add:
Click OK to save all changes.
Step 4: Verify Installation
Open Command Prompt (cmd).
Run the command:
java --version
You should see output similar to:
java 24.0.2 2025-07-15
Java(TM) SE Runtime Environment (build 24.0.2+12-54)
Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode)
Optionally, verify the compiler:
javac --version
![image alt](https://github.com/nidhisingh982/javaproject/blob/99bf9161d29693285643082f35cccad2b2e42a73/Screenshot%202025-09-24%20231504.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/df956157666a7692dae26ac15c1b58e3220ebbef/Screenshot%202025-09-24%20232155.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/5205d22cf3dbcfc6a895e23b75d0adc4fcf80904/Screenshot%202025-09-24%20232556.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/713e46ae8a7f0989f9b12374f751e19492881b03/Screenshot%202025-09-24%20232624.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/4d342a83e02efc730190de734bed01e92b25fd46/Screenshot%202025-09-24%20232254.png)
Step 5: Configure Eclipse IDE (Optional)
Install Eclipse IDE for Java Developers from Eclipse Downloads
Launch Eclipse → File → New → Java Project → set project name → Finish.
Right-click project → Properties → Java Build Path → Libraries → Add Library → JRE System Library → Installed JREs → Add.
Browse to your JDK installation path (C:\Program Files\Java\jdk-24) → Finish.
Click Apply and Close.
7.Using Eclipse IDE: new project creation, run configs (screenshots).
Step 1: Launch Eclipse
Open Eclipse IDE.
Select a workspace directory 
Step 2: Create a New Java Project
Go to File → New → Java Project.
Enter a Project Name 
Ensure the JDK version matches your installed Java (e.g., Java 24).
Click Finish
Step 3: Add Source Folder & Packages
Right-click the project → New → Source Folder → name it src.
Inside src, create packages according to your project structure:
edu.ccrm.cli
edu.ccrm.config
edu.ccrm.domain
edu.ccrm.service
edu.ccrm.io
edu.ccrm.util
Add all .java source files into their respective packages.
Step 4: Set Run Configuration
Right-click on the Main Class (MainApp.java) → Run As → Java Application.
Alternatively, go to Run → Run Configurations → Java Application → New:
Name: CCRM_Run
Project: CCRM
Main class: edu.ccrm.cli.MainApp
Click Apply → Run.
Step 5: Run the Application
The console should display the main menu of CCRM:
Welcome to Campus Course & Records Manager (CCRM)
Manage Students
Manage Courses
Enrollment & Grades
Import / Export Data
Backup & Reports
Exit
You can now navigate the menu and test all features.
screenshot for eclipse download
![image alt](https://github.com/nidhisingh982/javaproject/blob/6fcbbc9bc82f1bdfa0f1a926ef6061f0b89a501c/Screenshot%202025-09-24%20232648.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/8ea7e25faf3c2c4fe1c1661c69b893d8daa49b4e/Screenshot%202025-09-24%20232726.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/ff2f96606cd1a3feadfe6c817ea3bef3cd6770c1/Screenshot%202025-09-24%20232817.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/803965550dfb31b528f9406f866787c121ca5664/Screenshot%202025-09-14%20011806.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/ea2638ca492b52d85d25f9582ce124d6f2a37f73/Screenshot%202025-09-14%20011934.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/ba8571b188ab9fd5c5b7b8eef7cb4bfe6b9b7179/Screenshot%202025-09-14%20012040.png)
![image alt](https://github.com/nidhisingh982/javaproject/blob/76a2c303bc75ce6e2583c7f756a546ca707b0159/Screenshot%202025-09-14%20012126.png)
![image alt](
8.Mapping table: syllabus topic → file/class/method where it’s demonstrated.
Encapsulation	-> Student.java
Inheritance ->	Person.java → Student.java, Instructor.java
Polymorphism-> TranscriptService interface + implementation
Streams & Lambdas	-> CourseServiceImpl.filterCoursesByDept()
Enums ->	Semester.java, Grade.java
Exception Handling ->	DuplicateEnrollmentException
NIO.2 ->	ImportExportService, BackupService
Recursion ->	RecursionUtil.computeBackupSize()
Date/Time API	-> Enrollment.java
9.Enabling Assertions
Run the program with assertions enabled:
java -ea -cp bin edu.ccrm.cli.MainApp
