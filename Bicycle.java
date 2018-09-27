public class Bicycle implements LandVehicle {

	int cadencia = 0;
	int rapidez = 0;
	int velocidad = 1;
	
	public void changeCadence(int nuevaCadencia) {
		this.cadencia = nuevaCadencia;
	}

	public void changeGear(int nuevaVelocidad) {
		this.velocidad = nuevaVelocidad;
	}

	public void speedUp(int aumento) {
		this.rapidez = this.rapidez + aumento;
	}
	public void applyBrakes(int disminucion) {
		this.rapidez = this.rapidez - disminucion;
	}

	public void printStates() {
		System.out.println(" cadencia:" + this.cadencia + " rapidez:" + 
		this.rapidez + " velocidad:" + this.velocidad);
	}

	public void changeRpm(int newValue){
		changeCadence(newValue);
	}
}