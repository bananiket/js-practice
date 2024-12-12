// class Fruit {
//   // Attributes / Properties / Variables / State
//   String name;
//   String color;
//   String taste;
//   boolean isSeasonal;

//   // Methods / Behaviour
//   public void eat() {
//     System.out.println(this.name + "is being eaten!");
//   }

//   public void wash() {
//     System.out.println(this.name + "is being washed!");
//   }
// }

// class Person {
//   String name;
//   int age;
//   String gender;
//   String religion;
//   String dob;

//   public void walking() {
//     System.out.println(this.name + " is walking");
//   }

//   public void eating() {
//     System.out.println(this.name + " is eating");
//   }

//   public void sleeping() {
//     System.out.println(this.name + " is sleeping");
//   }

//   // @Override
//   public String toString() {
//     return "Person(" + name + ") [name=" + name + ", age=" + age + ", gender=" + gender + ", religion=" + religion
//         + ", dob=" + dob
//         + "]";
//   }
// }

// class Car {

//   Car(){
//     System.out.println("Constructor called");
//   }
//   // Properties
//   String brand;
//   String model;
//   String year;
//   String color;
//   String type;
//   String fuelType;

//   // Behaviour

//   public void drive() {
//     System.out.println(this.brand + " " + this.model + " is being driven");
//   }

//   public void accelerate() {
//     System.out.println(this.brand + " " + this.model + " is being accelerated");
//   }

//   @Override
//   public String toString() {
//     return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color + ", type=" + type
//         + ", fuelType=" + fuelType + "]";
//   }
// }

// public class Classobj {
//   public static void main(String[] args) {
//     // Obj is nothing an instance of class
//     // Object creation
//     // Person jerin = new Person(); // Syntax
//     // Person aniket = new Person();
//     // System.out.println(jerin.name);
//     // System.out.println(aniket.name);
//     // jerin.name = "Jerin";
//     // aniket.name = "aniket";
//     // aniket.age = 22;
//     // System.out.println(jerin.name);
//     // System.out.println(aniket.name);
//     // jerin.age = 22;
//     // jerin.dob = "02/06/2001";
//     // jerin.gender = "Male";
//     // jerin.religion = "bleh";

//     // jerin.eating();
//     // jerin.sleeping();
//     // jerin.walking();
//     // aniket.eating();

//     // // System.out.println(jerin.toString());

//     // Car mercedes = new Car();
//     // mercedes.brand = "Mercedes";
//     // mercedes.model = "4Matic";
//     // mercedes.color = "Black";
//     // mercedes.fuelType = "Petrol";
//     // mercedes.type = "SUV";
//     // mercedes.year = "2069";

//     Car suzuki = new Car(
//     );
    // suzuki.brand = "Suzuki";
    // suzuki.model = "Swift";
    // suzuki.color = "Black";
    // suzuki.fuelType = "CNG";
    // suzuki.type = "Sedan";
    // suzuki.year = "2069";

//     // suzuki.accelerate();

//     // System.out.println(mercedes.toString());
//     // System.out.println(suzuki.toString());

//   }
// }


class A {
  // It is a special type of method
  // Constructor
  // Same name as class
  // Called when object created
  String name;
  int age;
  String school;
  String address;

  // Default constructor (No params)
  // A(){
  //   System.out.println("Constructor of A called.");
  // }

  // Parameterized Constructor
  // A(String name, int age, String school, String address) {
  //   this.name = name;
  //   this.age = age;
  //   this.address = address;
  //   this.school = school;

  //   System.out.println(
  //       "Name : " + name);
  //   System.out.println(
  //       "Age : " + age);
  //   System.out.println(
  //       "Address : " + address);
  //   System.out.println(
  //       "School : " + school);
  // }


  A(String name, int age, String school, String address) {
    this.name = name;
    this.age = age;
    this.school = school;
    this.address = address;
  }

  public void random(){
    System.out.println(name + " is doing random shit.");
  }
}

class Classobj {
  public static void main(String[] args) {
    A a1 = new A("Jack", 18, "BVPS", "Sec 3");
    a1.random();
    A a2 = new A("Jill", 16, "BVPS2", "Sec 36");
    a2.random();
  }
}