package library;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public  class Library {
    private static ArrayList Books=new ArrayList();

    public Library(@NotNull Book[] book){
        for(int i=0;i<book.length;i++)
        Books.add(book);
    }

    public ArrayList getLibrary(){
        return Books;
    }

}
