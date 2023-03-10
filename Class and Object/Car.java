public class Car {
    public void fullthrottle(){
        System.out.println("The car is at full throttle");
    }
    public void speed(int maxSpeed){
        System.out.println("Max Speed is " + maxSpeed);
    }
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.fullthrottle();
        car1.speed(200);
    }
}
