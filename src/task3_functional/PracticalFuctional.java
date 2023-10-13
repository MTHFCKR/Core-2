package task3_functional;

/**
 * 1.У вас есть список целых чисел. Напишите код с использованием стримов для вычисления среднего
 * значения всех чисел в списке.
 *
 * 2.У вас есть список строк. Напишите код с использованием стримов для фильтрации строк, которые начинаются с буквы
 * "A", преобразования их в числа (например, длина строки), и затем суммирования этих чисел.
 */

public class PracticalFuctional {



































    /**
     * Ответы :
     *
     * Задача 1 .
     *
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     *
     * double average = numbers.stream()
     *     .mapToDouble(Integer::doubleValue)
     *     .average()
     *     .orElse(0.0);
     *
     * System.out.println(average);
     *
     * Задача 2.
     *
     * List<String> words = Arrays.asList("Apple", "Banana", "Apricot", "Cherry", "Avocado");
     *
     * int sum = words.stream()
     *     .filter(word -> word.startsWith("A"))
     *     .mapToInt(String::length)
     *     .sum();
     *
     * System.out.println(sum);
     *
     */
}
