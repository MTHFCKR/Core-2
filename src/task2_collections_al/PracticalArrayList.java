package task2_collections_al;

/**
 * Задача 1 : У вас есть ArrayList с элементами, некоторые из которых могут быть дубликатами. Напишите код для
 * удаления всех дубликатов и оставления только уникальных элементов в том же порядке.
 *
 *
 * Задача 2 : У вас есть ArrayList с элементами разных типов. Напишите код для поиска наиболее
 * часто встречающегося элемента.
 */
public class PracticalArrayList {
































    /**
     * Задача 1:
     *
     * ArrayList<String> list = new ArrayList<>();
     * // Заполняем list элементами, включая дубликаты
     * HashSet<String> set = new HashSet<>();
     * ArrayList<String> uniqueList = new ArrayList<>();
     * for (String item : list) {
     *     if (set.add(item)) {
     *         uniqueList.add(item);
     *     }
     * }
     * list = uniqueList;
     *
     * Задача 2:
     *
     * ArrayList<Object> list = new ArrayList<>();
     * // Заполняем list элементами
     * HashMap<Object, Integer> counts = new HashMap<>();
     * for (Object item : list) {
     *     counts.put(item, counts.getOrDefault(item, 0) + 1);
     * }
     * Object mostCommon = null;
     * int maxCount = 0;
     * for (Map.Entry<Object, Integer> entry : counts.entrySet()) {
     *     if (entry.getValue() > maxCount) {
     *         mostCommon = entry.getKey();
     *         maxCount = entry.getValue();
     *     }
     * }
     */
}
