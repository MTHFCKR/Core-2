package task1_generics;


/**
 * Задача 1: Обобщенный алгоритм сортировки
 *
 * Напишите обобщенный алгоритм сортировки, который работает с массивами элементов любого сравнимого типа.
 * Используйте, например, алгоритм сортировки слиянием или быструю сортировку.
 *
 * Задача 2: Обобщенный класс "Пара" с ограничением
 *
 * Реализуйте обобщенный класс "Пара", который может хранить два элемента любого типа, но при этом должен
 * выполняться определенный типовой контракт. Например, класс "Пара" может быть ограничен
 * так, чтобы оба элемента были числами.
 *
 *
 */

public class PracticalGenerics {















































    /**
     * Ответы:
     *
     * Задача 1 :
     *
     * import java.util.Arrays;
     *
     * public class GenericSort {
     *     public static <T extends Comparable<T>> void mergeSort(T[] arr) {
     *         if (arr == null) {
     *             return;
     *         }
     *         if (arr.length > 1) {
     *             int mid = arr.length / 2;
     *             T[] left = Arrays.copyOfRange(arr, 0, mid);
     *             T[] right = Arrays.copyOfRange(arr, mid, arr.length);
     *             mergeSort(left);
     *             mergeSort(right);
     *
     *             int i = 0, j = 0, k = 0;
     *             while (i < left.length && j < right.length) {
     *                 if (left[i].compareTo(right[j]) < 0) {
     *                     arr[k] = left[i];
     *                     i++;
     *                 } else {
     *                     arr[k] = right[j];
     *                     j++;
     *                 }
     *                 k++;
     *             }
     *             while (i < left.length) {
     *                 arr[k] = left[i];
     *                 i++;
     *                 k++;
     *             }
     *             while (j < right.length) {
     *                 arr[k] = right[j];
     *                 j++;
     *                 k++;
     *             }
     *         }
     *     }
     *
     *     public static void main(String[] args) {
     *         Integer[] intArray = {5, 2, 9, 3, 6};
     *         mergeSort(intArray);
     *         System.out.println(Arrays.toString(intArray));
     *
     *         String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
     *         mergeSort(stringArray);
     *         System.out.println(Arrays.toString(stringArray));
     *     }
     * }
     *
     *
     * Задача 2 :
     *
     * public class Pair<A extends Number, B extends Number> {
     *     private A first;
     *     private B second;
     *
     *     public Pair(A first, B second) {
     *         this.first = first;
     *         this.second = second;
     *     }
     *
     *     public A getFirst() {
     *         return first;
     *     }
     *
     *     public B getSecond() {
     *         return second;
     *     }
     *
     *     public double sum() {
     *         return first.doubleValue() + second.doubleValue();
     *     }
     *
     *     public double product() {
     *         return first.doubleValue() * second.doubleValue();
     *     }
     *
     *     public static void main(String[] args) {
     *         Pair<Integer, Double> pair1 = new Pair<>(3, 4.5);
     *         System.out.println("Sum: " + pair1.sum()); // Выведет: Sum: 7.5
     *         System.out.println("Product: " + pair1.product()); // Выведет: Product: 13.5
     *
     *         Pair<Double, Double> pair2 = new Pair<>(2.5, 1.5);
     *         System.out.println("Sum: " + pair2.sum()); // Выведет: Sum: 4.0
     *         System.out.println("Product: " + pair2.product()); // Выведет: Product: 3.75
     *     }
     * }
     *
     *
     */
}











