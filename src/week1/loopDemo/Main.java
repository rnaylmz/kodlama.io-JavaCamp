package week1.loopDemo;

public class Main {
    public static void main(String[] args){

    for(int i = 0; i<10; i++){
        System.out.println(i);
    }

    int i = 1;

        System.out.println("*************************");

    while (i<10){
        System.out.println(i);
        i+=2;
    }
        System.out.println("*************************");
    int j = 0;
    do{
        System.out.println(j);
        j+=2;
    }while (j<10);
}

//do-while döngü çalışmaya bile do kısmı bir kere çalışır.

}
