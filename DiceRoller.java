import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        
        System.out.println();
        boolean isSystemActive=false;


        do{

        
        System.out.println("1. Roll a Dice");
        System.out.println("2. Exit");

        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();

        if (input==1) {

            System.out.println("Your Value is : " + randomDiceRoller());
            System.out.println();
            System.out.println();
            isSystemActive=true;
            
        }
        else {
        
            isSystemActive=false;
        }

    }while(isSystemActive);
        
    }

    public static int randomDiceRoller ( ) {
        boolean isInvalidThrow=false;
        int randomNumberInt=0;

        System.out.println("initiating dice roller ... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        do {
            double randomNumberDouble = Math.random()*6;
              randomNumberInt = (int)randomNumberDouble;

            
             if (randomNumberInt==0) {
                 isInvalidThrow=true;
                 
             }
             else{
                 isInvalidThrow=false;
             }

        }while(isInvalidThrow);

        
        return randomNumberInt;
    }
}