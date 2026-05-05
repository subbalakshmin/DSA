import java.util.Scanner;
public class ReverseAlphabetPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=n;i>=1;i--){
            for(ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
