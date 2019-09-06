package webapp.service;

import webapp.model.User;

public interface UserService {
	/*根据id查询信息*/
	public User getUserById(int id);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
}
