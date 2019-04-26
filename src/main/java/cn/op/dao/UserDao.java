package cn.op.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

import cn.op.entity.User;

//@Repository
@Mapper
public interface UserDao {

	//@Select("select * from user")
	List<User> users();

	//@Insert("insert into user(username,password,address,age) values(#{username},#{password},#{address},#{age})")
	//@SelectKey(before = false, keyProperty = "ID", resultType = int.class, statement = { "select max(id) from user" })
	Integer adduser(User user);
	
	Integer deluser(int id);
	
	Integer updateuser(User user);

}
