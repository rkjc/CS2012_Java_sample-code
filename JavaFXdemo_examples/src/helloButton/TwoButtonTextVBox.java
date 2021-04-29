package helloButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoButtonTextVBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Two Button VBox");
		Text txt1 = new Text("Text at the top of the VBox stack");
		
		Button btn1 = new Button();
		btn1.setText("This is Button ONE");
		
		Button btn2 = new Button();
		btn2.setText("This is Button TWO");
		
		// Explicit Anonymous version of an event handler
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				txt1.setText("Button ONE pushed");
				//System.out.println("Button One pushed");
			}
		});
				
		// Labda Function version of an event handler
		btn2.setOnAction(abc -> {
				txt1.setText("Button TWO pushed");
		});
		
		VBox vbox1 = new VBox(10); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the inside edges of the VBox
		vbox1.getChildren().add(txt1);
		vbox1.getChildren().add(btn1);
		vbox1.getChildren().add(btn2);

		Scene sc = new Scene(vbox1, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
