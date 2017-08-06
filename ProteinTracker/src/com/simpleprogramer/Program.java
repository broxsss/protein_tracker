package com.simpleprogramer;

import org.hibernate.Session;

public class Program {
	
	public static void main (String a[])
	{
		System.out.println("hello");
		//Session session = HibernateUtilities_5.getSessionFactory().openSession();
		Session session = Hibernateutilities.getSessionFactory().openSession();
		/*session.beginTransaction();
		
		User user = new User();
		user.setName("aayushi");
		user.setGoal(2508);
		session.save(user);
		session.getTransaction().commit();
		*/
	   session.beginTransaction();
		//User loadeduser = session.get(User.class, 2);
		User loadeduser = (User)session.load(User.class, 6);
		System.out.println(loadeduser.getName());
		System.out.println(loadeduser.getGoal());
		loadeduser.setTotal(loadeduser.getTotal() + 50);
		session.getTransaction().commit();
		session.close();
		Hibernateutilities.getSessionFactory().close();
	}

}
