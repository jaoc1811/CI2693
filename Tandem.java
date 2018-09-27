class Tandem extends Bicycle {
	double esfuerzoDelante = 0.5;
	double esfuerzoDetras = 0.5;

		public void printStates() {
			super.printStates();
			System.out.println("esfuerzoDelante:"
			+this.esfuerzoDelante + " esfuerzoDetras:"
			+this.esfuerzoDetras);
	}
}