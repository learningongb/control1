## Итоговая контрольная работа №1

# Задача:
Написать программу, которая из имеющегося массива строк формирует новый массив из строк, длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.

# Алгоритм решения
1. Создать переменную для хранения количества подходящих элементов
2. Выбрать очередной элемент исходного массива
3. Если длина элемента массива удовлетворяет заданному условию, увеличить количество подходящих элементов
4. Повторять шаги 2 - 3 до конца массива
5. Создать результирующий массив
6. Если количество подходящих элементов равно 0, вернуть пустой результирующий массив
7. Выбрать очередной элемент исходного массива
8. Если длина элемента массива удовлетворяет заданному условию, добавить элемент в результирующий массив
9. Повторять шаги 7 - 8 до конца массива
