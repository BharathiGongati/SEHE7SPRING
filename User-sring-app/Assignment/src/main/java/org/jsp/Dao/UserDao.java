package org.jsp.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Dto.User;

import com.mysql.cj.Query;

public class UserDao {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	public User SaveUser(User user) {
		manager.persist(user);
		EntityTransaction t=manager.getTransaction();
		t.begin();
		t.commit();
		return user;
		
	}
	public User updateUser(User user) {
		manager.merge(user);
		EntityTransaction t=manager.getTransaction();
		t.begin();
		t.commit();
		
		return user;
		
	}
	public User FetchUser(int id) {
		User u=manager.find(User.class, id);
		return u;
		
		
	}
	public boolean deleteuser(int id) {
		User u=manager.find(User.class, id);
		if(u!=null) {
			manager.remove(u);
			EntityTransaction t=manager.getTransaction();
			t.begin();
			t.commit();
			
			return true;
		}
		
		return false;
		
	}
	public User fetchuserbyphone(long phone) {
		String qry="select u from User u where u.phone=?1";
		javax.persistence.Query q=manager.createQuery(qry);
		q.setParameter(1, phone);
		
		return (User) q.getSingleResult();
		
	}
	public User fetchuserbyemail(String email) {
		
		String qry="select u from User u where u.email=?1";
		javax.persistence.Query q=manager.createQuery(qry);
		q.setParameter(1, email);
		
		return (User) q.getSingleResult();
		
	}
	
	

}
