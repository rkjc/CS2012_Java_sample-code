package shapesAndDrawing;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayClockWithUpdateButton extends Application {
	String timeString = "";
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a clock and a label
		ClockPane clock = new ClockPane();
		timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);

		// --------------------------------------------------------------------
		VBox vbox1 = new VBox(10); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges

		HBox hbox1 = new HBox(10);
		hbox1.setPadding(new Insets(15, 15, 15, 15));
		hbox1.setStyle("-fx-background-color: CYAN");

		// --------------------------------------------------------------------
		Text txt1 = new Text("Text at the top of the VBox stack");
		Text txt2 = new Text("Text at the bottom of the VBox stack");
		Button btn1 = new Button();
		Button btn2 = new Button();

		// --------------------------------------------------------------------
		btn1.setText("This is Button ONE");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button One pushed");
				txt1.setText("Button ONE pushed");
				clock.setCurrentTime();
				timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
				lblCurrentTime.setText(timeString);
			}
		});

		btn2.setText("This is Button TWO");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button Two pushed");
				txt1.setText("Button TWO pushed");
			}
		});
		// --------------------------------------------------------------------

		hbox1.getChildren().add(btn1);
		hbox1.getChildren().add(btn2);

		
//		vbox1.getChildren().add(txt1);
//		vbox1.getChildren().add(txt2);

		// ------------------------------------------------------------------------

		// Place clock and label in border pane
		BorderPane bPane = new BorderPane();
		bPane.setTop(hbox1); 
		bPane.setCenter(clock);
		bPane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		bPane.setPrefSize(400, 400);
		
//		vbox1.getChildren().add(hbox1);
//		vbox1.getChildren().add(bPane);

		// Create a scene and place it in the stage
		Scene scene = new Scene(bPane, 250, 300);
		primaryStage.setTitle("DisplayClock"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	// ----------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}