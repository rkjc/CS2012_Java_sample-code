package helloButton;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class HelloFX2Color extends Application {

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Hello World! window title");

		Text tx = new Text("Look at this awesome text!.Hidden behind the button");

		Button btn = new Button("Say 'Hello World'");
		btn.setStyle("-fx-background-color: cyan");

		
		btn.setOnAction( xyz -> {
			
			FileChooser fileChooser = new FileChooser();
			//File file = fileChooser.showOpenDialog(primaryStage);
			
//			tx.setText("------------------------------------------------");
//			System.out.println("Hello to the World!");
//			System.out.println(xyz.getSource().toString());	
		} );
		
	
		VBox vpane = new VBox();
		vpane.getChildren().add(tx);
		vpane.getChildren().add(btn);

		Scene sc = new Scene(vpane, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.setX(7400);  // start location on desktop. *** make sure to change or disable
		primaryStage.setY(100);   // start location on desktop. *** make sure to change or disable
		primaryStage.show();
	}

	// ------------------------------------------------
	public static void main(String[] args) {
		System.out.println("Enetered the main() method");
		Application.launch(args);
		System.out.println("Leaving the main() method");
	}
}
