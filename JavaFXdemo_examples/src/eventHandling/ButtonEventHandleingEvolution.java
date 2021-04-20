package eventHandling;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonEventHandleingEvolution extends Application {

	@Override
	public void start(Stage primaryStage) {
				
		primaryStage.setTitle("Two Button HBox");

		HBox hPane = new HBox(10); // the 10 is the space between the buttons (nodes)
		hPane.setAlignment(Pos.CENTER);
		hPane.setPadding(new Insets(15, 15, 15, 15));
		
		// ------------------------------------------------
		// Separate non-anonymous handler
		Button btn1 = new Button("This is Button ONE");
		
		EventHandler<ActionEvent> handler1 = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button One pushed");
			}
		};

		btn1.setOnAction(handler1);

		// --------------------------------------------------------------
		// in-line anonymous handler
		
		Button btn2 = new Button("This is Button TWO");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Button Two pushed");
				System.out.println(e.getSource().toString());
			}
		});
		
		// --------------------------------------------------------------
		// Lambda format handler
		
		Button btn3 = new Button("THREE");
		btn3.setOnAction(xyz -> { System.out.println("Button Three pushed"); });
		
		// --------------------------------------------------------------
		
		hPane.getChildren().add(btn1);
		hPane.getChildren().add(btn2);
		hPane.getChildren().add(btn3);

		Scene sc = new Scene(hPane, 400, 60);
		primaryStage.setScene(sc);
		//primaryStage.setX(7400);  // start location on desktop.
		//primaryStage.setY(100);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}


class HappyDogs {
	
}


