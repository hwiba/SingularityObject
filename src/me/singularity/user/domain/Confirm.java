package me.singularity.user.domain;

public interface Confirm {

	void delete();
	
	boolean isIdentificationKey(String keyword);
	
}
