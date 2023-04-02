package TDD_Practica_Coche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {
	@Test
    public void test_crear_un_coche_su_velocidad_es_cero_Nicolas_Gil_Ruiz(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
	
	 @Test
	 public void test_al_acelerar_un_coche_su_velocidad_aumenta_Nicolas_Gil_Ruiz(){
		 Coche nuevoCoche = new Coche();
		 nuevoCoche.acelerar(30);
		 Assertions.assertEquals(30, nuevoCoche.velocidad);
	 }
	 
	 @Test
	    public void test_al_decelerar_un_coche_su_velocidad_disminuye_Nicola_gil_Ruiz(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.velocidad = 50;
	        nuevoCoche.decelerar(20);
	        Assertions.assertEquals(30, nuevoCoche.velocidad);
	    }
	
	    @Test
	    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_Nicoals_Gil_Ruiz(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.velocidad = 50;
	        nuevoCoche.decelerar(80);
	        Assertions.assertEquals(0, nuevoCoche.velocidad);
	    }
}
