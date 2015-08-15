package me.singularity.user.service;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import me.singularity.user.domain.User;
import me.singularity.user.domain.UserDefault;

public class UserServiceTest {
	
	UserService userService = new UserService();
	
	@Test
	public void save() {
		User user = new UserDefault((long) 1, "password", new Date(), "name", "image", null);
		assertEquals(user, userService.save(user));
		assertEquals(1, userService.count());
	}
	
	@Test
	public void delete() {
		User user = new UserDefault((long) 1, "password", new Date(), "name", "image", null);
		userService.delete(user);
		assertEquals(0, userService.count());
	}
}
