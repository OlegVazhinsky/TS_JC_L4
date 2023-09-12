package org.example;

import java.util.ArrayList;

public class ArraySizeException extends Exception{
    private int rowSize;
    private int colSize;

    public int getRowSize() {
        return this.rowSize;
    }

    public int getColSize(){
        return this.colSize;
    }

    public ArraySizeException(String message, int rowSize, int colSize){
        super(message);
        this.rowSize = rowSize;
        this.colSize = colSize;
    }
}
