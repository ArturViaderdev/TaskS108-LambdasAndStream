package level1.exercise8;

import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        Reverser reverser = (String text) ->{
            StringBuilder sb = new StringBuilder(text);
            return String.valueOf(sb.reverse());
        };
        String word = "hola";
        System.out.println(reverser.reverse(word));
    }
}
