import java.util.Scanner;
public class pattern_2{
    static void pattern(int n) {
        for(int i =0;i<n;i++){
            for (int j=0;j<i;j++){
            System.out.print("* ");

            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        pattern(n);
        int k =sc.nextInt();
        for(int t=0;t<k;t++){
            int d = sc.nextInt();
            pattern(d);

        }
    }
}    