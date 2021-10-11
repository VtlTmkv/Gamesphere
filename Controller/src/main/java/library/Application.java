package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ArrayList libb=new LibraryFactory().createLib();
        for (Object a:libb){
            System.out.println(a.toString());
        }
    }
}
