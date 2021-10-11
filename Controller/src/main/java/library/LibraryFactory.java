package library;

import java.util.ArrayList;

public class LibraryFactory {
    public static ArrayList createLib(){
        //добавляю авторов
        Authors autor1=new Authors();
        autor1.setName("Рэй Бредберри");
        autor1.setBirthDay("22.08.1920");
        Authors autor2=new Authors();
        autor2.setName("Марк Аврелий");
        autor2.setBirthDay("26.03.121");
        Authors autor3=new Authors();
        autor3.setName("Николай Гоголь");
        Authors autor4=new Authors();
        autor4.setName("Чарльз Буковски");
        //делаю книги
        Book book1=new Book();
        book1.setAuthor(autor1);
        book1.setTitle("Вино из одуванчиков");
        book1.setYear(1957);
        Book book2=new Book();
        book1.setAuthor(autor1);
        book1.setTitle("451 градус по Фаренгейту");
        book1.setYear(1953);
        Book book3=new Book();
        book1.setAuthor(autor2);
        book1.setTitle("Наедине с собой");
        book1.setYear(180);
        Book book4=new Book();
        book1.setAuthor(autor3);
        book1.setTitle("Мертвые души");
        book1.setYear(1842);
        Book book5=new Book();
        book1.setAuthor(autor4);
        book1.setTitle("Хлеб с ветчиной");
        book1.setYear(1982);

        Book [] books={
                book1,book2,book3,book4,book5
        };

        Library lib1=new Library(books);
        return lib1.getLibrary();
    }
}
