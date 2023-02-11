package service;

import model.Camera;
import model.Ram;

public interface IBuilder {
	public void addRam(Ram ram);
	public void addCamera(Camera camera);
}
