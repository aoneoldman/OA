package cn.op.serice;

import java.util.List;

import cn.op.entity.User;

public interface UserService {
	
	List<User> users();
	
	Integer adduser(User user);
	
	String deluser(int id);
	
	Integer updateuser(User user);

}
