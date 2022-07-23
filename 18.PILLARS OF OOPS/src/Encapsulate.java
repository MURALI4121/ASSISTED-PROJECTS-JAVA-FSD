class Encapsulate {

  // fields to calculate area
  int length;
  int breadth;

  // constructor to initialize values
  Encapsulate(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // method to calculate area
  public void getArea() {
    int area = length * breadth;
    System.out.println("Area: " + area);
  }
}

class Main {
  public static void main(String[] args) {

    // create object of Area
    // pass value of length and breadth
    Encapsulate rectangle = new Encapsulate(5, 6);
    rectangle.getArea();
  }
}