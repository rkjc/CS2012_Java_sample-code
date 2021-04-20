package shapesAndDrawing;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MouseClicksDifferentSquares extends Application {

	@Override
	public void start(Stage theStage) throws Exception {

		Pane mypane = new Pane();
		mypane.setUserData("oh the pane");

		Rectangle rect1 = new Rectangle(10, 10, 30, 30);
		rect1.setUserData("aaa");

		Rectangle rect2 = new Rectangle(60, 10, 30, 30);
		rect2.setUserData("bbb");
		
		Circle circ1 = new Circle(140, 20, 15); // x, y, rad
		circ1.setUserData("ccc");

		EventHandler<MouseEvent> mousVent = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
				System.out.println("---- handle event ---------------------------");
				System.out.println(myz.getX() + " " + myz.getY());
				Object obj = myz.getSource();
				System.out.println("object is: " + myz.toString());
				System.out.println("-------------------------------");
				
				if (obj instanceof Rectangle) {
					//System.out.println("is rectangle");
					System.out.println(((Rectangle) obj).getUserData());
					//myz.consume();
				} else if (obj instanceof Pane) {
					//System.out.println("is pane");
					System.out.println(((Pane) obj).getUserData());
				} 
			}
		};

		mypane.setOnMouseClicked(mousVent);
		rect1.setOnMouseClicked(mousVent);
		rect2.setOnMouseClicked(mousVent);
		mypane.getChildren().add(rect1);
		mypane.getChildren().add(rect2);
		mypane.getChildren().add(circ1);

		Scene sc = new Scene(mypane, 400, 60);
		theStage.setScene(sc);
		theStage.setX(7400); // start location on desktop.
		theStage.setY(80);
		theStage.show();
	}

	// -------------------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}
}
