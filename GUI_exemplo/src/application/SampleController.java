package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
    private CheckBox op1;

    @FXML
    private CheckBox op2;

    @FXML
    private CheckBox op3;

    @FXML
    private Button enc;

    @FXML
    private Label opc;
    
    @FXML
    private ChoiceBox<String> chkBox;

    @FXML
    private Button btn2;

    @FXML
    private Label label2;

    @FXML
    void choice_chkBox(ActionEvent event) {
    	label2.setText(chkBox.getValue());
    }

    @FXML
    void encomenda(ActionEvent event) {
    	String encomenda="Pizzas encomendadas:\n";
    	if(op1.isSelected()) {
    		encomenda+="Peperoni\n";
    	}
    	if(op2.isSelected()) {
    		encomenda+="Havaiana\n";
    	}
    	if(op3.isSelected()) {
    		encomenda+="Cheese\n";
    	}
    	opc.setText(encomenda);
    }
    
    public void initialize() {
     	chkBox.getItems().add("Duarte");
    	chkBox.getItems().add("Ana");
    	chkBox.getItems().add("Carlos");
    }

}