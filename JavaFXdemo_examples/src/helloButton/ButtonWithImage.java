package helloButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ButtonWithImage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Button with Image");

		Button btn1 = new Button(); // Any text put here will end up next to the picture on the button
//		btn1.setPadding(new Insets(5, 10, 5, 10)); // (top,right,bottom,left) - defaults (5,10,5,10)
		// Can be set to (0,0,0,0) and picture will fill the button

		Label lab1 = new Label("output shown here");

		// Button will expand to contain the graphic
		Rectangle rec01 = new Rectangle(0, 0, 80, 40); // (startLocX,startLocY,Width,Height)
		rec01.setStroke(Color.RED);
		rec01.setFill(Color.LIME);

		btn1.setGraphic(rec01);

		// Lambda Function version of an Event Handler
		btn1.setOnAction(xyz -> {
			lab1.setText("Button was pushed");
		});

		VBox vbx1 = new VBox();
		vbx1.getChildren().add(btn1);
		vbx1.getChildren().add(lab1);

		Scene sc = new Scene(vbx1, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	} // <- end of start method definition

	// ------------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}
}
