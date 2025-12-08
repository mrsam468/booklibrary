package library;

public class People implements Comparable<People>{
    String name;
    int num;
    public People(String name,int num){
        this.name = name;
        this.num = num;
    }
    public int compareTo(People comparedPeople){
        return Integer.compare(
                num,comparedPeople.num
        );
    }
    public String toString(){
        return name;
    }
}
