package service;

import model.Camera;
import model.Ram;
import type.CameraType;
import type.RamType;

public class Director {
	public void construireIphoneX(IBuilder builder) {
		builder.addRam(new Ram(4, RamType.DDR3));
		builder.addCamera(new Camera(1080, CameraType.FULLHD));
	}
	public void construireIphonePro(IBuilder builder) {
		builder.addRam(new Ram(8, RamType.DDR4));
		builder.addCamera(new Camera(720, CameraType.HD));
		builder.addCamera(new Camera(1080, CameraType.FULLHD));
		builder.addCamera(new Camera(4028, CameraType.UHD4K));
	}
}
