import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner giris = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz: ");
        boy = giris.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = giris.nextInt();
        double vki = kilo/(boy*boy);
        if(vki<=18.5) {
            System.out.println("Vücut kitle endeksiniz: "+vki+" - Zayıf(Kilo Almalısınız)");
        } else if (vki>=18.6 && vki<=24.9) {
            System.out.println("Vücut kitle endeksiniz: "+vki+" - Normal Ağırlıktasınız.");
        } else if (vki>=25.0 && vki<=29.9) {
            System.out.println("Vücut kitle endeksiniz: "+vki+" - Kilolu(Kilo Vermelisiniz)");
        } else if (vki>=30 && vki<=34.9) {
            System.out.println("Vücut kitle endeksiniz: "+vki+" - 1.Derecede Obezitesiniz!");
        } else if (vki>=35.0 && vki<=39.9) {
            System.out.println("Vücut kitle endeksiniz: "+vki+" - 2.Derecede Obezitesiniz!");
        } else if (vki>=40) {
            System.out.println("Vücut kitle endeksiniz: "+vki+" - 3.Derecede Obezitesiniz!");
        }
    }
}