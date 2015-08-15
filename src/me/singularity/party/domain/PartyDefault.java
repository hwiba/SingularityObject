package me.singularity.party.domain;

import java.util.Date;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.singularity.user.domain.User;

@Getter
@EqualsAndHashCode
@ToString
public class PartyDefault implements Party {
	
	private enum PublicClass {
		PUBLIC, PARTY, PRIVATE, CLOSE
	}
	
	private Long id;
	private Date createDate;
	private String name;
	private String backgroundImage;
	private User admin;
	private List<User> members;
	private PublicClass publicClass;

	@Override
	public void changeName(String name) {
		this.name = name;
	}
	
	@Override
	public void changeBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	@Override
	public void addMember(User user) {
		this.members.add(user);
		
	}
	
	@Override
	public void deleteMember(User user) {
		this.members.remove(user);
		
	}

	@Override
	public void hasMember(User user) {
		this.members.contains(user);
	}

	@Override
	public boolean isAdmin(User user) {
		return this.admin.equals(user);
	}

	@Override
	public void changeAdmin(User user) {
		this.admin = user;
	}

	@Override
	public boolean isPrivateClass() {
		return this.publicClass.equals(PublicClass.PRIVATE);
	}

	@Override
	public boolean isPartyClass() {
		return this.publicClass.equals(PublicClass.PARTY);
	}

	@Override
	public boolean isPublicClass() {
		return this.publicClass.equals(PublicClass.PUBLIC);
	}

	@Override
	public boolean isCloseClass() {
		return this.publicClass.equals(PublicClass.CLOSE);
	}

	@Override
	public void classSetPublic() {
		this.publicClass = PublicClass.PUBLIC;
	}

	@Override
	public void classSetParty() {
		this.publicClass = PublicClass.PARTY;
	}

	@Override
	public void classSetPrivate() {
		this.publicClass = PublicClass.PRIVATE;
	}

	@Override
	public void classSetClose() {
		this.publicClass = PublicClass.CLOSE;
	}

}
