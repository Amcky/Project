package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import cn.htu.bean.Department;

public class test {

	public static void main(String[] args) {
		Department a=new Department();
		a.setFid(1);
		a.setGrade(1);
		a.setName("123");
		Configuration cfg=new AnnotationConfiguration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}


}
