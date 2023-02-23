package com.mycompany.hospital;

public class Patient extends Person implements PatientType {

    private String ID;
    char type;

    public Patient(String ID, char type, String name, int age, String address, String mobileNumber, String email) throws InvalidAgeException {
        super(name, age, address, mobileNumber, email);
        this.ID = ID;
        this.type = type;
    }

    public String patientType()
    {
        if (type=='A'||type=='a')
            return "first class";
        else if(type =='B'||type=='b')
            return "economy class";
        else 
            return "";
    }

    @Override
    public String toString() {
        return super.toString()+ "ID=" + ID + ", type=" + patientType() ;
    }
    
}