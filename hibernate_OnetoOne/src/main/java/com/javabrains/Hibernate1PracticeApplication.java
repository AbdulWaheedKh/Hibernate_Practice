package com.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hibernate1PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hibernate1PracticeApplication.class, args);
		/*
		 * Student obj = new Student(); obj.setRoll(1); obj.setName("waheed");
		 * obj.setMarks(80);
		 * 
		 * Configuration con = new
		 * Configuration().configure("application.properties").addAnnotatedClass(Student
		 * .class);
		 * 
		 * ServiceRegistry reg = new
		 * StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		 * SessionFactory sf = con.buildSessionFactory(reg); Session session =
		 * sf.openSession(); Transaction tx = session.beginTransaction();
		 * session.save(obj); tx.commit();
		 */
	}

}
