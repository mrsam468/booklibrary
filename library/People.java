package library;

public class People {
   public String teacher(String name){
       Books bookAvailable = new Books();

       if(!bookAvailable.booksAvailable("").contains(name)){
           return "book taken";
       }
       return "teacher";
    }
}
