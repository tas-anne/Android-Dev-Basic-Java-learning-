package org.medicalz.oopchallenge;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medical_condition, boolean isEmpty) {
        super(name, medical_condition);
        this.isEmpty = isEmpty;
    }
    public void digest()
   {
      System.out.println("Digesting Begin....");
   }
    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isEmpty())
        {
            System.out.println("Food Needed!Stomach needs to be filled");
        }
        else
        {
            System.out.println("Stomach is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
