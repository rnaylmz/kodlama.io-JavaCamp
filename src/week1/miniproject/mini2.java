package week1.miniproject;

public class mini2 {
    public static void main(String[] args) {

        char harf = 'İ';



        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}