package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import type.RamType;

@Data @AllArgsConstructor @ToString
public class Ram {
	private int taille;
	private RamType type;
	public Ram() {
		this.taille = 4;
		this.type = RamType.DDR3;
	}
}
