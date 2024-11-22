import java.util.Scanner;

public class Kaka {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");

        // Читаем строку ввода
        String input = scanner.nextLine();

        // Разбиваем строку на части по пробелам
        String[] probeli = input.split(" ");

        double summa = 0;
        int kolvo = 0;

        // Проходим по всем введённым числам
        for (String chisla : probeli) {
            try {
                // Преобразуем строку в число
                summa += Double.parseDouble(chisla);
                kolvo++;
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число: " + chisla);
            }
        }

        // Вычисляем и выводим среднее арифметическое
        if (kolvo > 0) {
            double average = summa / kolvo;
            System.out.println("Среднее арифметическое: " + average);
        } else {
            System.out.println("Не было введено ни одного корректного числа.");
        }

        scanner.close();
    }
}

