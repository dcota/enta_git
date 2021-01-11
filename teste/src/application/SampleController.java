package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
    private TextField tf1;

    @FXML
    private TextArea result;

    @FXML
    private TextField tf2;
    
    @FXML
    public void somaBtnPushed(ActionEvent event) {
    	try {
    		int val1 = Integer.parseInt(this.tf1.getText());
        	int val2 = Integer.parseInt(this.tf2.getText());
        	int soma = val1+val2;
        	String res = String.valueOf(soma);
        	result.setText(res);
    	}catch(NumberFormatException e){
    		Alert alert= new Alert(Alert.AlertType.ERROR);
    		alert.setHeaderText(null);
    		alert.setTitle("Ocorreu um erro!");
    		alert.setContentText("Formato incorreto");
    		alert.showAndWait(); 	
    		reset();		
    	}
    }
    
    @FXML
    public void reset() {
    	this.tf1.setText("");
    	this.tf2.setText("");
    }
}
