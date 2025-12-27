package library;

import java.util.LinkedList;
import java.util.List;

public class Books {
    public List<String> booksAvailable(String bookName){
        List<String> booksLists = new LinkedList<>();

         booksLists.add("kite runners");
         booksLists.add("wings on fire");
        booksLists.add("the giver");
        booksLists.add("the hunger game");
        booksLists.remove(bookName);
        System.out.println(booksLists);
        return booksLists;
    }
    public static void main(String[] args){
        Books books = new Books();
        People people = new People();
        System.out.println(people.teacher("the giver"));
        System.out.println(books.booksAvailable("the hunger game").contains("the"));

    }
}
