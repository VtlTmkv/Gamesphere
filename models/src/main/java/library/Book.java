package library;

import lombok.Data;

public @Data class Book {
    private String title;
    private Authors author;
    private int year;
}
