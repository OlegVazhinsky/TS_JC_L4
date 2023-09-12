package org.example;

import java.util.Random;

public class StringArray2D {
    private char[] charArray = {'0','1','2','3','4','5','6','7','8','9','w','a','i','t'};
    protected int size;
    protected String[][] array;

    private String[][] getRandomArray(int size, boolean onlyString){
        String[][] result = new String[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if (onlyString) result[i][j] = this.charArray[random.nextInt(10)] + "";
                else result[i][j] = this.charArray[random.nextInt(charArray.length)] + "";
            }
        }
        return result;
    }

    protected StringArray2D(int size, boolean onlyString){
        this.array = getRandomArray(size, onlyString);
        this.size = size;
    }

    public void show(){
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public String[][] getArray() {
        return array;
    }
}
