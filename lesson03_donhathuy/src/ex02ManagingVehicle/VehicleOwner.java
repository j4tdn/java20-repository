package ex02ManagingVehicle;

import java.time.LocalDateTime;
import java.util.Arrays;

public class VehicleOwner {
	private Owner owner;
	private VehicleDetail [] vehicleDetail;
	private LocalDateTime ownDate;
	public VehicleOwner() {
	}
	public VehicleOwner(Owner owner, VehicleDetail[] vehicleDetail, LocalDateTime ownDate) {
		super();
		this.owner = owner;
		this.vehicleDetail = vehicleDetail;
		this.ownDate = ownDate;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public VehicleDetail[] getVehicleDetail() {
		return vehicleDetail;
	}
	public void setVehicleDetail(VehicleDetail[] vehicleDetail) {
		this.vehicleDetail = vehicleDetail;
	}
	public LocalDateTime getOwnDate() {
		return ownDate;
	}
	public void setOwnDate(LocalDateTime ownDate) {
		this.ownDate = ownDate;
	}
	@Override
	public String toString() {
		return "VehicleOwner [owner=" + owner + ", vehicleDetail=" + Arrays.toString(vehicleDetail) + ", ownDate="
				+ ownDate + "]";
	}
	
}
