package com.nirsa.nw.web.app.enlacemiddleware.models.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Prueba implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal area;
	
	private Integer population;

	public Prueba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prueba(BigDecimal area, Integer population) {
		super();
		this.area = area;
		this.population = population;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}
	
	
	
	
}	
