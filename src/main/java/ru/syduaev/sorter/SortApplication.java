package ru.syduaev.sorter;

import java.util.Arrays;
import java.util.Scanner;

public class SortApplication {

    private static final String INVALID_CHARACTERS_MESSAGE = "Введенный массив может включать в себя только целые числа, " +
            "разделенные запятой. Некорректное значение: \"%s\" позиция элемента: %s\n";
    private static final String EXIT_COMMAND = "end";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Утилита для сортировки массива запущена успешно. Для выхода из утилиты введеите \"%s\" и нажмите Enter\n", EXIT_COMMAND);

            while (true) {
                try {
                    System.out.print("Введите массив целых чисел одной строкой через запятую и нажмите Enter: ");
                    String inputString = sc.nextLine();

                    if (inputString.equalsIgnoreCase(EXIT_COMMAND)) {
                        break;
                    }

                    int[] parsedArray = parse(inputString);
                    System.out.printf("Несортированный массив: %s\n", Arrays.toString(parsedArray));

                    System.out.print("Введите \"desc\" для сортировки по убыванию нажмите Enter. Для сортировки во возрастанию нажмите Enter: ");
                    String sortDirection = sc.nextLine();

                    int[] sortedArray = sort(parsedArray, sortDirection);
                    System.out.printf("Отсортированный массив: %s\n", Arrays.toString(sortedArray));
                    System.out.println();
                } catch (InvalidCharactersValidationException e) {
                    System.out.printf(e.getMessage(), e.getInvalidString(), e.getPosition());
                }
            }

            System.out.println("Завершение работы утилиты");
        }
    }

    private static int[] parse(String arrayString) {
        String trimmedArrayString = arrayString.replaceAll(" ", "");
        String[] stringArray = trimmedArrayString.split(",");

        checkContainsOnlyDigits(stringArray);

        int[] parsedArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            parsedArray[i] = Integer.parseInt(stringArray[i]);
        }

        return parsedArray;
    }

    private static int[] sort(int[] unsortedArray, String sortDirection) {
        if (sortDirection.equalsIgnoreCase("desc")) {
            return Sorter.sort(unsortedArray, SortDirection.DESC);
        } else {
            return Sorter.sort(unsortedArray);
        }
    }

    private static void checkContainsOnlyDigits(String[] arr) {
        String regex = "\\d+";

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].matches(regex)) {
                throw new InvalidCharactersValidationException(INVALID_CHARACTERS_MESSAGE, arr[i], i + 1);
            }
        }
    }
}
