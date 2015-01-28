package messageencryption;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EncryptionView {

	private EncryptionModel myModel; 
	private Stage myStage; 
	private Scene myScene;
	private Group root;
	private TextField messageField;
	private TextField expField;
	private TextField numField; 
	
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
		messageField = new TextField("Enter message here");
		
		messageField.setOnAction(ActionEvent -> myModel.setMessage(messageField.getText()));
		root.getChildren().add(messageField);
	}
	
	public void getKeyView(){
		root.getChildren().remove(messageField); 
		VBox vbox = new VBox(); 
		expField = new TextField("Enter the exponent of your public or private key");
		numField = new TextField("Enter the n of your public or private key");
		expField.setOnAction(ActionEvent -> myModel.encrypt(expField.getText(), numField.getText()));
		numField.setOnAction(ActionEvent -> myModel.encrypt(expField.getText(), numField.getText()));
		vbox.getChildren().add(expField);
		vbox.getChildren().add(numField);
		root.getChildren().add(vbox);
	}
	
	public void pop(String s){
		System.out.println(s); 
	}
	
}
