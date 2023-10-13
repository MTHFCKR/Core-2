package task2_collections.all.task2_4_collections_ll_and_tm;

/**
 * 1.Предположим, у вас есть односвязный связанный список (linked list) и вы хотите найти средний элемент
 * этого списка. Напишите метод для нахождения среднего элемента.
 *
 * 2.Предположим, у вас есть TreeMap, в котором ключами являются целые числа, а значениями - строки. Напишите
 * метод для нахождения ключа, соответствующего минимальной лексикографический строке.
 *
 */
public class PracticalLinkedListAndTreeMap {
































    /**
     * 1.public class ListNode {
     *     int val;
     *     ListNode next;
     *
     *     public ListNode(int val) {
     *         this.val = val;
     *     }
     * }
     *
     * public int findMiddle(ListNode head) {
     *     ListNode slow = head;
     *     ListNode fast = head;
     *
     *     while (fast != null && fast.next != null) {
     *         slow = slow.next;
     *         fast = fast.next.next;
     *     }
     *
     *     return slow.val;
     * }
     *
     *
     * 2.public <K, V> K findKeyWithMinLexicographicValue(TreeMap<K, V> treeMap) {
     *     if (treeMap.isEmpty()) {
     *         return null;
     *     }
     *
     *     Map.Entry<K, V> minEntry = treeMap.firstEntry();
     *     for (Map.Entry<K, V> entry : treeMap.entrySet()) {
     *         if (entry.getValue().toString().compareTo(minEntry.getValue().toString()) < 0) {
     *             minEntry = entry;
     *         }
     *     }
     *
     *     return minEntry.getKey();
     * }
     */

}
