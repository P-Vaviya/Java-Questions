import java.util.Scanner;

class Armstrong{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = myObj.nextInt();

        String s1 = String.valueOf(num);
        int len = s1.length();
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum = sum + (Integer.valueOf(s1.charAt(i))) ** len ;
        
        System.out.print(sum);

        }
        
    }
}