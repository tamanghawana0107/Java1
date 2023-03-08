abstract class Animal1{
    public void Animal1(){
        System.out.println("There are two animal");
    }
    public abstract void speak();
}
 class Dog extends Animal1{
    public void speak()
    {
        System.out.println("The dog speaks woof woof");
    }
}
public class Animal{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        Animal1 an = new Animal1(){
            public void speak()
            {
                System.out.println("Cat speaks meow");
            }
        };
        d.speak();
        an.speak();
        an.Animal1();
       // an.Animal1();
    }
}

