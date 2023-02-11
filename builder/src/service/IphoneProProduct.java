package service;

import java.util.ArrayList;
import java.util.List;

import model.Camera;
import model.Ram;

public class IphoneProProduct {
	private Ram ram;
	private List<Camera> cameras = new ArrayList<Camera>();
	public IphoneProProduct(Ram ram, List<Camera> cameras) {
		super();
		this.ram = ram;
		this.cameras = cameras;
	}
	public Ram getRam() {
		return ram;
	}
	public List<Camera> getCameras() {
		return cameras;
	}
	@Override
	public String toString() {
		return "IphoneProProduct [ram=" + ram + ", cameras=" + cameras + "]";
	}
}
