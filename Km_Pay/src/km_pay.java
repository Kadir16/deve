
import java.util.Scanner;


public class km_pay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız Kilometre Başına kaç Kuruş Yakıyor? : ");
        int a=scanner.nextInt();
        System.out.print("Kac Kilometre Yapacaksınız? : ");
        int b = scanner.nextInt();
        int c = a*b;
        int d=c/100;
        System.out.println("Aracınız "+b+" Km'de "+c+" Kuruş yakacaktır."+"Yani "+d+"TL");
    }
    
}
