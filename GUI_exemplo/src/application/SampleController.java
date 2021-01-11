package application;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

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
    private Label lab3;
    
    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private RadioButton radio3;

    @FXML
    private RadioButton radio4;
    
    private ToggleGroup toggleGroup;
    
    @FXML
    private Label lab4;
    
    @FXML
    private ComboBox<String> comboBox;
    
    @FXML
    private ListView<String> itemList1;

    @FXML
    private Button itensBtn;

    @FXML
    private TextArea textField1;
    
    @FXML
    private Button clearTF;
    
    
    @FXML
    public void changeBtnPushed(ActionEvent event) throws IOException {
    	Parent newView = FXMLLoader.load(getClass().getResource("View.fxml"));
    	Scene newScene = new Scene(newView);
    	Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	window.setScene(newScene);
    	window.show();
    	
    }

    @FXML
    public void encomenda(ActionEvent event) {
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
    
    @FXML
    void choice_chkBox(ActionEvent event) {
    	this.label2.setText(chkBox.getValue());
    }
    
    @FXML
    public void comboBox(ActionEvent event) {
    	this.lab3.setText(comboBox.getValue());
    }
    
     @FXML    
    public void radioBtnChanged(ActionEvent event) {
    	if(this.toggleGroup.getSelectedToggle().equals(this.radio1)) {
    		lab4.setText("Java");
    	}
    	
    	if(this.toggleGroup.getSelectedToggle().equals(this.radio2)) {
    		lab4.setText("PHP");
    	}
    	
    	if(this.toggleGroup.getSelectedToggle().equals(this.radio3)) {
    		lab4.setText("C++");
    	}
    	
    	if(this.toggleGroup.getSelectedToggle().equals(this.radio4)) {
    		lab4.setText("JavaScript");
    	}
    }
    
    @FXML
    public void select(ActionEvent event) {
    	String textAreaString = "";
    	ObservableList<String> list = itemList1.getSelectionModel().getSelectedItems();
    	for(Object item : list) {
    		textAreaString += String.format("%s%n", (String)item);
    	}
    	textField1.setText(textAreaString);
    }
    
    @FXML
    public void clearTF(ActionEvent event) {
    	String textAreaString = "";
    	textField1.setText(textAreaString);
    }
    
    
    public void initialize() {
    	//preencher choiceBox
     	this.chkBox.getItems().add("Duarte");
    	this.chkBox.getItems().add("Ana");
    	this.chkBox.getItems().add("Carlos");
    	
    	//prencher comboBox
    	this.comboBox.getItems().addAll("op1", "op2", "op3");
    	
    	//criar ToggleGroup para os Radio Button 
    	this.toggleGroup = new ToggleGroup();
    	this.radio1.setToggleGroup(toggleGroup);
    	this.radio2.setToggleGroup(toggleGroup);
    	this.radio3.setToggleGroup(toggleGroup);
    	this.radio4.setToggleGroup(toggleGroup);
    	
    	//criar lista de itens
    	this.itemList1.getItems().addAll("Lápis", "Canetas", "Borrachas", "PapelA4", "Lapiseira", "Régua");
    	this.itemList1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);    	
    	
    }

}