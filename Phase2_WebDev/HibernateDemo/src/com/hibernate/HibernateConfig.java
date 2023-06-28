package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Load jar files 
 * Project [ Project explorer => rt click => Build Path => Configure build path
 * => Libraries tab => Select module path =>Click Add External jars =>
 * Choose all jars from within the folder
 * Hibernate.jar => dist => lib => required => select all => open =>
 * Also add all jars from provided folder
 *  apply and close 
 * PLEASE DO ADD mysql jar
 * @author Shalini
 *
 */
public class HibernateConfig {

	/*
	 * 1. db connection => hibernate.cfg.xml
	 * 2. Configuration
	 * 3. SessionFactory => long lived and it is 1 per database
	 * 3. Session => short lived and should close after every physical conn made to the db
	 *  every transaction or query to make physical conn
	 * c1 => fetch phone
	 * admin=< insert details tv
	 * 4. Transaction
	 * 5. 
	 */
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
    // Hibernate 5:
    private static SessionFactory buildSessionFactory() {
    	System.out.println("build factory");
        try {
            // Create the ServiceRegistry from hibernate.cfg.xml
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
                    .configure("hibernate.cfg.xml").build();
 
            // Create a metadata sources using the specified service registry.
            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build(); 
            return metadata.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {         
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
 
}
