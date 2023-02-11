package service;

import model.Camera;
import model.Ram;

public class IphoneXProduct {
	private Ram ram;
	private Camera camera;
	public IphoneXProduct(Ram ram, Camera camera) {
		super();
		this.ram = ram;
		this.camera = camera;
	}
	public Ram getRam() {
		return ram;
	}
	public Camera getCamera() {
		return camera;
	}
	@Override
	public String toString() {
		return "IphoneXProduct [ram=" + ram + ", camera=" + camera + "]";
	}
}
