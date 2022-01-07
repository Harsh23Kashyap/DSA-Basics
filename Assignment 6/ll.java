import java.util.LinkedList;

class Main1
{
    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        for (String str:animals)
            System.out.print(str+" ");
        System.out.println();
        animals.add(1,"Rabbit");
        for (String str:animals)
            System.out.print(str+" ");
        System.out.println();
        animals.set(1,"Cow");
        for (String str:animals)
            System.out.print(str+" ");
        System.out.println();
        animals.remove("Horse");
        for (String str:animals)
            System.out.print(str+" ");
        System.out.println();
        System.out.println(animals.size());

    }
}