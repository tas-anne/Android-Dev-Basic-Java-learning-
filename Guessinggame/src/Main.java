import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome");
        System.out.println("Enter your name: ");
        Scanner scanner=new Scanner(System.in);
        String username=scanner.next();
        System.out.println("Hello "+username);
        System.out.println("SHOULD WE START THE GAME?");
        System.out.println("\t1.Yes\t2.No");
        int start=scanner.nextInt();
        boolean ans=false;
        if(start==1) {
            Random random=new Random();
            int x=random.nextInt(20)+1;
            System.out.println("Guess Number: ");
            int inputtimes=1;
            while(inputtimes<=5){
            int userinput=scanner.nextInt();
            inputtimes++;
            if(userinput==x){ ans=true;
                break;
            }
            else {
                if(x>userinput){System.out.println("Guess Higher");
                    }
                else {System.out.println("Guess Lower");
                    }
            }}
            if(ans){System.out.println("Congratulations!You Won!");}
            else{System.out.println("Better luck next time!");}
        }
        else {System.out.println("See you later!");}




    }
}