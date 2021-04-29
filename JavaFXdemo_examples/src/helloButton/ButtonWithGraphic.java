package helloButton;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonWithGraphic extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Button with Image");

		Button btn1 = new Button(); // any text put here will end up next to the picture on the button
		Label lab1 = new Label("output shown here");

		// Use the File class to store the file path from a relative location
		File imgFile1 = new File("crazyCat.jpg"); // in default Eclipse file location

		// Convert the file location into an absolute path location string
		// Involves file I/O so needs to handle an exception by adding a 'throws'
		// declaration to the start() method
		String imgFileloc1 = imgFile1.toURI().toURL().toExternalForm();

		Image img1 = new Image(imgFileloc1); // the Image constructor needs an absolute path.

		// Use the Image object to make an ImageView object and set its parameters
		ImageView btnPic1 = new ImageView(img1);

		btnPic1.setFitWidth(50); // setting size of the image - which sets size of Button
		btnPic1.setPreserveRatio(true);

		// Attach the picture to the button
		btn1.setGraphic(btnPic1);

		// Lambda Function version of an Event Handler
		btn1.setOnAction(xyz -> {
			lab1.setText("Button was pushed");
		});

		VBox vbx1 = new VBox(10);
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