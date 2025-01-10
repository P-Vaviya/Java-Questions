//Print the numbers in ascending and descending order 
import java.util.Scanner;

class AscendDescend{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the beginner number : ");
        int beg = myObj.nextInt();
        System.out.print("Enter the ending number : ");
        int end = myObj.nextInt();

        System.out.println("Enter the option : ");
        System.out.println("1. Ascending order ");
        System.out.println("2. Descending order ");
        int opt = myObj.nextInt();

        if(opt==1){ 
            for(int i = beg; i<=end; i++){
                System.out.println(i);
            }
        }
        else if(opt==2){ 
            for(int i = beg; i>=end; i--){
                System.out.println(i);
            }
        }
    }
}