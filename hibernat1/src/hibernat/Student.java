package hibernat;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
private String name;
private String password;
private String address;
private int age;
private String phone;

public Student() {
	
	
	
}


public Student(int id, String name, String password, String address, int age, String phone) {
	this.id = id;
	this.name = name;
	this.password = password;
	this.address = address;
	this.age = age;
	this.phone = phone;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}









}
