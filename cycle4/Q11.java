import java.util.*;
public class Q11 {
public static void main(String[] args){
System.out.println("name:Seekanth pradeep\n roll no: 52\n date:15-04-24"); 
System.out.println("Program 21 : Program to remove all the elements from a linked list");
LinkedList<String> L=new LinkedList<>();
L.add("JAVA");
L.add("PYTHON");
L.add("CSS");
L.add(0,"PROGRAMING LANGUAGE");
System.out.println(L);
L.remove("CSS");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);
}
}
