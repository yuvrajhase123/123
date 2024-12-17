interface vehicles{
    public void speedUp(int a);
    public void gearChange(int b);
    public void applyBreaks();
}
class Bicycle implements vehicles{
    private int speed;
    int gear;

    public int getspeed(){
        return this.speed;
    }
    public void setspeed(int speed){
        this.speed=speed;
    }

    public void speedUp(int increment){
        this.speed=this.speed+increment;
    }
    public void gearChange(int change){
        this.gear=change;
    }
    public void applyBreaks(){
        this.speed=0;
        this.gear=0;
    }
    public void display(){
        System.out.println("bicycle information");
        System.out.println("speed of bicycle is: "+this.speed);
        System.out.println("gear of bicycle is: "+this.gear);

    }
}
class Car implements vehicles{
    private int speed;
    int gear;

    public int getspeed(){
        return this.speed;
    }
    public void setspeed(int speed){
        this.speed=speed;
    }

    public void speedUp(int increment){
        this.speed=this.speed+increment;
    }
    public void gearChange(int change){
        this.gear=change;
    }
    public void applyBreaks(){
        this.speed=0;
        this.gear=0;
    }
    public void display(){
        System.out.println("car information");
        System.out.println("speed of car is: "+this.speed);
        System.out.println("gear of car is: "+this.gear);

    }
}
class Bike implements vehicles{
    private int speed;
    int gear;
    
    public int getspeed(){
        return this.speed;
    }
    public void setspeed(int speed){
        this.speed=speed;
    }
    
    public void speedUp(int increment){
        this.speed=this.speed+increment;
    }
    public void gearChange(int change){
        this.gear=change;
    }
    public void applyBreaks(){
        this.speed=0;
        this.gear=0;
    }
    public void display(){
        System.out.println("bike information");
        System.out.println("speed of bike is: "+this.speed);
        System.out.println("gear of bike is: "+this.gear);
    
    }
    

}
public class Interface {
    public static void main(String[] args) {
        // Bicycle
        Bicycle bicycle = new Bicycle();
        System.out.println("Initial Speed of bicycle: " + bicycle.getspeed());
        bicycle.setspeed(20);
        bicycle.speedUp(5);
        bicycle.gearChange(4);
        bicycle.display();
        System.out.println(" ");
        bicycle.applyBreaks();
        bicycle.display();

        // Car
        Car car = new Car();
        System.out.println("Initial Speed of car: " + car.getspeed());
        car.setspeed(20);
        car.speedUp(5);
        car.gearChange(4);
        car.display();
        System.out.println(" ");
        car.applyBreaks();
        car.display();

        // Bike
        Bike bike = new Bike();
        System.out.println("Initial Speed of bike: " + bike.getspeed());
        bike.setspeed(20);
        bike.speedUp(5);
        bike.gearChange(4);
        bike.display();
        System.out.println(" ");
        bike.applyBreaks();
        bike.display();
    }
}