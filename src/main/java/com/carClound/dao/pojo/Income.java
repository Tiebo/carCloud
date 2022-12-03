package com.carClound.dao.pojo;

public class Income {
	private Integer id;
	private String vehicleId;
	private Integer userId;
	private Integer days;
	private Integer amount;
	private String time;

	public Income() {
	}

	public Income(Integer id, String vehicleId, Integer userId, Integer days, Integer amount, String time) {
		this.id = id;
		this.vehicleId = vehicleId;
		this.userId = userId;
		this.days = days;
		this.amount = amount;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Income{" +
				"id=" + id +
				", vehicle_id='" + vehicleId + '\'' +
				", user_id=" + userId +
				", days=" + days +
				", amount=" + amount +
				", time=" + time +
				'}';
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

	public void setVehicleId(String vehiclId) {
		this.vehicleId = vehiclId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
