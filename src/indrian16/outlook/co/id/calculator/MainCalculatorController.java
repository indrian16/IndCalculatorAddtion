package indrian16.outlook.co.id.calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainCalculatorController implements Initializable {
	
	MainCalculator main = new MainCalculator();
	
	private int reslut = 0;
	
	@FXML private AnchorPane root;
	@FXML private TextField input1 = new TextField("");
	@FXML private TextField input2;
	@FXML private Button action;
	@FXML private Label status = new Label("The reslut is "+"["+reslut+"]");
	@FXML private Button fullScreen;
	@FXML private Button exit;
	@FXML private Button clearAll;
	
	@FXML
	public void actionButton(ActionEvent event) {
		
		ModelCalculator model = new ModelCalculator();
		
		int number1 = MainCalculatorController.this.getNumberInput1();
		int number2 = MainCalculatorController.this.getNumberInput2();
		
		if (reslut > -999999999) {
			
			reslut = model.setAddition(number1, number2);
			status.setText("The reslut is "+"["+reslut+"]");
			
		} else if (input1.getText().isEmpty() || input2.getText().isEmpty()){
			
			status.setText("You need input Integer value");
			
		} else {
			
		}
		
	}
	
	public int getNumberInput1() {
		
		return Integer.parseInt(input1.getText());
	}
	
	public int getNumberInput2() {
		
		return Integer.parseInt(input2.getText());
	}
	
	@FXML
	public void fullScreen() {
		
		Stage primaryStage = MainCalculator.getPrimaryStage();
		
		primaryStage.setFullScreen(true);
		
	}
	
	@FXML
	public void exit() {
		
		Platform.exit();
	}
	
	@FXML
	public void clearAll() {
		reslut = 0;
		input1.setText("");
		input2.setText("");
		status.setText("The reslut is "+"["+reslut+"]");
	}
	
	public void normalLayout() {
		//Label Status
		status.setPrefSize(580, 100);
		root.setTopAnchor(status, 14.0);
		root.setRightAnchor(status, 9.0);
		root.setLeftAnchor(status, 11.0);
		root.setBottomAnchor(status, 286.0);
				
		//Input1
		root.setTopAnchor(input1, 129.0);
		root.setRightAnchor(input1, 184.0);
		root.setLeftAnchor(input1, 186.0);
		root.setBottomAnchor(input1, 216.0);
				
		//Input2
		root.setTopAnchor(input2, 186.0);
		root.setRightAnchor(input2, 184.0);
		root.setLeftAnchor(input2, 186.0);
		root.setBottomAnchor(input2, 159.0);
				
		//action
		root.setTopAnchor(action, 278.0);
		root.setRightAnchor(action, 184.0);
		root.setLeftAnchor(action, 186.0);
		root.setBottomAnchor(action, 67.0);
				
		//ClaerAll
		root.setTopAnchor(clearAll, 129.0);
		root.setRightAnchor(clearAll, 11.0);
		root.setLeftAnchor(clearAll, 449.0);
		root.setBottomAnchor(clearAll, 235.0);
				
		//FullScreen
		root.setTopAnchor(fullScreen, 186.0);
		root.setRightAnchor(fullScreen, 11.0);
		root.setLeftAnchor(fullScreen, 449.0);
		root.setBottomAnchor(fullScreen, 190.0);
				
		//Exit
		root.setTopAnchor(exit, 214.0);
		root.setRightAnchor(exit, 11.0);
		root.setLeftAnchor(exit, 449.0);
		root.setBottomAnchor(exit, 162.0);
	}
	
	public void fullLayout() {
		//Label Status
		status.setPrefSize(650, 100);
		root.setTopAnchor(status, 103.0);
		root.setRightAnchor(status, 340.0);
		root.setLeftAnchor(status, 379.0);
		root.setBottomAnchor(status, 506.0);
		
		//Input1
		root.setTopAnchor(input1, 257.0);
		root.setRightAnchor(input1, 544.0);
		root.setLeftAnchor(input1, 592.0);
		root.setBottomAnchor(input1, 456.0);
		
		//Input2
		root.setTopAnchor(input2, 315.0);
		root.setRightAnchor(input2, 544.0);
		root.setLeftAnchor(input2, 592.0);
		root.setBottomAnchor(input2, 389.0);
		
		//action
		root.setTopAnchor(action, 399.0);
		root.setRightAnchor(action, 544.0);
		root.setLeftAnchor(action, 592.0);
		root.setBottomAnchor(action, 314.0);
		
		//ClaerAll
		root.setTopAnchor(clearAll, 257.0);
		root.setRightAnchor(clearAll, 225.0);
		root.setLeftAnchor(clearAll, 1003.0);
		root.setBottomAnchor(clearAll, 486.0);
		
		//FullScreen
		root.setTopAnchor(fullScreen, 318.0);
		root.setRightAnchor(fullScreen, 225.0);
		root.setLeftAnchor(fullScreen, 1003.0);
		root.setBottomAnchor(fullScreen, 425.0);
		
		//Exit
		root.setTopAnchor(exit, 343.0);
		root.setRightAnchor(exit, 225.0);
		root.setLeftAnchor(exit, 1003.0);
		root.setBottomAnchor(exit, 400.0);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		Stage primaryStage = MainCalculator.getPrimaryStage();
		
		primaryStage.widthProperty().addListener(e -> {
			
			if (primaryStage.getWidth() < 1200) {
				normalLayout();
			} else if (primaryStage.getWidth() > 1200) {
				fullLayout();
			}
		});
	}
	

}
