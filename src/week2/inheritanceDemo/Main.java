package week2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        //Değişime direnmeyen programlar yazabilmeliyiz. - Clean Code

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
