package domain.user;

import java.util.Date;

public class ConfirmDefault implements Confirm {
	
	private enum Status {
		READY, CHECKED
	}
	
	private Long id;
	private Date createDate;
	private User user;
	private Status stauts;
	private String identificationKey;
	

	@Override
	public void delete() {
		this.stauts = Status.CHECKED;
	}

	@Override
	public boolean isIdentificationKey(String keyword) {
		return this.identificationKey.equals(keyword);
	}
	
}
