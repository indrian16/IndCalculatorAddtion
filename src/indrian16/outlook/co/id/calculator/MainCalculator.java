package indrian16.outlook.co.id.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainCalculator extends Application {
	
	private static Stage primaryStage;
	
	
	private void setPrimaryStage(Stage stage) {
		MainCalculator.primaryStage = stage;
	}
	
	public static Stage getPrimaryStage() {
		
		return MainCalculator.primaryStage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		setPrimaryStage(stage);
		
		Parent root = FXMLLoader.load(getClass().getResource("MainCalculator.fxml"));
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Calculator Addtion");
		stage.setResizable(false);
		stage.show();		
		
	}
	
}