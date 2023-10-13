package task2_collections.all.task2_3_collection_q_and_d;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 1.Какие методы Deque позволяют выполнять операции добавления и извлечения элементов в начале и конце очереди,
 * а также обрабатывать исключения при неудачных попытках?
 *
 * 2.В каких случаях полезно использовать Deque вместо обычной Queue?
 *
 * 3.Как работает "двусторонняя очередь с ограничением" (Blocking Deque) и в каких сценариях она может быть полезной?
 */
public class TheoreticalQueueAndDeque {

    public static void main(String[] args) {

        /**
         * Что выведет код?
         */

        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


        /**
         * Что выведет код?
         */

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());















        /**
         * Ответы :
         *
         * 1.Методы Deque, позволяющие выполнять операции добавления и извлечения элементов в
         * начале и конце очереди, а также обрабатывать исключения при неудачных попытках:
         *
         * addFirst(E e) и offerFirst(E e): добавление элемента в начало очереди.
         * addLast(E e) и offerLast(E e): добавление элемента в конец очереди.
         * removeFirst(), pollFirst(), pop(): извлечение и удаление элемента из начала очереди.
         * removeLast(), pollLast(): извлечение и удаление элемента из конца очереди.
         * getFirst(), peekFirst(): получение, но не удаление элемента из начала очереди.
         * getLast(), peekLast(): получение, но не удаление элемента из конца очереди.
         *
         * 2.Deque полезно использовать в следующих случаях:
         *
         * Когда требуется эффективное добавление и извлечение элементов как с начала, так и с конца коллекции.
         * При необходимости реализации стека (LIFO) или очереди (FIFO) с эффективной поддержкой операций
         * вставки и извлечения как в начале, так и в конце.
         *
         * 3."Двусторонняя очередь с ограничением" (Blocking Deque) - это Deque, который обеспечивает
         * блокировку потоков при попытках добавления элемента, когда очередь полна, или извлечения элемента,
         * когда очередь пуста. Это может быть полезно в сценариях, где необходима синхронизация и ожидание доступности элементов.
         *
         * Примеры использования Blocking Deque:
         *
         * Пул задач, где разные потоки ожидают доступности задач для выполнения.
         * Реализация ограниченного буфера, где производители блокируются, если буфер полон, и потребители блокируются,
         * если буфер пуст.
         * Blocking Deque может обеспечить безопасность потоков в ситуациях, где другие структуры данных могут
         * привести к гонкам или нежелательной потере данных.
         *
         * Задачи :
         *
         * 1:
         *  A
         *  B
         *  C
         *  null
         *
         * 2:
         *  3
         *  4
         *  1
         *  null
         */
    }
}
