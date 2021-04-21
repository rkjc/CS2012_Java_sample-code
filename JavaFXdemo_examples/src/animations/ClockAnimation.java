package animations;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class ClockAnimation extends Application {
	
	public static ClockPane4hand clock = new ClockPane4hand();
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		//ClockPane4hand clock = new ClockPane4hand(); // Create a clock

		// Create a handler for animation
		EventHandler<ActionEvent> somethingHappens = e -> { clock.setCurrentTime(); }; // Set a new clock time

		// Create an animation for a running clock
		Timeline cartoon = new Timeline(new KeyFrame(Duration.millis(10), somethingHappens));

		cartoon.setCycleCount(Timeline.INDEFINITE);
		cartoon.play(); // Start animation
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(clock, 250, 250);
		primaryStage.setTitle("ClockAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.setX(7400); // start location on desktop.
		primaryStage.setY(60);
		primaryStage.show(); // Display the stage
	}


// ----------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
