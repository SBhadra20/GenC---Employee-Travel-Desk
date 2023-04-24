package com.cognizant.employeetraveldesk.travelplanner.entities;

import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Locations")
@NoArgsConstructor
@Getter
@Setter
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Name", length = 20)
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Locations() {
		super();
		// TODO Auto-generated constructor stub
	}


}
