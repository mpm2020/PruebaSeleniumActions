package educacionit.educait_aut_81534;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticaM1 {
	//Variables que necesitaremos para nuestra prueba
	String url="http://www.automationpractice.pl/index.php";
	
	@Test
	public void lab1_test(){
		
		System.out.println("Hola mundo de Automatización!!");
		
	}
	
	@Test
	public void buscarProductoEdge() {
		//Paso 1: Definir navegador a utilizar
		
		WebDriver navegador= new EdgeDriver();
		
		//Paso 2: Abrir la página que se va a probar
		navegador.get(url);
		
		//Paso 3: Cerrar el navegador
		
		navegador.quit();
		
		
	}
	
	@Test
	public void buscarProductoFirefox() {
		//Paso 1: Definir navegador a utilizar
		
		WebDriver navegador= new FirefoxDriver();
		
		//Paso 2: Abrir la página que se va a probar
		navegador.get(url);
		
		//Paso 3: Cerrar el navegador
		
		navegador.quit();
			
	}

}
