package exercicio03.application;

import application.Program;
import exercicio03.entities.Guerreiro;
import exercicio03.entities.Mago;

public class Program03 {

	public static void main(String[] args) {

		iniciarExe03();

	}
	
	public static void iniciarExe03() {

		Program program = new Program();
		
		Mago druid = new Mago("Maguinho", 300, 280, 80, 50, 10);
		Guerreiro knight = new Guerreiro("Kina", 500, 80, 40, 120, 10);
		
		System.out.println(druid);
		
		System.out.println(druid.attack());

		druid.lvlUp();
		System.out.println(druid);

		druid.lvlUp();
		System.out.println(druid);

		System.out.println(druid.attack());
		
		System.out.println(druid.aprenderMagia("congelamento"));
		System.out.println(druid.aprenderMagia("grito assassino"));
		
		druid.getMagias();
		
		System.out.println("-----------------------");
		
		System.out.println(knight);
		
		System.out.println(knight.attack());

		knight.lvlUp();
		System.out.println(knight);

		knight.lvlUp();
		System.out.println(knight);

		System.out.println(knight.attack());
		
		knight.getHabilidades();
		
		System.out.println(knight.aprenderHabilidade("Chute alto"));
		knight.aprenderHabilidade("Corte com espada");
			
		knight.getHabilidades();
		
		program.main(null);
	
	}
}
