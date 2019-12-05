/**
 * 
 */
package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * @author DUMAS
 *
 */
public class App {
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ResourceBundle bundle = ResourceBundle.getBundle("application");
			String titre = bundle.getString("titre");

			String asciiArt = FigletFont.convertOneLine(titre);
			System.out.println(asciiArt);
			//Affichage de l'environnement

			ResourceBundle env = ResourceBundle.getBundle("application");
			String environnement = env.getString("environnement");
			System.out.println("Environnement : " + environnement);

		
		}

}
