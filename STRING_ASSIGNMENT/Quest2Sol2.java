package StringAssignment;

public class Quest2Sol2 {

	public static void main(String[] args) {
		String name="Thiru";
		String chk="aeiouAEIOU";
		int countVow=0;
		int countCons=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==chk.charAt(i)) {
				countVow++;
				break;
			}
			else {
				countCons++;
			}
		}
		System.out.println("Vowels count"+countVow);
		System.out.println("Con count"+countVow);

	}

}
