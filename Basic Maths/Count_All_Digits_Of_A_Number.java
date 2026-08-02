import java.util.Scanner;
public class Count_All_Digits_Of_A_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
