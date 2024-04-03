package GenericsAssignment;

import java.util.List;
import java.util.Vector;
 
public class ArithmeticOperations {
	
	public static <T extends Number> Number add(T t1, T t2) {
		return (t1.doubleValue() + t2.doubleValue());
	}
	
	public static <T extends Number> Number sub(T t1, T t2) {
		return (t1.doubleValue() - t2.doubleValue());
	}
	
	public static <T extends Number> Number div(T t1, T t2) {
		return (t1.doubleValue() / t2.doubleValue());
	}
 
	
	public static <T extends Number> Number add(List<? extends Number> list) {
		double d = 0;
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue();
 
		return d;
	}
	public static <T extends Number> Number sub(List<? extends Number> list) {
		double d = 0;
		for (int i = 0; i < list.size(); i++)
			d -= list.get(i).doubleValue();
 
		return d;
	}
	public static <T extends Number> Number div(List<? extends Number> list) {
		double d = 0;
		for (int i = 0; i < list.size(); i++)
			d /= list.get(i).doubleValue();
 
		return d;
	}
 

	public static void dumpList(List<?> list) {
		System.out.println("List dump with unbounded wildcard:");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
 
	public static void main(String[] args) {
		
		Integer i1 = 34, i2 =  43;
		System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
		System.out.println("Subtraction with generic method: " + ArithmeticOperations.sub(i1, i2));
		Float f1 = 12.56f, f2 = 3.6778f;
		System.out.println("Add with generic method: " + add(f1, f2));
		System.out.println("Sub with generic method: " + sub(f1, f2));
		System.out.println("Div with generic method: " + div(f1, f2));
		
		Vector<Number> l = new Vector<Number>();
		l.add(i1);
		l.add(i2);
		System.out.println("Add with upper bounded wildcard: " + add(l));
		System.out.println("subtraction with upper bounded wildcard: " + sub(l));
		System.out.println("subtraction with upper bounded wildcard: " + div(l));
 
		
		ArithmeticOperations.dumpList(l);
	}
}
