package com.greatlearning.labOne;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        CredentialService service = new CredentialService();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Name");
        String fName = scn.next();
        System.out.println("Enter Last Name");
        String lName = scn.next();
//        System.out.println("Enter Department");
//        String dep=scn.next();
        Employee employee = new Employee(fName, lName);
        String eMailGenerated;
        String passwordGenerated;
        System.out.println("Choose your department from below list \n 1.Tech \n 2.HR \n 3.Admin \n 4.Legal");
        int option = scn.nextInt();
        switch (option) {
            case 1:
                String department = "Tech";
                employee.setFirstName(fName);
                employee.setLastName(lName);
                eMailGenerated = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), department);
                service.showCredentials(employee.getFirstName(), eMailGenerated);
                break;
            case 2:
                department = "HR";
                employee.setFirstName(fName);
                employee.setLastName(lName);
                eMailGenerated = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), department);
                service.showCredentials(employee.getFirstName(), eMailGenerated);
                break;
            case 3:
                department = "Admin";
                employee.setFirstName(fName);
                employee.setLastName(lName);
                eMailGenerated = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), department);
                service.showCredentials(employee.getFirstName(), eMailGenerated);
                break;
            case 4:
                department = "Legal";
                employee.setFirstName(fName);
                employee.setLastName(lName);
                eMailGenerated = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), department);
                service.showCredentials(employee.getFirstName(), eMailGenerated);
                break;
            default:
                System.out.println("Invalid choice");


        }


    }

}
