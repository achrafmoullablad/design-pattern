package service;

import model.Camera;
import model.Ram;

public class IphoneXBuilder implements IBuilder{
	private Ram ram;
	private Camera camera;
	@Override
	public void addRam(Ram ram) {
		this.ram = ram;
	}
	@Override
	public void addCamera(Camera camera) {
		this.camera = camera;
	}
	public IphoneXProduct getIphoneXProduct() {
		return new IphoneXProduct(ram, camera);
	}
}
