import java.util.Scanner;

/**
 * daire
 */
public class daire {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int r,b,d;
        double pi = 3.14;
        double c;
        System.out.println("Lütfen yari çapi giriniz : ");
        Scanner scn=new Scanner(System.in);
        r=scn.nextInt();
        System.out.println("aci : ");
        b=scn.nextInt();

        c=(pi * (r*r) * b) / 360;
        System.out.println("sonuc : "+c);

    }
}