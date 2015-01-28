package messagedecryption;

public class DecryptionModel {

	private DecryptionView myView; 
	
	public DecryptionModel(){
		myView = new DecryptionView(this); 
	}
	
	public void initializeView(){
		myView.initialize(); 
	}
	
}
