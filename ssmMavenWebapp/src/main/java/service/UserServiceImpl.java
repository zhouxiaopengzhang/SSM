package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserMapper;
import model.User;
@Service(value="userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
}
