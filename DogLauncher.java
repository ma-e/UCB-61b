public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(5); //Declaration, Instantiation, and Assignment.
        Dog d2 = new Dog(10);
//        d1.makeNoise();

//        Dog[] dogs = new Dog[2];
//        dogs[0] = new Dog(8);
//        dogs[1] = new Dog(20);
//        dogs[0].makeNoise();
//        dogs[1].makeNoise();
        
        Dog bigger = Dog.maxDog(d1,d2);
        System.out.println(bigger.weightInPounds);
        
    }
}
