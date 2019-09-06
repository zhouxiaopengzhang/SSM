package webapp.service;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import webapp.model.User;
import webapp.dao.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	@Resource(type=UserMapper.class)
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(id);
	}
}
