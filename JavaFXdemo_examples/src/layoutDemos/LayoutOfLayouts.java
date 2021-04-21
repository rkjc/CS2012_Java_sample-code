package layoutDemos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LayoutOfLayouts extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage theStage) {
		// Create a circle and set its properties
		Circle mycircle = new Circle();
		// mycircle.setCenterX(25);
		// mycircle.setCenterY(25);
		mycircle.setRadius(10);
		mycircle.setStroke(Color.RED);
		mycircle.setFill(Color.SKYBLUE);
		// StackPane.setAlignment(mycircle, Pos.CENTER_LEFT);
		StackPane.setAlignment(mycircle, Pos.CENTER);

		Circle mycircle2 = new Circle();
		mycircle2.setRadius(10);
		mycircle2.setStroke(Color.RED);
		mycircle2.setFill(Color.SKYBLUE);

		Pane mypane = new Pane();
		//Pane mypane = new StackPane();
		mypane.setStyle("-fx-background-color: BLUE; -fx-border-color: orange; -fx-border-width: 4; ");

		Pane mypane2 = new Pane();
		mypane2.setStyle("-fx-background-color: darkcyan; -fx-border-color: darkred; -fx-border-width: 4; ");

		// Color.CORNSILK

		StackPane sp01 = new StackPane();
		sp01.setMinSize(50, 50);
		sp01.setStyle("-fx-background-color: CORNSILK; -fx-border-color: grey; -fx-border-width: 2; ");
		Pane sp02 = new StackPane();
		// mp02.setAlignment(Pos.CENTER);
		sp02.setMinSize(50, 50);
		// mp02.setMaxSize(50, 50);
		sp02.setStyle("-fx-background-color: yellow; -fx-border-color: grey; -fx-border-width: 2; ");

		Pane mp03 = new Pane();
		mp03.setMinSize(50, 50);
		mp03.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		Pane mp04 = new Pane();
		mp04.setMinSize(50, 50);
		mp04.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		Pane mp05 = new Pane();
		mp05.setMinSize(50, 50);
		mp05.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		// Create a pane and set its properties
		GridPane gPane = new GridPane();

		// gPane.setAlignment(Pos.BASELINE_RIGHT);
		gPane.setAlignment(Pos.CENTER);
		gPane.setPadding(new Insets(10, 10, 10, 10));
		gPane.setHgap(5);
		gPane.setVgap(5);
		gPane.setLayoutX(30);
		gPane.setLayoutY(10);
		// gPane.setMaxHeight(100);
		gPane.setMinHeight(10);
		// gPane.setMaxWidth(100);
		gPane.setMinWidth(100);
		gPane.setStyle("-fx-background-color: cyan; -fx-border-color: red; -fx-border-width: 3; ");

		sp02.getChildren().add(mycircle);

		gPane.add(sp02, 0, 0);
		// gPane.add(mycircle, 0, 0);
		gPane.add(mycircle2, 3, 2);
		gPane.add(sp01, 2, 1);
		gPane.add(mp03, 3, 2);
		gPane.add(mp04, 2, 2);
		gPane.add(mp05, 1, 2);

		HBox hb01 = new HBox();
		hb01.setStyle("-fx-background-color: lightgreen; -fx-border-color: olive; -fx-border-width: 2; ");
		hb01.setMinSize(150, 50);
		hb01.setMaxSize(150, 50);
		hb01.setLayoutX(180);
		hb01.setLayoutY(220);
		StackPane.setAlignment(hb01, Pos.BOTTOM_CENTER);
		
		HBox hb02 = new HBox();
		hb02.setStyle("-fx-background-color: lightgreen; -fx-border-color: olive; -fx-border-width: 2; ");
		hb02.setMinSize(320, 40);
		
		
		VBox vb01 = new VBox();
		vb01.setStyle("-fx-background-color: pink; -fx-border-color: violet; -fx-border-width: 3; ");

		mypane2.getChildren().add(gPane);
		mypane2.getChildren().add(hb01);
		
		vb01.getChildren().add(mypane2);
		vb01.getChildren().add(hb02);

		mypane.getChildren().add(vb01);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(mypane, 400, 400);
		theStage.setTitle("Layout of Layouts"); // Set the stage title
		theStage.setScene(scene); // Place the scene in the stage
		theStage.setX(7400); // start location on desktop.
		theStage.setY(80);
		theStage.show(); // Display the stage
	}

	Color[] myBling = { Color.RED, Color.BLUE, Color.ORANGE, Color.AQUA, Color.VIOLET, Color.DARKCYAN, Color.DARKRED,
			Color.OLIVE, Color.PINK, Color.TURQUOISE, Color.BURLYWOOD, Color.YELLOW, Color.GREEN, Color.GREY };

	// --------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}

}
