package me.singularity.user.domain;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
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
