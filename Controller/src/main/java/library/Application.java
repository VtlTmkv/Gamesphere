package library;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите полное имя автора для поиска. Для выхода введите 1");
        String name = name = sc.nextLine();;
        boolean flag = false;
        Library lib = new LibraryFactory().createLib();
        while (!name.equals("1")) {
            for (int i = 0; i < lib.getLibrary().length; i++) {
                if (lib.getLibrary()[i].getAuthor().getName().equals(name)) {
                    System.out.println(lib.getLibrary()[i].toString());
                    flag = true;
                }
            }
            if (flag = false) System.out.println("Нет такой книги");
            flag = false;
            System.out.println("Введите полное имя автора для поиска. Для выхода введите 1");
            name = sc.nextLine();
        }
        System.out.println("Спасибо, что пользовались нашим сервисом");
    }
}



