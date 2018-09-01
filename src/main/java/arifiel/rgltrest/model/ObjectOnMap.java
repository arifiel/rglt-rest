package arifiel.rgltrest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public abstract class ObjectOnMap implements Serializable {
	
	private static final long serialVersionUID = 5662372658407885733L;
	
	private String name;

	private Coordinate coordinate;
	private boolean breakeable;
	private boolean collidable;
	private boolean collisionEffect;
	private boolean movaeble;	
	
}
