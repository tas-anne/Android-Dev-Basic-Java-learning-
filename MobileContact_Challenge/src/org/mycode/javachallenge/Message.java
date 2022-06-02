package org.mycode.javachallenge;

public class Message {
    private String text;
    private String recipent;
    private int id;

    public Message(String text, String recipent, int id) {
        this.text = text;
        this.recipent = recipent;
        this.id = id;
    }
    public void getdetails(){
        System.out.println("Contact Name: "+recipent+"\nMessage: "+text+" "+"\nId: "+id);
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRecipent() {
        return recipent;
    }

    public void setRecipent(String recipent) {
        this.recipent = recipent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
