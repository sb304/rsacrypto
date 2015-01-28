package application;


import messagedecryption.DecryptionModel;
import messageencryption.EncryptionModel;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import keygeneration.KeyGenerationModel;
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
		initializeGui();
	}
	
	private void initializeGui(){
		VBox vbox = new VBox(); 
		Button generate = new Button("Generate Keys"); 
		generate.setOnAction(EventHandler -> generate());
		Button encrypt = new Button("Encrypt Message");
		encrypt.setOnAction(EventHandler -> encrypt()); 
		Button decrypt = new Button("Decrypt Message");
		decrypt.setOnAction(EventHandler -> decrypt());
		vbox.getChildren().addAll(generate, encrypt, decrypt);
		myPane.setCenter(vbox);
	}
	
	public void show(){
		myStage.show();
	}
	
	private void generate(){
		KeyGenerationModel kgmodel = new KeyGenerationModel(); 
		kgmodel.initializeView();
		myStage.close(); 
	}
	
	private void encrypt(){
		EncryptionModel encmodel = new EncryptionModel();
		encmodel.initializeView();
		myStage.close();
	}
	
	private void decrypt(){
		DecryptionModel decmodel = new DecryptionModel();
		decmodel.initializeView();
		myStage.close(); 
	}
	
}
