class pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("write something");
    }

    public void printcolor()
    {
        System.out.println(color);
    }
}





public class java22{
    public static void main(String[] args) {
        pen p = new pen();
        p.color = "Blue";
        p.type = "ball point";
        p.write();
        p.printcolor();

        pen p1 = new pen();
        p1.color = "Red";
        p1.type = "Gel";
        p1.printcolor();


    }
}