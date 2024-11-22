import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число (арабское или римское)");
        String firstInput = scanner.nextLine();
        int first = convertToArabic(firstInput);
        if (first == -1 || first < 1 || first > 10) {
            System.out.println("Ошибка: Числа должны быть от 1 до 10 включительно и в одном формате");
            return;
        }

        System.out.println("Введите 2 число (арабское или римское)");
        String secondInput = scanner.nextLine();
        int second = convertToArabic(secondInput);
        if (second == -1 || second < 1 || second > 10) {
            System.out.println("Ошибка: Числа должны быть от 1 до 10 включительно и в одном формате");
            return;
        }

        if ((isRoman(firstInput) && !isRoman(secondInput)) || (!isRoman(firstInput) && isRoman(secondInput))) {
            System.out.println("Ошибка: Числа должны быть в одном формате (либо арабские, либо римские)");
            return;
        }

        System.out.println("Введите арифм. действие (+, -, *, /)");
        String arifm = scanner.nextLine();
        int result = 0;
        switch (arifm) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Ошибка: Деление на ноль");
                    return;
                } else {
                    result = first / second;
                }
                break;
            default:
                System.out.println("Не верный арифм. знак");
                return;
        }

        // Вывод результата в нужном формате
        if (isRoman(firstInput)) {
            System.out.println("Результат: " + arabicToRoman(result));
        } else {
            System.out.println("Результат: " + result);
        }
    }

    private static int convertToArabic(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return romanToArabic(input);
        }
    }

    private static int romanToArabic(String roman) {
        switch (roman.toUpperCase()) {
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
            default: return -1; // Неправильный римский символ
        }
    }

    private static boolean isRoman(String input) {
        return input.matches("(?i)^(I|II|III|IV|V|VI|VII|VIII|IX|X)$");
    }

    private static String arabicToRoman(int number) {
        if (number < 1 || number > 10) {
            return "Ошибка: Римские числа только от 1 до 10";
        }
        switch (number) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            default: return ""; // Не должно быть
        }
    }
}
