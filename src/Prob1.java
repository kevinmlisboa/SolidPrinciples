import Problem1.Dog;
import Problem1.Pet;
import Problem1.PetBehavior;

public class Prob1 {
    public static void main(String[] args) {
        Pet myPet = new Pet("Buddy", "John");
        PetBehavior dog = new Dog();  

        System.out.println(myPet.getPetName() + " says: " + dog.makeSound());
        System.out.println(myPet.getPetName() + " is " + dog.eat());
    }
}