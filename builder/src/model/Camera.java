package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import type.CameraType;

@Data @AllArgsConstructor @ToString
public class Camera {
	private int resolution;
	private CameraType type;
	public Camera() {
		this.resolution = 720;
		this.type = CameraType.HD;
	}
}
