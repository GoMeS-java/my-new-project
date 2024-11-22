import java.util.Scanner;

public class Gaba {

    public static void main(String[] args) {
        String result = textModifier();
        System.out.println("Измененный текст: " + result);
    }

    public static String textModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String vxod = scanner.nextLine();

        // 1. A
        StringBuilder izmenenie = new StringBuilder();
        boolean posledniProbel = false;

        for (char c : vxod.toCharArray()) {
            if (c != ' ') {
                izmenenie.append(c);
                posledniProbel = false;
            } else if (!posledniProbel) {
                izmenenie.append(c);
                posledniProbel = true;
            }
        }


        String posleProbel = izmenenie.toString();

        // 2. B
        izmenenie = new StringBuilder();
        for (int i = 0; i < posleProbel.length(); i++) {
            char c = posleProbel.charAt(i);
            if (c == '-') {
                if (i > 0 && i < posleProbel.length() - 1) {
                    char left = posleProbel.charAt(i - 1);
                    char right = posleProbel.charAt(i + 1);
                    izmenenie.setCharAt(izmenenie.length() - 1, right);
                    izmenenie.append(left);
                    i++;
                }
            } else {
                izmenenie.append(c);
            }
        }


        String posleMinusi = izmenenie.toString();

        // 3. C
        izmenenie = new StringBuilder();
        for (char c : posleMinusi.toCharArray()) {
            if (c == '+') {
                izmenenie.append('!');
            } else {
                izmenenie.append(c);
            }
        }


        String poslePlusi = izmenenie.toString();

        // 4. D
        izmenenie = new StringBuilder();
        int summaGabo = 0;

        for (char c : poslePlusi.toCharArray()) {
            if (Character.isDigit(c)) {
                summaGabo += Character.getNumericValue(c);
            } else {
                izmenenie.append(c);
            }
        }


        String result = izmenenie.toString();
        if (summaGabo > 0) {
            result += " " + summaGabo;
        }

        return result.trim();
    }


}