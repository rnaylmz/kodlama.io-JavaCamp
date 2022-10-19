package week1.conditionals;

public class switchDemo {
    public static void main(String[] args){
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok iyi : Geçtiniz.");
            case 'C':
                System.out.println("İyi : Geçtiniz.");
            case 'D':
                System.out.println("Fena değil : Geçtiniz.");
            case 'F':
                System.out.println("Maalesef : Kaldınız.");
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
        //Güzelleştirme: ctrl+shift+alt+L
    }
}
