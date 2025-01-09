package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeEg {
	
		public WebDriver driver;
		public void initialiseBrowser(){
			//open edge driver
			 driver = new EdgeDriver();
			//url load 
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
		}

	public static void main(String[] args){
		EdgeEg edgeeg = new EdgeEg();
		edgeeg.initialiseBrowser();
	}
		

	}


