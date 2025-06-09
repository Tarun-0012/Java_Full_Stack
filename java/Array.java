import java.util.*;
class Array{
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Stored Names:");
        for (String name:names) {
            System.out.println(name);
        }

       }
}