package org.example;

/*

1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.

 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Nice)");

        System.out.println("1 task");

        StringArray2D myCorrectStringArray = new StringArray2D(4, true);
        //myCorrectStringArray.show();

        System.out.println("_______________________________________________________");
        StringArray2D myIncorrectStringArray = new StringArray2D(4, false);
        //myIncorrectStringArray.show();

        System.out.println("_______________________________________________________");
        StringArray2D myIncorrectSize = new StringArray2D(6, true);
        myIncorrectSize.show();

        try {
            ArrayCheck myArrayCheck = new ArrayCheck();
            myArrayCheck.setArrayCheck(myIncorrectSize.getArray());
            myArrayCheck.isSizeCorrect();
            System.out.println("Sum of elements in array = " + myArrayCheck.getSum());
        }
        catch (ArraySizeException e){
            System.out.printf("Exception: size of array is different. Number of rows = %d. Number of cols = %d.",e.getRowSize(),e.getColSize());
        }
        catch (ArrayDataException e){
            System.out.printf("Exception: data in array is incorrect. Row index = %d. Col index = %d.",e.getRowIndex(),e.getColIndex());
        }
    }



}