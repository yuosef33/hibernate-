package hibernat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
@Id
	private int id;
@Column(nullable = false)
	private String name;
@Column(precision = 10 ,nullable = false)
	private int age;
	private boolean status;
	
	
	public Player(int id, String name, int age, boolean status) {
	
		this.id = id;
		this.name = name;
		this.status = status;
		
			this.age = age;
		    
	}
	public Player() {
		
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
	 
		this.age = age;
	    
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
