package cn.op.serice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.op.dao.UserDao;
import cn.op.entity.User;
import cn.op.serice.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public List<User> users() {
		return userDao.users();
	}

	@Override
	public Integer adduser(User user) {
		// TODO Auto-generated method stub
		return userDao.adduser(user);
	}

	@Override
	public String deluser(int id) {
		if (userDao.deluser(id) == 1) {
			return "seccuss";
		} else {
			return "error";
		}
	}

	@Override
	public Integer updateuser(User user) {
		return userDao.updateuser(user);
	}

}
