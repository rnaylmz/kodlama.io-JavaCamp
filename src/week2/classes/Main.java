package week2.classes;

public class Main {

    public static void main(String[] args) {

        //İş yapan her şey classlardan oluşur.
        //Classlar, ilgili alanlarda gruplama yapar.
        //Classlar referans tiptir.(reference type)

        //Stack --new--> Heap : Bu işlem aynı classtan üretilen nesnelerin farklı birer referans numarasıyla tutulmasını sağlar.
        //Garbage collector - Eğer newlediğimiz nesnenin karşılığı heapte boşa çıkarsa java onu çöpe atar.
        // Bu yüzden newleme işlemi yaparken dikkat etmeliyiz. Bellek kullanımı açısından önemli.

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager =customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //Değer tip (value type) - Her şey stackte oluşur.
        int sayi = 10;
        int sayi1 = 20;
        sayi1 = sayi;
        sayi = 30;
        System.out.println(sayi1);

        int [] ints = new int[]{1,2,3};
        int [] ints1 = new int[]{4,5,60};
        ints1 = ints;
        ints[0] = 10;
        System.out.println(ints1[0]);


    }
}


