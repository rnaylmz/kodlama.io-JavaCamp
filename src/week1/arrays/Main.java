package week1.arrays;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Rana";
        String ogrenci2 = "Samurai Jack";
        String ogrenci3 = "Polat";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("********************************************************");

        String [] ogrenciler = new String[3];
        ogrenciler[0] = "Rana";
        ogrenciler[1] = "Samurai Jack";
        ogrenciler[2] = "Polat";

        for (int i=0; i<ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("********************************************************");


        for (String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
