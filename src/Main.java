import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("Cat");
//        animals.add("Cow");
//        animals.add("Dog");
//        animals.add("Cat");
//
//
//        ArrayList<String> uniqueAnimals = new ArrayList<>();
//        for (String animal : animals) {
//            if (!uniqueAnimals.contains(animal)) {
//                uniqueAnimals.add(animal);
//            }
//        }
//
//
//        for (String animal : uniqueAnimals) {
//            System.out.println(animal);
//        }

        /*1.Напишите программу на Java для вставки элемента в список массивов
в первую позицию.
2.Напишите программу на Java для извлечения элемента (по
указанному индексу) из заданного списка массивов.
3.Напишите программу на Java для обновления элемента массива по
заданному элементу.
4.Напишите программу на Java для удаления третьего элемента из
списка массива.
5.Напишите программу на Java для поиска элемента в списке массива.
6.Напишите программу на Java для извлечения части списка массива.
7.Напишите программу на Java для объединения двух списков
массивов.
8.Напишите программу на Java для перестановки элементов в списке
массива.
9.Напишите программу на Java для очистки списка массивов.
10.Напишите программу на Java, проверяющую, пуст ли список
массивов или нет */


        ArrayList<String>students= new ArrayList<>();
        students.add("Kurmanbek");
        students.add("Kasiet");
        students.add("Nurkyz");
        students.add("Omurzak");


        //1 Java программасы менен массивдер тизмесине элементти биринчи позицияга кошуу.

        System.out.println("1:");

        students.add(0, "New Element");

        System.out.println(students);

       //2Java программасы менен берилген массивдер тизмесинен элементти (көрсөтүлгөн индекске ылайык) алуу.

        System.out.println("2:");

        String element = students.get(1); // Извлечение элемента с индексом 1 (второй элемент)

        System.out.println("Extracted element: " + element);

        //3 Java программасы менен берилген элементке жараша массив элементин жаңыртуу.

        System.out.println("3:");


        students.set(1, "Updated Element"); // Обновление элемента с индексом 1

        System.out.println(students);

        //4 Java программасы менен массивдер тизмесинен үчүнчү элементти өчүрүү.

        System.out.println("4:");

        students.remove(2); // Удаление элемента с индексом 2 (третий элемент)

        System.out.println(students);

        //5 Java программасы менен массивдер тизмесинде элементти издөө.

        System.out.println("5:");

        boolean found = students.contains("B");

        if (found) {
            System.out.println("Element found in the list.");
        } else {
            System.out.println("Element not found in the list.");
        }

        //6 Java программасы менен массивдер тизмесинен бир бөлүгүн алуу.

        System.out.println("6:");

        // Тизмеден бөлүгүн алуу (мисалы, 1-индекстан 3-индекске чейин, 3 индексти кошпогондо)
        List<String> sublist = students.subList(1, 3);

        // Тизмеден алынган бөлүктү басып чыгаруу
        System.out.println(sublist);

        //7 Java программасы менен эки массивдер тизмесин бириктирүү.

        System.out.println("7:");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");

        list1.addAll(list2);

        System.out.println(list1);

        //8 Java программасы менен массивдер тизмесиндеги элементтерди орундарын алмаштыруу.

        System.out.println("8:");

        Collections.swap(students, 0, 2); // Перестановка элементов с индексами 0 и 2

        System.out.println(students);

        //9 Java программасы менен массивдер тизмесин тазалоо.

        System.out.println("9:");

        students.clear();

        System.out.println(students);

        //10 Java программасы менен массивдер тизмеси бошпу же жокпу текшерүү.

        System.out.println("10:");

        boolean isEmpty = students.isEmpty();

        if (isEmpty) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }






    }
}