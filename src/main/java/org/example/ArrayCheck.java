package org.example;

public class ArrayCheck {
    private final int SIZE = 4;
    private int rowSize;

    protected int colSize;
    private String[][] array;

    private int getColSize(String[][] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length > max) max = array[i].length;
        }
        return max;
    }

    private int getRowSize(String[][] array){
        return array.length;
    }

    public void setArrayCheck(String[][] array){
        this.array = array;
        this.rowSize = getRowSize(this.array);
        this.colSize = getColSize(this.array);
    }

    public void isSizeCorrect() throws ArraySizeException {
        if ((this.rowSize != this.colSize || this.rowSize != SIZE) == true) {
            throw new ArraySizeException("Exception: size of array is incorrect.", this.rowSize, this.colSize);
        }
    }

    private static boolean isInteger(String s) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if (!(Character.isDigit(s.charAt(0)))) return false;
        }
        return true;
    }

    public int getSum() throws ArrayDataException {
        //System.out.println("here");
        int result = 0;
        for (int i = 0; i < this.rowSize; i++) {
            for (int j = 0; j < this.colSize; j++) {
                if (isInteger(this.array[i][j])){
                    result = result + Integer.parseInt(this.array[i][j]);
                    //System.out.print("result = " + result + ", i = " + i + ", j = " + j);
                }
                else {
                    throw new ArrayDataException("Exception: data in array is incorrect.", i, j);
                }
            }
        }
        return result;
    }
}
