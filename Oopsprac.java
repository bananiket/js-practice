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
    A(String name, int age, String school, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
      this.school = school;
  
      System.out.println(
          "Name : " + name);
      System.out.println(
          "Age : " + age);
      System.out.println(
          "Address : " + address);
      System.out.println(
          "School : " + school);
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
