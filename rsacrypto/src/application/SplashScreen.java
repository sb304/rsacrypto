package application;


import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import keygeneration.KeyGenerator;
import keygeneration.KeyPair;

public class SplashScreen {
	private Stage myStage; 
	private Scene myScene; 
	private BorderPane myPane; 
	
	public SplashScreen(){
		myStage = new Stage();
		myPane = new BorderPane();
		myScene = new Scene(myPane, 1000, 1000);
		myStage.setScene(myScene);
		myStage.setTitle("Splash Screen");
	}
	
	public void show(){
		KeyGenerator keyG = new KeyGenerator();
		KeyPair kp = keyG.generateKeyPair(); 
		kp.print();
		myStage.show();
		
	}
	
}
