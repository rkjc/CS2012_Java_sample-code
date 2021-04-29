package helloButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TwoButtonLabelHBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Two Button VBox");
		Label lbl1 = new Label("The Label");
		
		Button btn1 = new Button();
		btn1.setText("This is Button ONE");
		
		Button btn2 = new Button();
		btn2.setText("This is Button TWO");
		
		// Explicit Anonymous version of an event handler
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				lbl1.setText("Button ONE pushed");
			}
		});
				
		// Lambda Function version of an event handler
		btn2.setOnAction(abc -> {
				lbl1.setText("Button\nTWO\npushed"); // with new-line characters
		});
		
		HBox hbx1 = new HBox(10); // the attribute sets the space between nodes
		hbx1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the inside edges of the HBox
		hbx1.getChildren().add(btn1);
		hbx1.getChildren().add(btn2);
		hbx1.getChildren().add(lbl1);

		Scene sc = new Scene(hbx1, 500, 150);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}