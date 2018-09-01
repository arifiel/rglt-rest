package arifiel.rgltrest.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Map implements Serializable {

	private static final long serialVersionUID = 2701344556408916816L;
	
	private List<ObjectOnMap> map;

}
