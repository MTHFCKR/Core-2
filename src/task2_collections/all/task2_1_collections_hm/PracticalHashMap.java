package task2_collections.all.task2_1_collections_hm;

/**
 * Задача 1. У вас есть список пар ключ-значение, и вы хотите создать HashMap с этими парами. Однако вам нужно
 * убедиться, что в получившейся хэш-карте нет дубликатов по ключам и значениям. Напишите код для создания такой HashMap
 *
 * Задача 2. У вас есть список слов. Напишите код для создания HashMap, в которой ключами будут слова, а значениями -
 * количество раз, которое каждое слово встречается в списке.
 */
public class PracticalHashMap {






























    /**
     * Ответы .
     * Задача 1 :
     *
     * List<Pair<String, Integer>> pairs = new ArrayList<>();
     * // Заполняем pairs парами ключ-значение
     * HashMap<String, Integer> uniqueMap = new HashMap<>();
     * for (Pair<String, Integer> pair : pairs) {
     *     if (!uniqueMap.containsKey(pair.getKey()) && !uniqueMap.containsValue(pair.getValue())) {
     *         uniqueMap.put(pair.getKey(), pair.getValue());
     *     }
     * }
     *
     * Задача 2 :
     * List<String> words = new ArrayList<>();
     * // Заполняем words словами
     * HashMap<String, Integer> wordCountMap = new HashMap<>();
     * for (String word : words) {
     *     wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
     * }
     */
}
