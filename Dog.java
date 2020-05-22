class Dog {

    public int weightInPounds; // instance variable

    /* One integer constructor for dog. */
    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() { // non static method, a.k.a -> instance method.
        if (weightInPounds < 10 ) {
            System.out.println("Yip!");
        } else if (weightInPounds < 20) {
            System.out.println("Bark");
        } else {System.out.println("Woooo");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        } else {
            return d2;
        }
    }
}

// create a dog
// set it's weight
// make speceific dog make noise

// static methods VS non-static method

//static method can not access instance variable
//involking the method using the class name 0 that's why we need "static" keyword.

