package library;

import org.jetbrains.annotations.NotNull;

public  class Library {

    private static Book [] books = new Book[5];

    public Library(@NotNull Book[] book) {
        for (int i = 0; i < book.length; i++) {
            books[i] = book[i];
        }
    }
    public Book[] getLibrary(){
        return this.books;
    }

}
