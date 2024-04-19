package Activity11;

class AnimalSounds{
    public void Sound(){
        System.out.println("The animals make different sounds when asked ahead to speak. For example: ");
    }
}

class Cow extends AnimalSounds{
    public void Sound(){
        System.out.println("The cow says: moh moh");
    }
}

class Cat extends AnimalSounds{
    public void Sound(){
        System.out.println("The cat says: mew mew");
    }
}

class Dog extends AnimalSounds{
    public void Sound(){
        System.out.println("The dog says: bow bow");
    }
}
public class Activity11_1 {
    public static void main(String args[]){
        AnimalSounds animal = new AnimalSounds();
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        animal.Sound();
        cow.Sound();
        cat.Sound();
        dog.Sound();
    }
}
