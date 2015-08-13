package domain.notification;

import java.util.Date;

import domain.party.Party;
import domain.user.User;
import lombok.Data;

@Data
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
