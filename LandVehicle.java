public interface LandVehicle{
	public void changeRpm(int newValue);
	public void changeGear(int newValue);
	public void speedUp(int increment);
	public void applyBrakes(int decrement);
}