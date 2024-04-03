package GenericsAssignment;

import java.util.ArrayList;
import java.util.List;

public class SwapGeneric {
	public	static	<J> J[]	swap(J[] list,int firstPos,	int	secondPos) {
		J temp;
		temp=list[firstPos];
		list[firstPos]=list[secondPos];
		list[secondPos]=temp;
		
		return list;
	}
	
	public static void main(String[] args) {

		//int intList[]={1,2,3,4,5};
		Integer intList[]={1,2,3,4,5};
		String strList[]={"hiu","ht","ji","jii"};

		Integer arrList3[];
		String arrList1[];
		arrList1=swap(strList,0,1);
		arrList3=swap(intList,0,1);
		 
	}
}
