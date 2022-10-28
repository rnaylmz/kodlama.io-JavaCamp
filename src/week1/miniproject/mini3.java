package week1.miniproject;

//Mükemmel sayı : bölenlerinin toplamı kendisine eşit sayıdır.
public class mini3 {
    public static void main(String[] args) {

        int number = 27;

        int total = 0;
        for(int i = 1; i<number; i++){
            if(number % i == 0)
               total = i+i;
        }
        if(number == total)
            System.out.println(number + " mükemmel sayıdır.");
        else
            System.out.println(number + " mükemmel sayı değildir.");
    }
}
