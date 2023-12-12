package javaproject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateNumbersSymbolsLetters {

    public static void main(String[] args) {
        String str = "A1B2C3#D4E5F6$G7H8I9J0";

        // Create a Pattern object
        Pattern pattern = Pattern.compile("[a-zA-Z]+|[0-9]+|[\\W]+");

        // Create a Matcher object
        Matcher matcher = pattern.matcher(str);

        // Find all matches
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}