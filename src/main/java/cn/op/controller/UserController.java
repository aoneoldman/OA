package cn.op.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.op.entity.User;
import cn.op.serice.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "user")
	public List<User> user() {
		return userService.users();
	}

	@PostMapping(value = "user")
	public int adduser(User user) {
		return userService.adduser(user);
	}

	@DeleteMapping(value = "user/{id}")
	public String deluser(@PathVariable int id) {
		return userService.deluser(id);
	}

	@PutMapping(value = "user")
	public int updateuser(User user) {
		System.out.println(user.getUsername() == "");
		System.out.println("---" + user.getUsername());
		return userService.updateuser(user);
	}

}
