package org.medicalz.oopchallenge;

public class Heart extends Organ{
    private  int  heartrate;

    public Heart(String name, String medical_condition, int heartrate) {
        super(name, medical_condition);
        this.heartrate = heartrate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate: "+this.getHeartrate());
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }
}
