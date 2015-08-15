package me.singularity.user.service;

import data.repository.RepositoryDefault;
import me.singularity.user.domain.User;


public class UserService {
	
	private RepositoryDefault<User> userRepository = new RepositoryDefault<>();
	
	public User save(User user){
		return userRepository.save(user);
	}
	
	public void delete(User user) {
		userRepository.delete(user);
	}
	
	public int count() {
		return userRepository.count();
	}
}
