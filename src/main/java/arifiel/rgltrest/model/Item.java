package arifiel.rgltrest.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Item implements Serializable {
	private static final long serialVersionUID = -8588399912759001731L;
	
	private String name;
	
	private String description;
	
	private int size;
	private int weight;
	private int def;
	private int atk;
	private int heal;
	
}
