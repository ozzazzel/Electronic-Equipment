
// Driver class to test the all classes
public class Driver {
public static void main(String[] args)
{
// initializing the all class's and call toString() to print the message
					 // weight, price, power usage, manufacturer
Electronics comp1 = new Computer(2.25,1500.00,10.00,"Lenovo");
Electronics comp2 = new Computer(1.5,8000.00,35.00,"HP");

Electronics cell1 = new CellPhone(0.25,500.00,10.00,"Nokia");
Electronics cell2 = new CellPhone(0.15,760.00,10.00,"Sony");
  
Electronics cam1 = new Camera(1.5,800.00,10.00,"Nickon");
Electronics cam2 = new Camera(1.5,1200.00,5,"Canon");
//display output using toString() method
System.out.println("Computers");
System.out.println("-------------------------------");
System.out.println(comp1.toString());
System.out.println(comp2.toString());
System.out.println("Cellphones");
System.out.println("-------------------------------");
System.out.println(cell1.toString());
System.out.println(cell2.toString());
System.out.println("Cameras");
System.out.println("-------------------------------");
System.out.println(cam1.toString());
System.out.println(cam2.toString());


}
  
}
