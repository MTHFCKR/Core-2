package task2_collections.all.task2_3_collection_q_and_d;

/**
 * 1.У вас есть список задач, каждая из которых имеет приоритет (целое число). Напишите код для реализации
 * очереди с приоритетом с использованием PriorityQueue. При извлечении элемента из очереди должны извлекаться
 * задачи с более высоким приоритетом.
 *
 * 2.У вас есть очередь, содержащая символы. Напишите код для проверки, является ли содержимое
 * очереди палиндромом (читается одинаково как с начала, так и с конца) без извлечения элементов из очереди.
 *
 *
 */
public class PracticalQueueAndDeque {






































    /**
     * 1.class Task {
     *     private String name;
     *     private int priority;
     *
     *     public Task(String name, int priority) {
     *         this.name = name;
     *         this.priority = priority;
     *     }
     *
     *     public String getName() {
     *         return name;
     *     }
     *
     *     public int getPriority() {
     *         return priority;
     *     }
     * }
     *
     * PriorityQueue<Task> priorityQueue = new PriorityQueue<>((t1, t2) -> t2.getPriority() - t1.getPriority());
     *
     * priorityQueue.offer(new Task("Task A", 2));
     * priorityQueue.offer(new Task("Task B", 1));
     * priorityQueue.offer(new Task("Task C", 3));
     *
     * while (!priorityQueue.isEmpty()) {
     *     Task task = priorityQueue.poll();
     *     System.out.println("Executing task: " + task.getName() + " (Priority: " + task.getPriority() + ")");
     * }
     *
     *
     * 2.Queue<Character> queue = new LinkedList<>();
     * queue.offer('r');
     * queue.offer('a');
     * queue.offer('c');
     * queue.offer('e');
     * queue.offer('c');
     * queue.offer('a');
     * queue.offer('r');
     *
     * Deque<Character> stack = new LinkedList<>();
     *
     * boolean isPalindrome = true;
     *
     * for (Character c : queue) {
     *     stack.addFirst(c);
     * }
     *
     * for (Character c : queue) {
     *     if (!c.equals(stack.pollFirst())) {
     *         isPalindrome = false;
     *         break;
     *     }
     * }
     *
     * System.out.println("Is palindrome: " + isPalindrome);
     */
}
