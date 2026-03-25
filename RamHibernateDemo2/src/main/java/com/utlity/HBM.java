package com.utlity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HBM 
{
	public static Session HBMConnection()
	{
		Configuration cfg=new Configuration();
		 
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ss=sf.openSession();
		
		
		return ss;
	}

}
