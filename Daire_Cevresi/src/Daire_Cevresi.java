import java.util.Scanner;

public class Daire_Cevresi {

    public static void main(String[] args) {

        double r,a,pi=3.14, dilim_alani;

        Scanner input = new Scanner(System.in);
        System.out.println("Daire yarıçapını giriniz:");
        r = input.nextDouble();
        System.out.println("Merkez açısının ölçüsünü giriniz:");
        a = input.nextDouble();

        dilim_alani = (pi*(r*r)*a)/360;

        System.out.println("Daire diliminin alanı:" + dilim_alani);


    }
}
