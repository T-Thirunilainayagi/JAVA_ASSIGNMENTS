package StringAssignment;

public class Quest1 {

	public static void main(String[] args) {
		String s1="99";
		for(int index=0;index<s1.length();index++) {
			if((s1.charAt(index))!='l' &&
			   (s1.charAt(index))!='2' &&
			   (s1.charAt(index))!='3' &&
			   (s1.charAt(index))!='4' &&
			   (s1.charAt(index))!='5' &&
			   (s1.charAt(index))!='6' &&
			   (s1.charAt(index))!='7' &&
			   (s1.charAt(index))!='8' &&
			   (s1.charAt(index))!='9' &&
			   (s1.charAt(index))!='0'   ) {
				
				System.out.println("String contains only text");
				break;
			}
			else  if((s1.charAt(index))=='l' ||
				   (s1.charAt(index))=='2' ||
				   (s1.charAt(index))=='3' ||
				   (s1.charAt(index))=='4' ||
				   (s1.charAt(index))=='5' ||
				   (s1.charAt(index))=='6' ||
				   (s1.charAt(index))=='7' ||
				   (s1.charAt(index))=='8' ||
				   (s1.charAt(index))=='9' ||
				   (s1.charAt(index))=='0'   )
			
			{
				System.out.println("String Contains only numbers");
				break;
			}
			else {
				
				System.out.println("String Contains alpha and numbers");
				break;
			}
		}

	}

}
