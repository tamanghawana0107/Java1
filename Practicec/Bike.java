//override in  java
class SuperBike{
    public void specs(){
        System.out.println("Super Bike is of 900cc");
    }
}
class CBR600 extends SuperBike{
    public void specs(){
        System.out.println("CBR600 is a 600cc bike");
    }
}
class Bike{
    public static void main(String[] args)
    {
        SuperBike bike1 = new SuperBike();
        CBR600 bike2 = new CBR600();
        bike1.specs();
        bike2.specs();
    }

}
