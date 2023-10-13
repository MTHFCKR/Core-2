package task2_collections.all.task2_0_collections_al;

import java.util.ArrayList;

/**
 * 1.Как сделать аррэй лист не содержащий дупликатов?
 *
 * 2.Что такое "capacity growth factor" (capacity growth factor)
 * и как он влияет на производительность ArrayList при увеличении размера?
 *
 *
 */
public class TheoreticalArrayList {


    public static void main(String[] args) {

        /**
         * Что выведет код?
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(1));

        /**
         * Что выведет код?
         */

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(8);
        System.out.println(list1.remove(1));

        /**
         * Что выведет код?
         */

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println(list2.get(3));


    }




































    /**
     * Ответы:
     *
     * 1.Чтобы создать ArrayList, который не содержит дубликатов элементов, вы можете воспользоваться
     * ArrayList в сочетании с HashSet.
     *
     * 2."Capacity growth factor" (фактор роста емкости) относится к тому, насколько увеличивается емкость
     * (capacity) ArrayList при необходимости увеличения размера коллекции. Этот фактор оказывает влияние
     * производительность ArrayList при операциях добавления элементов.
     * В Java стандартный фактор роста для ArrayList составляет примерно 1.5, что означает, что когда ArrayList
     * исчерпывает свою текущую емкость, он увеличит ее примерно в полтора раза. Это сделано для оптимизации
     * производительности и экономии памяти.
     *
     * Задачи. 1: B
     *         2: 2
     *         3: С
     */
}
