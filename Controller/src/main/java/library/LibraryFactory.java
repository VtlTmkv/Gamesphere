package library;

public class LibraryFactory {
    public static Library createLib(){
        //добавляю авторов
        Authors autor1=new Authors();
        autor1.setName("Рэй Бредберри");
        autor1.setBirthDay("22.08.1920");
        Authors autor2=new Authors();
        autor2.setName("Марк Аврелий");
        autor2.setBirthDay("26.03.121");
        Authors autor3=new Authors();
        autor3.setName("Николай Гоголь");
        autor3.setBirthDay("22.08.1920");
        Authors autor4=new Authors();
        autor4.setName("Чарльз Буковски");
        autor4.setBirthDay("22.08.1920");
        //делаю книги
        Book book1=new Book();
        book1.setAuthor(autor1);
        book1.setTitle("Вино из одуванчиков");
        book1.setYear(1957);

        Book book2=new Book();
        book2.setAuthor(autor1);
        book2.setTitle("451 градус по Фаренгейту");
        book2.setYear(1953);

        Book book3=new Book();
        book3.setAuthor(autor2);
        book3.setTitle("Наедине с собой");
        book3.setYear(180);

        Book book4=new Book();
        book4.setAuthor(autor3);
        book4.setTitle("Мертвые души");
        book4.setYear(1842);

        Book book5=new Book();
        book5.setAuthor(autor4);
        book5.setTitle("Хлеб с ветчиной");
        book5.setYear(1982);
        Book [] books={
                book1,book2,book3,book4,book5
        };

        Library lib1=new Library(books);
        return lib1;
    }
}
