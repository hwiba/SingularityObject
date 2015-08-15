package me.singularity.user.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class UserDefault implements User {
	
	private enum MembershipClass {
		READY, ACCEPT, DELETE
	}
	
	private Long id;
	private String password;
	private Date createDate;
	private String name;
	private String profileImage;
	private MembershipClass membershipClass;

	public MembershipClass getMembershipClass() {
		return this.membershipClass;
	}
	
	@Override
	public void changeName(String name) {
		this.name = name;
	}

	@Override
	public void changeImage(String profileImage) {
		this.profileImage = profileImage;
	}

	@Override
	public void deleteUser() {
		this.membershipClass = MembershipClass.DELETE;
	}

	@Override
	public void accept() {
		this.membershipClass = MembershipClass.ACCEPT;
	}
	
	@Override
	public void ready() {
		this.membershipClass = MembershipClass.READY;
	}

	@Override
	public boolean isAccept() {
		return this.membershipClass.equals(MembershipClass.ACCEPT);
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
