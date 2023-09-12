package org.example;

public class ArrayDataException extends Exception{
    private int rowIndex;
    private int colIndex;

    public int getRowIndex() {
        return this.rowIndex;
    }

    public int getColIndex(){
        return this.colIndex;
    }

    public ArrayDataException(String message, int rowIndex, int colIndex){
        super(message);
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }
}
