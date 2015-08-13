package domain.user;

public interface Confirm {

	void delete();
	
	boolean isIdentificationKey(String keyword);
	
}
