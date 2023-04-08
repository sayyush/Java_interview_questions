package javainterviewquestions;

public class StringBuilder_ForLoop_TerstenYazma {

    public static void main(String[] args) {

        //  Interview'da senden bu soruyu sorarsa, sen de ona StringBuilder Class'indaki reverse() method'uylami yapiyim yoksa
        //   forloop'lami yapiyim diye soracaksin. O da muhtemelen StringBuilder diyecek ve sen de rahatlikla cozeceksin.


        // Example 1 : Size verilen bir String'i tersten yazdiriniz.
        //                Germany ==> ynamreG
        //                   Java ==> avaJ


        String s = "Germany";
        String t = "";   // ynamreG   yeni data'yi t container'in icine koyacak

        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        System.out.println(t);   //  ynamreG


        StringBuilder sb1 = new StringBuilder("Germany");
        sb1.reverse();
        System.out.println(sb1); // ynamreG
    }
}

