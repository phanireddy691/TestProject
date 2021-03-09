package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class phaniclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		  
		  SessionFactory factory = cfg.buildSessionFactory();
		  
		  Session session = factory.openSession();
		 

		// insert operation

		/*
		 * Student s1=new Student(); //s1.setStno(1); s1.setSname("Ram");
		 * s1.setSaddr("Bangalore"); s1.setCourse(".Net");
		 * 
		 * session.save(s1); System.out.println(" object saved sucessfully");
		 * Transaction tx=session.beginTransaction();
		 * 
		 * tx.commit();
		 */

		// Select Operation

		
		  Object obj=session.load(phani.class, new Integer(1));
		  
		  phani s1=(phani)obj;
		  
		  System.out.println("Student Id :"+s1.getStno() + " Student Name : "
		  +s1.getSname() + " Student Address: "+s1.getSaddr() +
		  "   Student Course : "+s1.getCourse());
		  
		  
		  s1.setSaddr("Chennia"); session.update(s1);
		  
		 
		// session.delete(s1);

		Transaction tx = session.beginTransaction();

		tx.commit();

	}

}
