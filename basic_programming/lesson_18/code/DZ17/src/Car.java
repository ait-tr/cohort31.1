public class Car {
    private String brand;
    private String color;
    private String licensePlate;
    private MyDate registrationDate;
    private Engine engine;

    private boolean isDrive;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine){
        this.brand=brand;
        this.color=color;
        this.engine=engine;
        this.licensePlate=licensePlate;
        this.registrationDate=registrationDate;
        isDrive=false; // the state of the car
    }


    public void  ignition(){
        engine.start();
    }


    public String toString(){
        return  color + " " + brand+ " (" + licensePlate + " "+ registrationDate.toString()+")" + engine.toString() + " isDrive:" +isDrive;
    }

    public  void drive(){
        if (isDrive) {
            System.out.println("This car " + toString()+"   is going now");
            return;
        }
        engine.start();
        isDrive = true;
        System.out.println("The Car " + toString() + " " + "DRIVE!!!");
    }

    public  void stop(){
        if (!isDrive) {
            System.out.println("This car " + toString()+"   STOP! You can't stop car twice!");
            return;
        }
        engine.stop();
        isDrive=false;
        System.out.println("The Car " + toString() +" "+ "STOP!!!");
    }

}
