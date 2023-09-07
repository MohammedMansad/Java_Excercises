package com.hibernate.exp.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hibernate.exp.util.HibernateUtil;

public class ClientTest {
	public static void main(String[] args) {
	    try {
			// Check MySQL database version
	    	Session session = HibernateUtil.getSessionFactory().openSession();
			String sql = "select version()";
			String result = (String) session.createNativeQuery(sql).getSingleResult();
			System.out.println("MySql Database Version is:::");
			System.out.println(result);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  }
}
