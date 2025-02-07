abstract class Animal{
    abstract void sound();
}

class Lion extends Animal{
    void sound(){
        System.out.println("ROAR...");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("MEOW...");
    }
}

class AbstractClass{
    public static void main(String[] args){
        Animal a = new Cat();

        a.sound();

        a = new Lion();

        a.sound();
    }
}