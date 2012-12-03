package com.loiane.main;

import com.loiane.dao.CityDAO;

/**
 * To execute this project, you should run this class
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class Main {

	public static void main(String[] args) {
		
		CityDAO cityDAO = new CityDAO();
		
		long cityId1 = cityDAO.saveCity("New York");
		cityDAO.changeTable();
		long cityId2 = cityDAO.saveCity("Rio de Janeiro");
	}
}
