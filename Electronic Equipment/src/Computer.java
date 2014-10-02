//Computer extends from base class Electronics
class Computer extends Electronics
{
	//use variables from Electronics and initilizate 
	//them to create the constructor for this class
Computer(double weight,double cost,double powerusage,String name)
{
this.weight = weight;
this.cost = cost;
this.powerusage = powerusage;
this.manufacturer = name;
}


}

