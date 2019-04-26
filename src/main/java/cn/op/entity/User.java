package cn.op.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {

	@Id
	private Integer ID;

	@Column
	private String address;

	@Column
	private Integer age;

	@Column
	private String username;

	@Column
	private String password;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(Integer iD, String address, Integer age, String username, String password) {
		super();
		ID = iD;
		this.address = address;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", address=" + address + ", age=" + age + ", username=" + username + ", password="
				+ password + "]";
	}

	public User() {
		super();
	}
	

}
