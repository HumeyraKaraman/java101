import java.util.Scanner;

public class Kdvhesaplama {
    public static void main(String[] args) {

        //variable oluşturduk
        double tutar, kdvTutar, kdvOran;


        //input isimli bir scanner oluşturduk
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvOran = (tutar>1000)? 0.08 : 0.18;
        kdvOran *= tutar;
        kdvTutar = kdvOran + tutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvOran);
        System.out.println("KDV'li Tutar : " + kdvTutar);







    }
}
