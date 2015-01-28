package messagedecryption;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DecryptionView {

	private DecryptionModel myModel; 
	private Stage myStage; 
	private Scene myScene; 
	private Group root; 
	private TextField messageField; 
	
	public DecryptionView(DecryptionModel model){
		myModel = model; 
	}
	
	public void initialize(){
		myStage = new Stage(); 
		root = new Group();
		myScene = new Scene(root); 
	}
	
	
	
}
