package task2_collections_l_and_hl;

/**
 * 1.
 Задача 1: Ключ с наибольшим значением

 У вас есть LinkedHashMap с парами ключ-значение, где значения являются целыми числами.
 Напишите код для поиска ключа с наибольшим значением.

 Задача 2: Удаление всех элементов, начинающихся с определенной буквы

 У вас есть LinkedList со строками. Напишите код для удаления всех элементов, начинающихся
 с определенной буквы (например, "A").
 */

public class PracticalListAndLinkedHashMap {









































    /**
     * Ответы :
     *
     * Задача 1 . LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
     * // Заполняем map парами ключ-значение
     * String keyWithMaxValue = null;
     * int maxValue = Integer.MIN_VALUE;
     * for (Map.Entry<String, Integer> entry : map.entrySet()) {
     *     if (entry.getValue() > maxValue) {
     *         keyWithMaxValue = entry.getKey();
     *         maxValue = entry.getValue();
     *     }
     * }
     *
     * Задача 2 . LinkedList<String> list = new LinkedList<>();
     * // Заполняем list строками
     * Iterator<String> iterator = list.iterator();
     * while (iterator.hasNext()) {
     *     String element = iterator.next();
     *     if (element.startsWith("A")) {
     *         iterator.remove();
     *     }
     * }
     */
}
