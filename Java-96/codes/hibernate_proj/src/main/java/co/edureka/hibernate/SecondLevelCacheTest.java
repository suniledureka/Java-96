package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SecondLevelCacheTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		
		Session s1 = sfactory.openSession();
		Session s2 = sfactory.openSession();
		
		Student st1 = s1.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println();
		Thread.sleep(4000);
		
		Student st2 = s2.get(Student.class, 101);
		System.out.println(st2);		
		
		s1.close();		
		sfactory.close();
	}
}
