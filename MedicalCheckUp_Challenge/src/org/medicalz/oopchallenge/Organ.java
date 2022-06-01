package org.medicalz.oopchallenge;

public class Organ {
  private String name;
  private String medical_condition;

    public Organ(String name, String medical_condition) {
        this.name = name;
        this.medical_condition = medical_condition;
    }

    public void getDetails()
    {
        System.out.println("Name: "+getName());
        System.out.println("Medical COndition: "+getMedical_condition());

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedical_condition() {
        return medical_condition;
    }

    public void setMedical_condition(String medical_condition) {
        this.medical_condition = medical_condition;
    }
}
