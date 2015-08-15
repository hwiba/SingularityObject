package me.singularity.notification.domain;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.singularity.party.domain.Party;
import me.singularity.user.domain.User;

@Getter
@EqualsAndHashCode
@ToString
public class NotificationDefault implements Notification {
	
	private enum Pattern {
		REQUEST, INVITE, REPLY, NEW_POST
	}
	
	private enum Status {
		ON, OFF
	}
	
	private Long Id;
	private Date createDate;	
	private User writer;
	private User reader;
	private Party party;
	private Pattern pattern;
	private Status status;
	
	
}
