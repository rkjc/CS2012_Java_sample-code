package suppliment;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StyleSheetUsage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//StackPane s = new StackPane();
		//Scene sc = new Scene(s, 500, 300);
		VBox vbx = new VBox();
		vbx.setSpacing(50);
		vbx.setAlignment(Pos.BASELINE_CENTER);
		Scene sc = new Scene(vbx, 600, 300);
		// sc.getStylesheets().add("style.css");
		sc.getStylesheets().add(getClass().getResource("style3.css").toExternalForm());

		Label lab1 = new Label("Hello with style!");
		lab1.getStyleClass().add("arthur");
		lab1.getStyleClass().add("beatrice");

		Label lab2 = new Label("current time:  " + LocalDateTime.now());
//		Text lab2 = new Text("current time:  " + LocalDateTime.now());
//		lab2.setX(10);
//		lab2.setY(10);
		lab2.getStyleClass().add("timestyle");
		
		boolean am = getAm();

//		if (am)
//			l.getStyleClass().add("amstyle");
//		else
//			l.getStyleClass().add("pmstyle");
//		s.getChildren().add(lab1);
//		s.getChildren().add(lab2);
		vbx.getChildren().add(lab1);
		vbx.getChildren().add(lab2);
		
		primaryStage.setScene(sc);
		primaryStage.show();

	}

	private boolean getAm() {
		LocalDateTime d = LocalDateTime.now();
		if (d.getHour() < 12)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
