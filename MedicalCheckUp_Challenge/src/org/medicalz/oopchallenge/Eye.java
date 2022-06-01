package org.medicalz.oopchallenge;

public class Eye extends Organ {
    private String eyecolour;
    private boolean Isopen;

    public Eye(String name, String medical_condition, String eyecolour, boolean isopen) {
        super(name, medical_condition);
        this.eyecolour = eyecolour;
        Isopen = isopen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Eye Colour: "+this.getEyecolour());
    }
    public void open()
    {
        this.setIsopen(true);
        System.out.println(this.getName()+" Opened");

    }
    public void closed()
    {
        this.setIsopen(false);
        System.out.println(this.getName()+" Closed");

    }

    public String getEyecolour() {
        return eyecolour;
    }

    public void setEyecolour(String eyecolour) {
        this.eyecolour = eyecolour;
    }

    public boolean isIsopen() {
        return Isopen;
    }

    public void setIsopen(boolean isopen) {
        Isopen = isopen;
    }
}
