import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Haormonik Serisi Alinacak Sayiyi giriniz : ");
        int n=input.nextInt();
        double total=0;
        double kesir;


        for(double i=1; i<=n;i++){
            kesir=1/i;
            total+=kesir;

        } System.out.println(total);






        System.out.println("Hello world!");
    }
}