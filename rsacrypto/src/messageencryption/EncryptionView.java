package messageencryption;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EncryptionView {

	private EncryptionModel myModel; 
	private Stage myStage; 
	private Scene myScene;
	private Group root; 
	
	public EncryptionView(EncryptionModel model){
		myModel = model; 
		myStage = new Stage(); 
	}
	
	public void initialize(){
		root = new Group(); 
		myScene = new Scene(root); 
		myStage.setTitle("Message Encryption");
		myStage.setScene(myScene);
		myStage.show(); 
		TextField field = new TextField("Enter message here");
		field.setOnAction(ActionEvent -> myModel.encrypt(field.getText()));
	}
	
}
