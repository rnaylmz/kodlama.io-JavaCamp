package week2.method;

public class Main2 {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(2,9);
        System.out.println(sayi);

        //Bu yapıların test edilebilirliği zayıftır.

        int toplam = topla(2,5,8,11);
        System.out.println(toplam);
    }

    //void bir işi yapar. sout kullanımı değer döndürdüğü anlamına gelmez.
    //return-değer döndürme.

    public static void ekle(){

    }

    public static void sil(){

    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }


    public static int topla(int... sayilar){
        int toplam =0;
        for (int sayi: sayilar){
            toplam += sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}
