import org.medicalz.oopchallenge.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient=new Patient("Mina",20,
                new Eye("Left Eye","Short sighted","Blue",true),
                new Eye("Right Eye","Normal","Green",true),
                new Heart("Heart","Normal",70),
                new Skin("Skin","burned","white",40),
                new Stomach("Stomach","PUD",false));
        System.out.println("Name: "+patient.getName());
        System.out.println("Age "+patient.getAge());
        Scanner scanner=new Scanner(System.in);
        boolean shouldFinish=false;
        while(!shouldFinish)
        {
            System.out.println("Select and organ:"+
            "\n\t1. Left Eye"+"\n\t2. Right Eye"+"\n\t3. Heart"+"\n\t4. Stomach"+"\n\t5. Skin"+
                            "\n\t6. Quit");
            int choice =scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLefteye().getDetails();
                    if(patient.getLefteye().isIsopen()){
                        System.out.println("\t\t1.Close Eyes");
                        if(scanner.nextInt()==1){
                            patient.getLefteye().closed();
                        }
                        else{
                            continue;
                        }
                    }else{

                        System.out.println("\t\t1.Open Eyes");
                        if(scanner.nextInt()==1){
                            patient.getLefteye().open();
                        }
                        else{
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRighteye().getDetails();
                    if(patient.getRighteye().isIsopen()){
                        System.out.println("\t\t1.Close Eyes");
                        if(scanner.nextInt()==1){
                            patient.getRighteye().closed();
                        }
                        else{
                            continue;
                        }
                    }else{

                        System.out.println("\t\t1.Open Eyes");
                        if(scanner.nextInt()==1){
                            patient.getRighteye().open();
                        }
                        else{
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1.Change heart rate");
                    if(scanner.nextInt()==1)
                    {
                        System.out.println("enter new heart rate: ");
                        int newheartrate= scanner.nextInt();
                        patient.getHeart().setHeartrate(newheartrate);
                        System.out.println("Heart Rate changed to: "+patient.getHeart().getHeartrate());
                    }else{
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1.Digest");
                    if(scanner.nextInt()==1)
                    {
                        patient.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish =true;
                    break;

            }
        }

    }
}