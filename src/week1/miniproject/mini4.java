package week1.miniproject;

//Arkadaş sayı: Kendileri hariç, pozitif tam bölenleri bir diğerine eşit olan sayılarıdr.
public class mini4 {
    public static void main(String[] args) {
        int number1=220;
        int number2=284;

        int total=0;
        int total2=0;

        for(int i=1; i<number1;i++)
            if(number1 % i == 0)
            total += i;

        //System.out.println(total);


        for (int j=1; j<number2;j++)
            if(number2 % j == 0)
            total2 +=j;
        //System.out.println(total2);

        if(total == number2 && total2==number1)
            System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
        else
            System.out.println("arkadaş sayı değiller.");

    }
}
