package library;

import java.util.PriorityQueue;

public class Library {
    public String bookLibrary(){
        PriorityQueue<People> queue = new PriorityQueue();
        queue.add(new People("teacher",1));
        queue.add(new People("junior student" , 3));
        queue.add(new People("senior student",2));
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        return "book taken";
    }
    public static void main(String[] args){
        Library librabry = new Library();
        librabry.bookLibrary();
    }
}
