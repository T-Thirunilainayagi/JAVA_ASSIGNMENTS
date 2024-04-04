package GenericsAssignment;

import java.util.Set;
import java.util.TreeSet;

public class FriendFinder {
	public static void main(String[] args) {
		
	
//	String name="Thiru";
//	Number age=22;
//	String location="iitm";
	
	FriendshipCriteria<String,Number> friend1=new FriendshipCriteria<String,Number>("Thiru",22);
	FriendshipCriteria<String,String> friend2=new FriendshipCriteria<String,String>("Shiv","Kbkm");
	FriendshipCriteria<String,Number> friend3=new FriendshipCriteria<String,Number>("Roshi",22);
	FriendshipCriteria<String,String> friend4=new FriendshipCriteria<String,String>("Raji","Andhra");
	
	Set<FriendshipCriteria> setvalues=new TreeSet<FriendshipCriteria>();
	setvalues.add(friend1);
	setvalues.add(friend2);
	setvalues.add(friend3);
	setvalues.add(friend4);
	

}
	
}
