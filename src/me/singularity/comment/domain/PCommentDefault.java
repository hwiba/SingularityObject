package me.singularity.comment.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper=false)
public class PCommentDefault extends CommentDefault implements PComment{
	
	private int paragraphIndex;
	private int totalSameText;
	private int sameTextIndex;
	private String tartgetText;
	
}
