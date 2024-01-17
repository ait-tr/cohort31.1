public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Opel", "BBB6754", Color.RED );
        printAllColors();
        System.out.println("---------------------------------");
        System.out.println(getColor("RED"));

        System.out.println("------  colors 2 --------------");
        Color2 c2= Color2.GREEN;
        c2.printText();
        c2=Color2.BLACK;
        c2.printText();

        System.out.println("-------------  color 3 --------------");
        Color3 c3=Color3.BLACK;
        System.out.println(c3);

        // Red
        //RED
        //RAD
        // iuw

    }
    public static Color getColor(String colorString){
        //if(colorString.equals("red")) return Color.RED;
        return Color.valueOf(colorString);

    }
    public static void printAllColors(){
        //if(colorString.equals("red")) return Color.RED;

        for (Color color: Color.values()){
            System.out.println(color);
        }
    }

}