
class Computer {
    String brand;
    String model;
    String color;
    String year;
    String type;
    int components;

    public void calculations() {
        System.out.println(this.brand + " " + this.model + " is calculating");
    }

    public void gaming() {
        System.out.println("A game's been played on " + this.brand + " " + this.model + " its type is " + this.type);
    }

    public void streaming() {
        System.out.println("A video is streaming on " + this.brand + " " + this.model + " and it has " + this.color
                + " color, which released in " + this.year);
    }

    public void coding() {
        System.out.println("A code is compiling on " + this.brand + " " + this.model + " and it has " + this.components
                + " components.");
    }

    @Override
    public String toString() {
        return "computer [brand=" + brand + ", model=" + model + ", color=" + color + ", year=" + year + ", type="
                + type + ", components=" + components + "]";
    }
}

public class Oops {
    public static void main(String[] args) {
        Computer lenovo = new Computer();
        lenovo.brand = "Lenovo";
        lenovo.model = "ThinkPad";
        lenovo.color = "Black";
        lenovo.year = "2021";
        lenovo.type = "Gaming";
        lenovo.components = 10;

        lenovo.gaming();
        lenovo.calculations();
        lenovo.streaming();
        lenovo.coding();
        // lenovo.toString();

        Computer dell = new Computer();
        dell.brand = "dell";
        dell.model = "C3PO";
        dell.color = "Grey";
        dell.year = "2019";
        dell.type = "Productivity";
        dell.components = 7;

        dell.gaming();
        dell.calculations();
        dell.streaming();
        dell.coding();
    }
}
