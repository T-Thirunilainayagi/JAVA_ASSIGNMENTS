package GenericsAssignment;

public class FriendshipCriteria <T,S> implements Comparable<FriendshipCriteria> {
	private T truthful;
	private S sincere;
	
	//constructors 
    public FriendshipCriteria() {
		
	}
    public FriendshipCriteria(T truthful, S sincere) {
		super();
		this.truthful = truthful;
		this.sincere = sincere;
		//System.out.println("You have successfuly found one friend");
	}
    
    //getters and setters
	public T getTruthful() {
		return truthful;
	}
	public void setTruthful(T truthful) {
		this.truthful = truthful;
	}
	public S getSincere() {
		return sincere;
	}
	public void setSincere(S sincere) {
		this.sincere = sincere;
	}
	
	
	public String toString() {
		return "FriendshipCriteria [truthful=" + truthful + ", sincere=" + sincere + "]";
	}
	@Override
	public int compareTo(FriendshipCriteria o) {
		if(o.getSincere()== this.getSincere()) {
			System.out.println("You have found one friend in your age");
		}
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
