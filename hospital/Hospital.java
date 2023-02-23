//Hamza Brinji


package com.mycompany.hospital;

/**
 *
 * @au
 */


import java.util.Scanner;
import java.util.ArrayList;

public class Hospital {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner key=new Scanner(System.in);
        ArrayList <Patient> patientList =new ArrayList<Patient>();
        char cont='y';
        while(cont=='y'){
        System.out.println("1- Add a patient");
        System.out.println("2- Print all patients information");
        System.out.println("3- Exit the program");
        int s=key.nextInt();
        if(s==1)
        {
            System.out.println("Enter ID ");              
                String i=key.next();
                System.out.println("Enter name");
                String n=key.next(); 
                System.out.println("Enter age");
                int g=key.nextInt();
                
                System.out.println("Enter address");
                String r=key.next();
                System.out.println("Enter mobile number");
                String m=key.next();
                System.out.println("Enter email");
                String e=key.next();
                System.out.println("Enter type");
                char t=key.next().charAt(0);
                Patient p=new Patient(i,t,n,g,r,m,e) ;
                patientList.add(p);
        }
        else if(s==2)
        {
            for(int i=0;i<patientList.size();i++)
                {
                    System.out.println(patientList.get(i));
                }  
        }
        else if(s==3)
        {
            cont='n';
        }
        else
        {
            System.out.println("try again ....");
        }
    }
    }  
}
