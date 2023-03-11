//Encapsulation is to make sure that the "sensitive" data is hidden from the user
class Person{
    private String name;        //private = restricted 
    public String getName(){
        return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
}

public class Encapsulation{
    public static void main(String[] args)
    {
        Person obj = new Person();
        obj.setName("Hawana");      //set the value of the name variable to "Hawana"
        System.out.println(obj.getName());
    }
}