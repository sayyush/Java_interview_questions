package javainterviewquestions;

public class Palindrome_ForLoop {
    public static void main(String[] args) {
        /*
         Example 1: Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz.
                    civic, nalan, kucuk, 11211 ==> Palindrome
         Logic : String'i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.
         */
        
        String duz = "civic";
        String ters = "";

        for (int i = duz.length() - 1; i >= 0; i--) {
            ters = ters + duz.charAt(i);
        }
        if (duz.equalsIgnoreCase(ters)) {
            System.out.println(duz + " : palindrome'dur");
        } else {
            System.out.println(ters + " : palindrome degildir");
        }

    }
}
