package apackage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ahellow extends Application {

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Hello World! window title");

		Text tx = new Text("Look at this awesome text!.Hidden behind the button");

		Button btn = new Button("Say 'Hello World'");

//		tx.setText("------------------------------------------------");
//		System.out.println("Hello to the World!");
		
//		btn.setOnAction(  new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent xyz) {
//				
//			}
//		}  );
//		
		
		btn.setOnAction( xyz -> {
			tx.setText("------------------------------------------------");
			System.out.println("Hello to the World!");
			System.out.println(xyz.getSource().toString());	
		} );
		
	
		StackPane root = new StackPane();
		root.getChildren().add(tx);
		root.getChildren().add(btn);

		Scene sc = new Scene(root, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	// ------------------------------------------------
	public static void main(String[] args) {
		System.out.println("Enetered the main() method");
		Application.launch(args);
		System.out.println("Leaving the main() method");
	}
}