package arifiel.rgltrest.model;

public final class Wall extends ObjectOnMap {

	private static final long serialVersionUID = 8647991427485117875L;
	
	@Override
	public String getName() {
		return "Wall";
	}
	
	@Override
	public boolean isCollidable() {
		return false;
	}
	

}
