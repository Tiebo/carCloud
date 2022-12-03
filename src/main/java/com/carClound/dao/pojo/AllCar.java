package com.carClound.dao.pojo;

public class AllCar {
	private Integer id;
	private String vehicleId;
	private String type;

	public AllCar() {
	}

	public AllCar(Integer id, String vehicleId, String type) {
		this.id = id;
		this.vehicleId = vehicleId;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AllCar{" +
				"id=" + id +
				", vehicleId='" + vehicleId + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}
