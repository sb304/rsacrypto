package messagedecryption;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DecryptionView {

	private DecryptionModel myModel; 
	private Stage myStage; 
	private Scene myScene; 
	private Group root; 
	private TextField messageField; 
	private TextField expField; 
	private TextField numField; 
	
	public DecryptionView(DecryptionModel model){
		myModel = model; 
	}
	
	public void initialize(){
		myStage = new Stage(); 
		root = new Group();
		myScene = new Scene(root);
		myStage.setScene(myScene);
		myStage.show();
		messageField = new TextField("Enter message here");
		messageField.setOnAction(ActionEvent -> myModel.setMessage(messageField.getText()));
		root.getChildren().add(messageField); 
	}
	
	public void keyView(){
		root.getChildren().remove(messageField);
		VBox vbox = new VBox(); 
		expField = new TextField("Enter your private key or your correspondent's public key");
		numField = new TextField("Enter the n of the key");
		expField.setOnAction(ActionEvent -> myModel.decrypt(expField.getText(), numField.getText()));
		numField.setOnAction(ActionEvent -> myModel.decrypt(expField.getText(), numField.getText()));
		vbox.getChildren().add(expField);
		vbox.getChildren().add(numField);
		root.getChildren().add(vbox);
		
	}
	
	public void pop(String s){
		System.out.println(s);
	}
	
	
}
