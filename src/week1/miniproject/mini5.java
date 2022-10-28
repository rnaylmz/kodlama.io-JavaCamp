package week1.miniproject;

//Bir diziden sayı bulma

public class mini5 {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 7, 9, 0};
        int theNumber = 3;
        boolean isExist = false;

        for (int number : numbers)
            if (number == theNumber)
                isExist = true;

        if(isExist)
            System.out.println("sayı var.");
        else
            System.out.println("sayı yok.");
    }
}
