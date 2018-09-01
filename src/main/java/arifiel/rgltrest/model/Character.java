package arifiel.rgltrest.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Character extends ObjectOnMap {

	private static final long serialVersionUID = -7328473919365372546L;
	
	private String name;
	private String description;
	
	private int hp;
	private int atk;
	
	private List<Item> storage;
	
	private Item rightHand;
	private Item lefltHand;
	private Item body;
	private Item pants;
	private Item rightFoot;
	private Item leftFoot;
	private List<Item> trinkets;

}
