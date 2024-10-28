package hibernat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
	
			Configuration con=new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Player.class);
			
			SessionFactory factory = con.buildSessionFactory();	
			Session se =factory.getCurrentSession();
			Player p2=new Player(18,"asr",23,true);
			
			

	se.beginTransaction();

	Query q1=se.createQuery("from Player where name like 'a%'"); // starts with char a
	Query q2=se.createQuery("from Player where age>=20");         // more than 20
	Query q3=se.createQuery("from Player where status=1");      // statue = true
	Query q4=se.createQuery("from Player where mod(id,2)=0");   //even id
	
	
	
	
//
//			Player p=se.get(Player.class,9);
//			p.setAge(6);                                  //update
//			se.update(p);
//			
//			Player x=se.get(Player.class,11);           
//			se.delete(x);                                 //delete
//			
			
//	se.save(p2);                                         //save
	
	System.out.println("name starts with a ----------------------->");
	List<Player> players=q1.getResultList();
	for(Player f:players ) {
		System.out.println("ID..."+f.getId());
		System.out.println("name.."+f.getName());

	}
	System.out.println("age more than 20----------------->");
	
	List<Player> players2=q2.getResultList();
	for(Player f:players2 ) {
		System.out.println("ID..."+f.getId());
		System.out.println("name.."+f.getName());
		System.out.println("Age.."+f.getAge());
	}
	System.out.println("status = true----------------->");
	
	List<Player> players3=q3.getResultList();
	for(Player f:players3 ) {
		System.out.println("ID..."+f.getId());
		System.out.println("name.."+f.getName());
		System.out.println("Status.."+f.isStatus());

	}
	
System.out.println(" even id ----------->");
	List<Player> players4=q4.getResultList();
	for(Player f:players4) {
		System.out.println("ID..."+f.getId());
		System.out.println("name.."+f.getName());
	}
	
	
			se.getTransaction().commit();	
			factory.close();
			System.out.println("done");
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}






//Connection con= DriverManager.getConnection
//("jdbc:oracle:thin:@//localhost:1521/orclpdb","hr","hr");



//Student h, s=new Student(5,"yuosef5","1234567","banha5",24,"0153897249283");
//Query q=se.createQuery("from Student where id>:x");
//q.setParameter("x", 1);
//List<Student> students=q.getResultList();
//
//for(Student k:students) {
//	System.out.println("id.."+k.getId());
//	System.out.println("name.."+k.getName());
//	System.out.println("Age.."+k.getAge());
//	System.out.println("------------------------------------ \n");
//}
//
