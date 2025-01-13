import java.util.Scanner;

class EligibleorWhat{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = myObj.nextInt();

        if(age<0){
            System.out.print("Invalid age ");
        }
        else if(age>= 0 && age <18){
            System.out.print("You're minor ");
        }
        else{
            System.out.print("You're eligible ");
        }
    }
}