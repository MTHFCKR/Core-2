package task1_generics;

/**
 * 1.Что такое стирание типов (type erasure) и как оно связано с дженериками в Java?
 *
 * 2.Что такое реификация типов (type reification) и почему она отсутствует в дженериках Java?
 *
 * 3.Какие ограничения существуют при использовании дженериков с массивами в Java?
 */
public class TheoreticalGenerics {

    /**
     * Что выведет код?
     */

    public class GenericExample {
        public static <T> T identity(T value) {
            return value;
        }

        public static void main(String[] args) {
            Integer integer = 42;
            String string = "Hello, World";

            Integer result1 = identity(integer);
            String result2 = identity(string);

            System.out.println(result1);
            System.out.println(result2);
        }
    }

    /**
     * Что выведет код?
     */

    public class GenericExample1 {
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] stringArray = {"apple", "banana", "cherry"};

            printArray(intArray);
            printArray(stringArray);
        }
    }


































    /**
     * 1.Стирание типов (type erasure) - это механизм в Java, который удаляет информацию о типах дженериков
     * во время компиляции и заменяет ее на общий тип (например, Object). Это делается для обеспечения
     * совместимости с более ранними версиями Java, которые не поддерживали дженерики. Стирание типов
     * означает, что информация о типах параметров дженериков не доступна во время выполнения.
     *
     * 2.Реификация типов - это возможность сохранять информацию о типах дженериков во время
     * выполнения программы. Java не поддерживает реификацию типов в полной мере из-за стирания типов
     * (type erasure). В результате, информация о типах дженериков не доступна во время выполнения,
     * что может вызывать некоторые ограничения при работе с дженериками. Java приходится использовать
     * механизмы обхода (workarounds) и рефлексии для обхода этой проблемы.
     *
     * 3.В Java нельзя создавать массивы напрямую с параметризованным типом, таким как ArrayList<String>[].
     * Это ограничение связано с стиранием типов, так как информация о типах дженериков теряется во время выполнения.
     * Однако можно создать массив с не параметризованным типом и выполнить приведение типов.
     *
     *
     * Задачи:
     *1 задача
     *  *            Integer result1 = identity(integer); // Выведет: 42
     *  *             String result2 = identity(string);   // Выведет: Hello, World
     *
     *  2 задача
     *         printArray(intArray); // Выведет: 1 2 3 4 5
     *             printArray(stringArray); // Выведет: apple banana cherry
     */

}
