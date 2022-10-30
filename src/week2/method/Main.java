package week2.method;

public class Main {

    public static void main(String[] args) {

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }


    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,4,7,8,0};
        int aranacak = 6;
        boolean varMi=false;

        for(int sayi : sayilar){
            if(sayi == aranacak)
                varMi=true;
            break;
        }

        if(varMi)
            mesajVer(aranacak+" sayısı mevcuttur.");
        else
            mesajVer(aranacak+" sayısı mevcut değildir.");
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

}
