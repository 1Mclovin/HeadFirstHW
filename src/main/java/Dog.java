public class Dog {
    //instance Variables first
    int weight;
    String breed;
    String name;
    int age;
    boolean fluffy;

//constructor

    public Dog(int weight,String breed, String name, int age, boolean fluffy) {
        this.weight = weight;
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.fluffy = fluffy;
    }

    // method
    public static void bark() {

        System.out.println("Ruff Ruff");

    }
// go test this in tester


    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fluffy=" + fluffy +
                '}';
    }
}


