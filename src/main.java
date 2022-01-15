import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double pi=3.14;
        double yarıcap,acı;
        Scanner input=new Scanner(System.in);
        System.out.print("açıyı giriniz:");
        acı=input.nextDouble();
        System.out.print("yarıçapı giriniz:");
        yarıcap= input.nextDouble();
        double alan;
        alan=(pi*yarıcap*yarıcap*acı)/360;
        System.out.println("girdiginiz degerlere göre daire diliminin alan="+alan);
    }
}
