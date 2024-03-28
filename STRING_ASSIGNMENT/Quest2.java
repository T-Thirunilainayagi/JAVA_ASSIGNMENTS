package StringAssignment;

public class Quest2 {
	public static void main(String[]args) {
		String name="Thirunilainayagi";
		int countVow=0;
		int countCons=0;
		for(int index=0;index<name.length();index++) {
			if((name.charAt(index))=='a' ||
			   (name.charAt(index))=='e' ||
			   (name.charAt(index))=='i' ||
			   (name.charAt(index))=='o' ||
			   (name.charAt(index))=='u') 
			{
				countVow++;
				
			}
			else {
				countCons++;
			}
		}
		System.out.println("Vowel count is "+countVow);
		System.out.println("Consonent count is "+countCons);
		
	}

}
