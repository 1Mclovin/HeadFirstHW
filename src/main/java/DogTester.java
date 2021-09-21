public class DogTester {
    public static void main(String[] args) {
        // create the object
        Dog dog1=new Dog(100,"Poodle","Big bull",5,true);

        // now set the dogs attributes
//        dog1.weight=250;
//        dog1.breed="Poodle";
//        dog1.age=5;
//        dog1.name="Big Bull";
//        dog1.fluffy=true;

        // call the void method created
        dog1.bark();

        //now print out the attribute you want
        System.out.println(dog1.age);

        // print out the whole dog you created
        System.out.println(dog1);

        // as long as we are in main we are never really doing true objects.
        //The primary focus of main is to just test and run the code we create.
    }
}
