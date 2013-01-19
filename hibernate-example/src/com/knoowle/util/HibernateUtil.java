package com.knoowle.util;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = new Configurate().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
