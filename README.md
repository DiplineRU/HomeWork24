RU text
домашнее задание основ алгоритмов, часть 2.
В сегодняшней работе требуется написать еще одну реализацию интерфейса из прошлого домашнего задания, но с дополнительными методами.
Выполненное задание присылайте на платформу в виде ссылки на pull-request.
Необходимо:
 Написать вторую реализацию интерфейса списка (скопировать и скорректировать первую) из прошлого домашнего задания, но «подогнать» под работу с целыми числами, используя ссылочный тип Integer.
 Добавить в реализацию приватный метод с самой быстрой из рассмотренных сортировок.
Для выявления самой быстрой сортировки следует сравнить сортировки по времени выполнения на случайно сгенерированном массиве со 100 000 элементов.
Замерить можно следующим кодом:
long start = System.currentTimeMillis();
ваш_метод_сортировки(arr);
System.out.println(System.currentTimeMillis() - start);
Учесть, что для сравнения сортировок нужно использовать 3 разные копии массива, т. к. сортировать уже отсортированный ранее массив некорректно.
Код самого сравнения прикладывать по желанию.
 Добавить в реализацию приватный метод бинарного поиска.
Учесть, что метод contains уже был реализован в прошлом ДЗ.
Его следует переработать, осуществив сортировку (реализованную в шаге 2) и вызвав метод бинарного поиска.

ENG text
homework of the basics of algorithms, part 2.
In today's work, it is required to write another implementation of the interface from the previous homework, but with additional methods.
Send the completed task to the platform as a link to the pull-request.
Necessary:
 Write a second implementation of the list interface (copy and correct the first one) from the previous homework, but "adjust" it to work with integers using the Integer reference type.
 Add a private method to the implementation with the fastest of the considered sorts.
To identify the fastest sort, you should compare the run-time sort on a randomly generated array with 100,000 elements.
You can measure it with the following code:
long start = System.currentTimeMillis();
your sorting method(arr);
System.out.println(System.currentTimeMillis() - start);
Note that to compare the sorts, you need to use 3 different copies of the array, because it is incorrect to sort the previously sorted array.
The code of the comparison itself can be applied at will.
 Add a private binary search method to the implementation.
Note that the contains method has already been implemented in the past.
It should be reworked by performing the sorting (implemented in step 2) and calling the binary search method.

RU text
Основы алгоритмов, часть 3.
В этом задании предстоит привести реализацию ArrayList'а к одной из стандартных библиотек Java.
Основное задание
⚠️ Для упрощения работу следует проводить с той реализацией, которая обрабатывает числа, а не строки.
Шаг 1. Реализовать приватный метод grow, который будет отвечать за расширение массива-хранилища в 1,5 раза в ситуации, когда место закончилось.
Шаг 2. Добавить проверку на заполненность в метод add и, если массив заполнен, расширить его.
Шаг 3. Изменить реализацию сортировки на рекурсивную из последней шпаргалки.

ENG text
Fundamentals of algorithms, part 3.
In this task, you will have to bring the ArrayList implementation to one of the standard Java libraries.
The main task
To simplify the work, it should be carried out with an implementation that processes numbers, not strings.
Step 1. Implement the private grow method, which will be responsible for expanding the storage array 1.5 times in a situation when the space has run out.
Step 2. Add a fill check to the add method and, if the array is full, expand it.
Step 3. Change the implementation of sorting to recursive from the last cheat sheet.
