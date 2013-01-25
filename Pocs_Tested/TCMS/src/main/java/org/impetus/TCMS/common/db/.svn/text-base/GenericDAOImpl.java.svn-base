/*
*This Class defines Generic api for Data manipulation.
*/
package org.impetus.TCMS.common.db;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;
import org.hibernate.TransientObjectException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericDAOImpl extends HibernateDaoSupport implements GenericDAO{    
    
	public Integer save(Object object) {		
	    Integer id = (Integer)getHibernateTemplate().save(object);
        return id;
    }
	
    public void update(Object object) {    	
		try {			
			getSession().update(object);			
		} catch (NonUniqueObjectException e) {
			object = getSession().merge(object);
		} catch(TransientObjectException e) {
			getSession().saveOrUpdate(object);
		} catch(Exception e) {
			getSession().saveOrUpdate(object);
		}
	    return;
    }
    
    public void load(Object object, Serializable id) {
	    getHibernateTemplate().load(object, id);    	
    }
    
	public Object get(Class object, Serializable id) {	
		return (getHibernateTemplate().get(object,id));		
    }
	
	public Object saveOrUpdate(Object object) {		
		try {
			if(getSession().contains(object)) {
				getSession().update(object); 
	    	} else {
				getSession().saveOrUpdate(object);
			}
		} catch (NonUniqueObjectException e) {
			object = getSession().merge(object);
		} catch(TransientObjectException e) {
			getSession().saveOrUpdate(object);
		} catch(Exception e) {
			getSession().saveOrUpdate(object);
		}
		return object;
    }
	
	public void saveOrUpdateAll(Collection objectColl) {		
	    getHibernateTemplate().saveOrUpdateAll(objectColl);	    
    }	
	
	public Session getHibernateSession() {
		Session session = getSession();
		return session;
	}   

    /**
	 * This method is used to delete the all collection object 
	 * @param Collection 
	 * @return 
	 */
    public void delete(Collection coll){
    	getHibernateTemplate().deleteAll(coll);
    }
    
    /**
	 * This method is used to delete the  object 
	 * @param Object
	 * @return 
	 */
    public void delete(Object  obj) {
    	getHibernateTemplate().delete(obj);
    }
    
    /**
	 * This method is used to delete the  object 
	 * @param Class obj
	 * @return Collection
	 */
    public Collection loadAll(Class classObj) {
    	Collection loadAllColl = null;
    	loadAllColl = getHibernateTemplate().loadAll(classObj);    	
    	return loadAllColl;
    }    
    
    /**
	 * This method checks whether there is any row present for the given id.
	 * @param object object 
	 * @param id id 
	 * @return flag 
	 */
    public boolean exists (Class object, Serializable id) {
    	String hqlQuery = "select count(*) as exists from " + object.getSimpleName() + " where id = :id";
    	List list = getSession().createQuery(hqlQuery).setParameter("id", id).list();
    	if (list == null || list.isEmpty()){
    		return false;
    	}else{
    		return true;
    	}
    }
}
