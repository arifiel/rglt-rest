package arifiel.rgltrest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode 
public class Coordinate implements Serializable {

	private static final long serialVersionUID = -5713367904248037512L;
	
	private final BigDecimal x;
	private final BigDecimal y;
	

}
