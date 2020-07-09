package agal;

import java.util.*;

abstract class Compartment {
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
		return "first class compartment";
	}
	
}
class Ladies extends Compartment{
	public String notice() {
		return "ladies compartment";
	}
}
class General extends Compartment{
	public String notice() {
		return "general compartment";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "luggage compartment";
	}
}
public class TestCompartment{
	public static void main(String args[]){
		Compartment compartment[]=new Compartment[10];
		for(int i=0;i<10;i++){
			int x=new Random().nextInt(5);
			switch(x){
			case 1:compartment[i]=new Luggage();break;
			case 2:compartment[i]=new Ladies();break;
			case 3:compartment[i]=new General();break;
			case 4:compartment[i]=new FirstClass();break;
			}
			try{
			System.out.println((i+1)+" is a "+compartment[i].notice());
			}catch(Exception e){
			}
		}
	}
}