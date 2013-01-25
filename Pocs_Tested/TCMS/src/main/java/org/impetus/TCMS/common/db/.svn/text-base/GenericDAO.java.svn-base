/*
 * Generic interface for common DB operations 
 *
 */
package org.impetus.TCMS.common.db;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.Session;

public interface GenericDAO {

	/**
	 * This API method is used to persist object into data base
	 * @param object
	 * @return
	 */
	public Integer save(Object object);

	/**
	 * This API method is used to update object into data base
	 * @param object
	 */
	public void update(Object object);

	/**
	 * This API method is used to load an object 
	 * @param object
	 * @param id
	 */
	public void load(Object object, Serializable id);

	/**
	 * This API method is used to get an object
	 * @param clas
	 * @param id
	 * @return
	 */
	public Object get(Class clas, Serializable id);

	/**
	 * This API method is used to save or update an Object 
	 * if id exist is update the object otherwise save 
	 * @param object
	 * @return
	 */
	public Object saveOrUpdate(Object object);

	/**
	 * This API method is used to get hibernate session
	 * @return Session
	 */
	public Session getHibernateSession();

	/**
	 * This method is used to delete the all collection object
	 * @param Collection
	 * @return
	 */
	public void delete(Collection coll);

	/**
	 * This method is used to delete the object
	 * 
	 * @param Object
	 * @return
	 */
	public void delete(Object obj);
	
    /**
	 * This method is used to delete the  object 
	 * @param Class obj
	 * @return Collection
	 */
    public Collection loadAll(Class classObj);
    
    /**
	 * This method is used to saveOrUpdate of collection  
	 * @param Collection 
	 * @return 
	 */
	public void saveOrUpdateAll(Collection objectColl);

	/**
	 * This method checks whether there is any row present for the given id.
	 * @param object object 
	 * @param id id 
	 * @return flag 
	 */
	public boolean exists (Class object, Serializable id);
}
