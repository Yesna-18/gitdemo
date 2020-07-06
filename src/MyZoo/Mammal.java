package MyZoo;
import java.util.ArrayList;

enum MammalType {
    ELEPHANT, GIRAFFE, ZEBRA
}

enum Category{
    ADULT, BABY
}

public class Mammal {
    public String name;
    public int age ;
    private String category;

    public Mammal(String name, int age){
        this.name = name;
        this.age = age;


        if (age >= 2){
            this.category = "Adult";
        } else {
            this. category = "Baby";
        }

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getCategory() {

        String category;
        if (age >= 2){
            category = "Adult";
        } else {
            category = "Baby";
        }

        return category;
    }



    public static void main(String[] args){

        ArrayList<Mammal> mammals = new ArrayList<>();

        mammals.add(new Mammal("Elephant", 1));
        mammals.add(new Mammal("Elephant", 6));
        mammals.add(new Mammal("Elephant", 1));
        mammals.add(new Mammal("Giraffe", 3));
        mammals.add(new Mammal("Giraffe", 3));
        mammals.add(new Mammal("Zebra", 4));


        for ( int i = 0; i < mammals.size(); i ++){
            System.out.println(mammals.get(i).name);
        }


      System.out.println(mammals.get(0).category);

    }



}






