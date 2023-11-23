package org.jsp.Controller;




import java.util.Scanner;

import org.hibernate.loader.custom.ScalarResultColumnProcessor;
import org.jsp.Dao.UserDao;
import org.jsp.Dto.User;
import org.jsp.userspringapp.UserConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserController {
	static UserDao dao;
	static{
		ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
		dao=context.getBean(UserDao.class);
		
	}
	 static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int num=s.nextInt();
		switch(num) {
		case 1:{
			save();
			
			break;
		}
		case 2:{
			update();
			break;
		}
		case 3:{
			fetch();
			break;
		}
		case 4:{
			delete();
			break;
		}
		case 5:{
			fetchuserbyphone();
			break;
		}
		case 6:{
			fetchuserbyemail();
			break;
		}
	}
}

	
     public static void save() {
		User u=new User();
		System.out.println("enter name,email,phone,password");
		String name=s.next();
		String email=s.next();
		Long phone=s.nextLong();
		String password=s.next();
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);
		dao.SaveUser(u);
		
		
		
		
	}
	public static void update() {
		User u=new User();
		System.out.println("enter id,name,email,phone,password to update");
		int id=s.nextInt();
		String name=s.next();
		String email=s.next();
		Long phone=s.nextLong();
		String password=s.next();
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);
		dao.updateUser(u);
		
		
	}
	public static void fetch() {
		int id=s.nextInt();
		User u=dao.FetchUser(id);
		System.out.println(u);
		
	}
	public static void delete() {
		int id=s.nextInt();
		dao.deleteuser(id);
		
		
	}
	public static void fetchuserbyphone() {
		long phone=s.nextLong();
		User u=dao.fetchuserbyphone(phone);
		System.out.println(u);
		
	}
	public static void fetchuserbyemail() {
		String email=s.next();
		User u=dao.fetchuserbyemail(email);
		System.out.println(u);
		
	}
	
	
	
	
	
	
	
	

}
