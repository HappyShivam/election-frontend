public class MethodOverloadingDemo {
// Method to calculate the sum of two integers
public int add(int a, int b) {
System.out.println("Method with two integer parameters
called");
return a + b;
}
// Overloaded method to calculate the sum of three integers
public int add(int a, int b, int c) {
System.out.println("Method with three integer parameters
called");
return a + b + c;
}
// Overloaded method to calculate the sum of two double values
public double add(double a, double b) {
System.out.println("Method with two double parameters
called");
return a + b;
}
// Overloaded method to concatenate two strings
public String add(String a, String b) {
System.out.println("Method with two string parameters called");
return a + b;
}
// Main method to test method overloading
public static void main(String[] args) {
MethodOverloadingDemo demo = new
MethodOverloadingDemo();

// Testing method overloading with integers
int sum1 = demo.add(5, 10);
System.out.println("Sum of two integers: " + sum1);
// Testing method overloading with three integers
int sum2 = demo.add(5, 10, 15);
System.out.println("Sum of three integers: " + sum2);
// Testing method overloading with double values
double sum3 = demo.add(5.5, 10.5);
System.out.println("Sum of two doubles: " + sum3);
// Testing method overloading with strings
String result = demo.add("Hello, ", "World!");
System.out.println("Concatenated String: " + result);
}
}