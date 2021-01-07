package ec.ups.edu.metodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logica logica=new Logica();
		
		System.out.println(logica.metodIntegranteUno());
		
		
		Logica logica2=new Logica(2,"Roberto", "Pacho");
		System.out.println(logica.metodIntegranteDos());

	}

}
