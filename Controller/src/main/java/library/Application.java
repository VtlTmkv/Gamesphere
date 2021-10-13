package library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println("Введите полное имя автора для поиска. Для выхода введите 1");
        String name = name = sc.nextLine();;
        boolean flag = false;
        Library lib = new LibraryFactory().createLib();
        while (!name.equals("1")) {
            for (int i = 0; i < lib.getLibrary().length; i++) {
                if (lib.getLibrary()[i].getAuthor().getName().equals(name)) {
                    System.out.println(gson.toJson(lib.getLibrary()[i]));
                    flag = true;
                }
            }
            if (flag = false) System.out.println("Нет такой книги");
            flag = false;
            System.out.println("Введите полное имя автора для поиска. Для выхода введите 1");
            name = sc.nextLine();
        }
        sc.close();
        System.out.println("Спасибо, что пользовались нашим сервисом");
    }
}



