package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML private Button btn;

	@FXML private Label label1;
	
	@FXML private TextField textField1;
	
	@FXML private CheckBox chkBoxJava;

    @FXML private CheckBox chkBoxPHP;

    @FXML private CheckBox chkBoxRuby;
    
    @FXML private Label label2;
    
    @FXML private ChoiceBox<String> choiceBox;

    @FXML private Label label3;
    
    @FXML private ComboBox<String> comboBox;

    @FXML private Label label4;
    
    @FXML private TextField valor1;

    @FXML private TextField valor2;

    @FXML private TextField resultado;

	@FXML
	public void escreveTexto(ActionEvent event) {
		String texto = this.textField1.getText();
		this.label1.setText(texto);
	}
	
	@FXML
    public void escolherLinguagens(ActionEvent event) {
		String linguagens = "";
		if(this.chkBoxJava.isSelected()) {
			linguagens+="Java\n";
		}
		if(this.chkBoxPHP.isSelected()) {
			linguagens+="PHP\n";
		}	
		if(this.chkBoxRuby.isSelected()) {
			linguagens+="Ruby\n";
		}
		this.label2.setText(linguagens);
    }
	
	@FXML
	public void escreverOpcao(ActionEvent event) {
		this.label3.setText(this.choiceBox.getValue());
	}
	
	@FXML
	public void escolherBebida(ActionEvent event) {
		this.label4.setText(this.comboBox.getValue());
	}
	
	@FXML
	public void soma(ActionEvent event) {
		int val1 = Integer.parseInt(this.valor1.getText());
		int val2 = Integer.parseInt(this.valor2.getText());
		int soma = val1 + val2;
		String res = String.valueOf(soma);
		this.resultado.setText(res);
	}
	
	public void initialize () {
		
		//preencher as opções da choiceBox	
		this.choiceBox.getItems().addAll("Java","PHP","Ruby","JavaScript");
		
		//preencher as opções da choiceBox	
		this.comboBox.getItems().addAll("Coca-Cola","Fanta","Kima","Sprite");
	}

}