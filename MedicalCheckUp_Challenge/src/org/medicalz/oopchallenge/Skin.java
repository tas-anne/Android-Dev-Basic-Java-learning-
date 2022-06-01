package org.medicalz.oopchallenge;

public class Skin extends Organ{
    private String skincolour;
    private int softness;

    public Skin(String name, String medical_condition, String skincolour, int softness) {
        super(name, medical_condition);
        this.skincolour = skincolour;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin Colour: "+this.getSkincolour());
    }

    public String getSkincolour() {
        return skincolour;
    }

    public void setSkincolour(String skincolour) {
        this.skincolour = skincolour;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
