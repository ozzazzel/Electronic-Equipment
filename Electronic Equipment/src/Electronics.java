/**
 *   @author Oscar
 *   Create abstract class "Electronics" since all devices are electronics, include method toString()
     to display output.
 *  Create own methods for each class
 *  add and initialize parameters.
 *  
 *  In MainDriver create objects of the different classes and use toString() to display output.
 *
 * Pseudo code 
 * 
class ReadingMaterials { { toString() } }
class Camera extends Electronics{ (weight,cost,powerusage,manufacturer)  }
class Cellphone extends Electronics{ (weight,cost,powerusage,manufacturer)  }
class Computer extends Electronics{ (weight,cost,powerusage,manufacturer)  }
}
public class MainDriver {
 public static void main(String[] a) {
Electronics comp1 = new Computer(double,double,double,String);
Electronics cell1 = new CellPhone();
Electronics cam1 = new Camera();

comp1,cell1,cam1.toString();

  }
}
 */
// Electronic class is for just fundamental because all devices are Electronics
//The purpose of this abstract class is to function as a base for subclasses.
abstract class Electronics
{
	public double weight,cost,powerusage;
	public String manufacturer;
	

	 // method for all classes to display output
public String toString()
{

return "Weight: "+weight+" kg"+"\n"+"Cost : $"+cost+"\n"+"Power Usage : "+powerusage+
		"V"+"\n"+"Manufacturer : "+manufacturer+"\n"+"-------------------------------";
}

  
}
