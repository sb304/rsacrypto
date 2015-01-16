package keygeneration;

public class KeyGenerationModel {

	private KeyGenerationView myView; 
	private KeyGenerator myKeyGenerator; 
	
	public KeyGenerationModel(){
		myView = new KeyGenerationView(this);
		myKeyGenerator = new KeyGenerator(); 
	
	}
	
	
	public void initializeView(){
		myView.initialize(); 
	}
}
