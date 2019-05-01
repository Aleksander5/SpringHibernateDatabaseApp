package com.achrzanowski.springmvc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notebook")
public class Notebook{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="model")
	private String model;
	
	@Column(name="series")
	private String series;
	
	@Column(name="screen_size")
	private double screenSize;
	
	@Column(name="processor_model")
	private String processorModel;
	
	@Column(name="ram")
	private int ram;
	
	@Column(name="hard_drive")
	private String hardDrive;
	
	@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="manufacturer_id")
	private Manufacturer manufacturer;

	//-------------------------Constructors-----------------------
	
	public Notebook() {}
	
	public Notebook(String model, String series, double screenSize, String processorModel, int ram, String hardDrive) {
		this.model = model;
		this.series = series;
		this.screenSize = screenSize;
		this.processorModel = processorModel;
		this.ram = ram;
		this.hardDrive = hardDrive;
	}

	//-------------------------Getters/Setters--------------------
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getProcessorModel() {
		return processorModel;
	}

	public void setProcessorModel(String processorModel) {
		this.processorModel = processorModel;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	//-------------------------ToString---------------------------
	
	@Override
	public String toString() {
		return "Notebook [id=" + id + ", model=" + model + ", series=" + series + ", screenSize=" + screenSize
				+ ", processorModel=" + processorModel + ", ram=" + ram + ", hardDrive=" + hardDrive + ", manufacturer=" + manufacturer + "]";
	}
	
	
}











