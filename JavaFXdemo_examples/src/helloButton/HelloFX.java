package helloButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World Button");

		Button btn = new Button("Say 'Hello World'");

		// Explicit version of setting up an Event Handler with a button
		EventHandler<ActionEvent> handleThis = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent xyz) {
				btn.setText("Hello button was pushed");
			}
		};
		btn.setOnAction(handleThis);
		
		StackPane root = new StackPane();  // Items in a StackPane placed at center by default
		root.getChildren().add(btn);

		Scene sc = new Scene(root, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	} // <- end of start method definition

	// ------------------------------------------------
	public static void main(String[] args) {
		System.out.println("Enetered the main() method");
		Application.launch(args);
		System.out.println("Leaving the main() method");
	}
}


//// Lambda Function version of an Event Handler
//btn.setOnAction( xyz -> {
//	btn.setText("Button was pushed");
//} );
