package service;

import java.util.ArrayList;
import java.util.List;

import model.Camera;
import model.Ram;

public class IphoneProBuilder implements IBuilder{
	private Ram ram;
	private List<Camera> cameras = new ArrayList<Camera>(); 
	@Override
	public void addRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public void addCamera(Camera camera) {
		this.cameras.add(camera);
	}
	
	public IphoneProProduct getIphoneProProduct() {
		return new IphoneProProduct(ram, cameras);
	}
}
