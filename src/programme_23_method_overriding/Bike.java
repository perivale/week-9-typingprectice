package programme_23_method_overriding;
//creating a child class
public class Bike extends Vehicle{
    //defiing a method as have a perent class
    public void run(){
        System.out.println("bike is running safely");
    }

    public static void main(String[] args) {
        Bike bike=new Bike();//creating a obj
        bike.run();
    }
}
