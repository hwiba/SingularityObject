package me.singularity.note.domain;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.singularity.party.domain.Party;
import me.singularity.user.domain.User;

@Getter
@EqualsAndHashCode
@ToString
public class NoteDefault implements Note {
	
	private enum PublishClass {
		DRAFT, PUBLISH, DELETE
	}
	
	private Long id;
	private Date createDate;
	private String text;
	private User writer;
	private Party party;
	private PublishClass publishClass;
	
	@Override
	public boolean isWriter(User user) {
		return this.writer.equals(user);
	}

	@Override
	public boolean isDraft() {
		return this.publishClass.equals(PublishClass.DRAFT);
	}

	@Override
	public boolean isPublish() {
		return this.publishClass.equals(PublishClass.PUBLISH);
	}
	
	@Override
	public boolean isDelete() {
		return this.publishClass.equals(PublishClass.DELETE);
	}

	@Override
	public void publish() {
		this.publishClass = PublishClass.PUBLISH;
	}

	@Override
	public void draft() {
		this.publishClass = PublishClass.PUBLISH;
	}
	
	@Override
	public void delete() {
		this.publishClass = PublishClass.DELETE;
	}

	@Override
	public void rewrite(String text) {
		// XXX markdown 변환, pcomment 매칭 등 작업한 뒤.
		this.text = text;
	}
	
}
