package layoutDemos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Twentyx20Buttons extends Application{

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Push start get random integer 100-499 (for 20x20)
		// show 3 sec count down
		// when count equals zero
		// show random number
		// start timer
		// when button result matches random int
		// stop timer
		// Display duration
		
	
		Pane mypane = new Pane(); // the 10 is the space between the buttons (nodes)
		HBox  hPane = new HBox(20);
		VBox vPane = new VBox(10);
		GridPane gPane = new GridPane();
		
		
		Button startButt = new Button("Start"); 
		Button b002 = new Button("2"); 
		
		Button [] buttArr = new Button[20];
		
		for(int i = 0; i < 20; i++) {
			buttArr[i] = new Button(String.valueOf(i));
			gPane.add(buttArr[i], i, 0);
		}
		
		
		hPane.getChildren().addAll(startButt, b002);
		vPane.getChildren().add(hPane);
		vPane.getChildren().add(gPane);
		
		Scene sc = new Scene(vPane, 1000, 700);
		primaryStage.setScene(sc);
		primaryStage.setX(7400);  // start location on desktop.
		primaryStage.setY(100);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}	
}
