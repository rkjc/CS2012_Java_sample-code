package imageShow;

import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoButtonImageChooser extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Two Button VBox");
		// --------------------------------------------------------------------
		VBox vbox1 = new VBox(10); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		//vbox1.setStyle(" -fx-border-color: red; -fx-border-width: 2; ");

		HBox hbox1 = new HBox(10);
		hbox1.setPadding(new Insets(15, 15, 15, 15));
		hbox1.setStyle("-fx-background-color: CYAN");

		ImageView imageHolder1 = new ImageView();
		imageHolder1.setFitHeight(300);
		imageHolder1.setPreserveRatio(true);

		// --------------------------------------------------------------------
		Text txt1 = new Text("Text in the middle of the VBox stack");

		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();

		File imgFile1 = new File("robotRineo.jpg"); // in default Eclipse file location
		String imgFileloc1 = imgFile1.toURI().toURL().toExternalForm(); // the Image constructor needs an absolute path.
		Image image1 = new Image(imgFileloc1);  
		//Image image1 = new Image("robotRineo.jpg");  <-- DOES NOT WORK!!!

		Image image2 = new Image(new File("images/SpaceSuit.jpg").toURI().toURL().toExternalForm());
		Image image3 = new Image(new File("images/crazyCat.jpg").toURI().toURL().toExternalForm());

		ImageView btnPic = new ImageView(image3);
		//ImageView btnPic = new ImageView("crazyCat.jpg");  <-- DOES NOT WORK!!!
		
		btnPic.setFitWidth(50);
		btnPic.setPreserveRatio(true);
		btn3.setGraphic(btnPic);

		Rectangle rec01 = new Rectangle(0, 0, 40, 40);
		rec01.setStroke(Color.RED);
		rec01.setFill(Color.LIME);

		Circle circ01 = new Circle();
		circ01.setRadius(20);
		circ01.setStroke(Color.RED);
		circ01.setFill(Color.LIME);

		Polygon polygon01 = new Polygon();
		polygon01.getPoints().addAll(new Double[] { 0.0, 0.0, 40.0, 20.0, 0.0, 40.0});
		polygon01.setStroke(Color.RED);
		polygon01.setFill(Color.LIME);
		polygon01.setRotate(180);
		
		btn4.setGraphic(polygon01);
		// --------------------------------------------------------------------
		btn1.setText("Show Armored Rino");

		btn1.setOnAction(xyz -> {
			txt1.setText("Rino Button pushed");
			imageHolder1.setImage(image1);
		});

		btn2.setText("Show Space Suit");
		btn2.setOnAction( abc -> {
				txt1.setText("Space Suit Button pushed");
				imageHolder1.setImage(image2);
		});
		
		btn4.setOnAction( abc -> {
				txt1.setText("Clear Button pushed");
				imageHolder1.setImage(null);
		});
		// --------------------------------------------------------------------

		hbox1.getChildren().addAll(btn1, btn2, btn3, btn4);

		vbox1.getChildren().addAll(hbox1, txt1, imageHolder1);

		Scene sc = new Scene(vbox1, 650, 500);
		// Scene sc = new Scene(vbox1);
		primaryStage.setScene(sc);
//		primaryStage.setX(7400); // start location on desktop. *** make sure to change or disable
//		primaryStage.setY(100); // start location on desktop. *** make sure to change or disable
		primaryStage.show();
	}
	// ---- methods -------------------------------------------------

	// ---------------------------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}
}