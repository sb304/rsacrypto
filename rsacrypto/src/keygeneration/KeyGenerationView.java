package keygeneration;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class KeyGenerationView {

	private KeyGenerationModel myModel; 
	private Stage myStage; 
	private Scene myScene;
	private Group root; 
	
	public KeyGenerationView(KeyGenerationModel model){
		myModel = model; 
		myStage = new Stage(); 
		
	}
	
	public void initialize(){
		root = new Group(); 
		myScene = new Scene(root);
		myStage.setTitle("Key Generator");
		myStage.setScene(myScene);
		myStage.show();
		Button b = new Button("Click here to get a key pair");
		b.setOnAction(EventHandler -> myModel.generate());
		root.getChildren().add(b);
	}
	
	public void pop(KeyPair kp){
		Stage pop = new Stage(); 
		Group popRoot = new Group(); 
		Scene popScene = new Scene(popRoot); 
		pop.setScene(popScene);
		VBox vbox = new VBox(); 
		Label l1 = new Label("Your public key is: ");
		Label l2 = new Label("Exponent " + kp.getPublicExponent());
		vbox.getChildren().add(l1);
		vbox.getChildren().add(l2);
		TextField field = new TextField("Test here");
		vbox.getChildren().add(field);
		pop.show();
		popRoot.getChildren().add(vbox);
	}
	
}
