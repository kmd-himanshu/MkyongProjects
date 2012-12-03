package com.loiane.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQuery;

@NamedQuery(
            name="getCity",
            query="SELECT c FROM City c WHERE c.name LIKE :name"
    )

    
@Entity
@Table(name="CITY")
public class City {

	private long id;
	
	private String name;

	public City(String name) {
		super();
		this.name = name;
	}

	public City() {}

	@Id
	@GeneratedValue
	@Column(name="CITY_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="CITY_NAME", nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
