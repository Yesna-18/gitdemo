package MyZoo;


public class Zoo {

    public String name = "All animal's Land";
    public String species;
    public int age;
    public String category;


    public String getCategory( String category) {

        if (age >= 2){
            category = "Adult";
        } else {
            category = "Baby";
        }
        return category;
    }



    public static void main (String[] args){

        Mammal mammal = new Mammal("Giraffe", 5);
        Mammal mammal1 = new Mammal("Giraffe", 1);





    }
}
