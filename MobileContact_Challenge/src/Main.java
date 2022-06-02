import org.mycode.javachallenge.Contact;
import org.mycode.javachallenge.Message;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contact>contacts;
    private static Scanner scanner;
    private static int id=0;
    public static void main(String[] args) {

        contacts=new ArrayList<>();
        System.out.println("Welcome to the MobileContact Challenge!!!");
        showInitialOptions();
    }
    private static void showInitialOptions(){
        System.out.println("Please select one : "+"\n\t1. manage contacts"+"\n\t2. messages"+"\n\t3. Quit");
        scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }
    }

    private static void manageMessages() {
        System.out.println("Please select one: "+
                "\n\t1. Show all messages"+
                "\n\t2. Send a new message"+
                "\n\t3. Go back");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                showallmessages();
                break;
            case 2:
                sendnewmessage();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void sendnewmessage() {
        System.out.println("Who are you going to send a message?");
        String name=scanner.next();
        if(name.equals("")){
            System.out.println("Enter name of the contact!!!");
            sendnewmessage();
        }else{
            boolean doesExist=false;
            for(Contact c:contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }
                if(doesExist){
                    System.out.println("Write your message: ");
                    String text=scanner.next();
                    if(text.equals("")){
                        System.out.println("Enter messages!!");
                        sendnewmessage();//recursive call
                    }else{
                        id++;
                        Message newmessage=new Message(text,name,id);
                        for(Contact c:contacts){
                            if(c.getName().equals(name)){
                                ArrayList<Message>newMessages=c.getMessages();
                                newMessages.add(newmessage);
                                Contact currentContact=c;
                                currentContact.setMessages(newMessages);
                                contacts.remove(c);
                                contacts.add(currentContact);
                            }
                        }

                    }

                }else{
                    System.out.println("There is no such contact!");

                }

        }
        showInitialOptions();
    }

    private static void showallmessages() {
        ArrayList<Message>allmessages=new ArrayList<>();
        for(Contact c:contacts)
        {
            allmessages.addAll(c.getMessages());
        }
        if(allmessages.size()>0)
        {
            for(Message m:allmessages){
                m.getdetails();
                System.out.println("********");
            }
        }else{
            System.out.println("You don't have any message!!!!");
        }
        showInitialOptions();
    }

    private static void manageContacts(){
        System.out.println("Please select one: "+
                "\n\t1. Show all contacts"+
                "\n\t2. Add few contacts"+"\n\t3. Search for a contacts"
                 +"\n\t4. Delete a contacts"+"\n\t5. Go back");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                showAllcontacts();
                break;
            case 2:
                addnewcontact();
                break;
            case 3:
                searchforacontact();
                break;
            case 4:
                deleteacontact();
                break;
            default:
                showInitialOptions();
                break;


        }
    }

    private static void deleteacontact() {
        System.out.println("Please enter  the contact's name:");
        String name=scanner.next();
        if(name.equals("")){
            System.out.println("Please enter the name !!!");
            deleteacontact();
        }else{
            boolean doesExist=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                    contacts.remove(c);
                }

            }
            if(!doesExist){
                System.out.println("There is no such contact!!!");
            }
        }
        showInitialOptions();
    }

    private static void searchforacontact() {
        System.out.println("Please enter the contact name:");
        String name=scanner.next();
        if(name.equals("")){
            System.out.println("Please Enter the name");
            searchforacontact();
        }else{
            boolean doesExist=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                    c.getDetails();
                }
            }
            if(!doesExist){
                System.out.println("There is no such contacts!!!");
            }
        }
        showInitialOptions();
    }

    private static void addnewcontact() {
        System.out.println("Adding a new contact..."+"\nPlease enter contact's name: ");
        String name=scanner.next();
        System.out.println("Please enter contact's number:");
        String number=scanner.next();
        System.out.println("Please enter contact's email:");
        String email=scanner.next();
        if(name.equals("")||number.equals("")||email.equals("")){
            System.out.println("Please enter all information");
            addnewcontact();//recursive call
        }else{
            boolean doesExist=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                }
            }
            if(doesExist){
                System.out.println("We have already a contact named "+name+" saved on this phone");
                addnewcontact();
            }else{
            Contact contact=new Contact(name,number,email);
            contacts.add(contact);
            System.out.println(name+" added successfully in your device.");
            }
        }
        showInitialOptions();

    }

    private static void showAllcontacts() {
        for(Contact c:contacts){
            c.getDetails();
            System.out.println("**************");
        }
        showInitialOptions();
    }

}