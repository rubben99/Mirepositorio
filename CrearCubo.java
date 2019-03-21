package cuboDeRubik;

import java.util.Arrays;

public class CrearCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuboClase cubo=new CuboClase();
		
		cubo.girarBaseDerecha();
		System.out.println(cubo.mostrarCubo());
		cubo.girarBaseDerecha();
		System.out.println(cubo.mostrarCubo());
		cubo.giraAbajoDerecha();
		System.out.println(cubo.mostrarCubo());
		

	}

}
