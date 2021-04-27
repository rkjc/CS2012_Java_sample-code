package helloButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX2withTextArea extends Application {

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Hello World! window title");

		//Text tx = new Text("Look at this awesome text!.Hidden behind the button");
		TextArea atext = new TextArea();
		atext.setText("This text area is under construction");
		
		Button btn = new Button("Say 'Hello World'");
		
		Label lbl1 = new Label("put words here");
		
		btn.setOnAction( xyz -> {
			lbl1.setText(atext.getText());
			System.out.println("Hello to the World!");
			System.out.println(xyz.getSource().toString());	
		} );
		
	
		VBox vBox= new VBox();

		vBox.getChildren().add(btn);
		vBox.getChildren().add(atext);
		vBox.getChildren().add(lbl1);

		Scene sc = new Scene(vBox, 400, 250);
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
