package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary dizionario = new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	
    	txtResult.clear();
    	String text = txtWord.getText().trim().toLowerCase();
    	
    	String wordArray[] = text.split(" ");
    	if(!wordArray[0].matches("[a-zA-Z]*")) {
    		txtResult.setText("Inserire solo caratteri alfabetici");
    	}
    	if(wordArray.length == 2) {    		
    		dizionario.addWord(wordArray[0], wordArray[1]);
    		txtResult.appendText("Traduzione inserita correttamente\n");
    		txtWord.clear();
    	}if(wordArray.length == 1) { 
    		if(dizionario.dictionary.size() != 0 && dizionario.translateWord(wordArray[0]) != null)
    			txtResult.appendText(dizionario.translateWord(wordArray[0]));
    		else
    			txtResult.appendText("Parola non presente nel dizionario");
    		txtWord.clear();
    	}
    	
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	
    	txtResult.clear();
    	txtWord.clear();

    }
    
}
