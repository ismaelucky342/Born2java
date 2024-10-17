package Cell00.ex02;
import java.util.HashMap; //hashmap
import java.util.Map;
import java.util.Scanner;

public class Hacker_language {

    private static final Map<Character, String> leetMap = new HashMap<>();

    static {
        leetMap.put('a', "4");
        leetMap.put('b', "8");
        leetMap.put('c', "<");
        leetMap.put('d', "|)");
        leetMap.put('e', "3");
        leetMap.put('f', "|=");
        leetMap.put('g', "6");
        leetMap.put('h', "#");
        leetMap.put('i', "!");
        leetMap.put('j', "_|");
        leetMap.put('k', "|<");
        leetMap.put('l', "1");
        leetMap.put('m', "/\\/\\");
        leetMap.put('n', "|\\|");
        leetMap.put('o', "0");
        leetMap.put('p', "|>");
        leetMap.put('q', "9");
        leetMap.put('r', "|2");
        leetMap.put('s', "5");
        leetMap.put('t', "7");
        leetMap.put('u', "(_)");
        leetMap.put('v', "\\/");
        leetMap.put('w', "\\/\\/");
        leetMap.put('x', "><");
        leetMap.put('y', "`/");
        leetMap.put('z', "2");
        leetMap.put('1', "1");
        leetMap.put('2', "2");
        leetMap.put('3', "3");
        leetMap.put('4', "4");
        leetMap.put('5', "5");
        leetMap.put('6', "6");
        leetMap.put('7', "7");
        leetMap.put('8', "8");
        leetMap.put('9', "9");
        leetMap.put('0', "0");
    }

    public static String toLeetSpeak(String input) {
        StringBuilder leetString = new StringBuilder();
        for (char c : input.toLowerCase().toCharArray()) {
            leetString.append(leetMap.getOrDefault(c, String.valueOf(c)));
        }
        return leetString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto a convertir a lenguaje hacker:");
        String input = scanner.nextLine();
        String leetText = toLeetSpeak(input);
        System.out.println("Texto en lenguaje hacker: " + leetText);
    }
}