package com.onetoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double cost;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)//no need to save child now
	@JoinColumn(name="charcy_id")
	private Charcy charcy;

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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Charcy getCharcy() {
		return charcy;
	}

	public void setCharcy(Charcy charcy) {
		this.charcy = charcy;
	}

}
