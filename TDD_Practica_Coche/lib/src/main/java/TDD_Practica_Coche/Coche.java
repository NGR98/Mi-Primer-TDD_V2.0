package TDD_Practica_Coche;

public class Coche {
	public Integer velocidad = 0;

	public void acelerar(int aceleracion) {
		velocidad += aceleracion;		
	}

	public void decelerar(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad < 0) velocidad = 0;
	}
}
