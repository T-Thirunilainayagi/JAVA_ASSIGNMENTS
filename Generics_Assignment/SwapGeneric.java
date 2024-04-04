package GenericsAssignment;

import java.util.ArrayList;
import java.util.List;

public class SwapGeneric {
	public	static	<J> J[]	swap(J[] list,int firstPos,	int	secondPos) {
		if(firstPos<0||secondPos>list.length||firstPos>list.length||secondPos<0) {
			throw new IndexOutOfBoundsException("Invalid arguments passed to function");
		}
		J temp;
		temp=list[firstPos];
		list[firstPos]=list[secondPos];
		list[secondPos]=temp;
		
		return list;
	}
	
	public static void main(String[] args) {

		//Declaring initial string and integer arrays
		Integer intList[]={1,2,3,4,5};
		String strList[]={"I","AM","LEARNING","JAVA"};
		
		System.out.println("Integer array before swapping");
		for(Integer I:intList)
		System.out.print(I+" ");		
		System.out.println();
		
		System.out.println("String array before swapping");
		for(String S:strList)
		System.out.print(S+" ");		
		System.out.println();

		Integer arrInt[];
		String arrStr[];
		
		//swap function call with integer and string objects
		arrStr=swap(strList,3,1);
		arrInt=swap(intList,3,1);
		
		//Displaying swapped arrays
		System.out.println("Integer array after swapping");
		for(Integer I:arrInt)
		System.out.print(I+" ");
		System.out.println();
		
		System.out.println("string array after swapping");
		for(String S:arrStr)
		System.out.print(S+" ");
		System.out.println();
	}
}
