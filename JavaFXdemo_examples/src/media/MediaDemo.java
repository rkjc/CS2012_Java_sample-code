package media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class MediaDemo extends Application {

	private static final String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem3.mp3";

//	File sampleImageFile1 = new File("crazyCat.jpg");
//	String sampleImageFile1_locationString = sampleImageFile1.toURI().toURL().toExternalForm(); 

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		String songLocString = "";
		String bob = "happy";

		try {
			// File mediaFile = new File("02_Come_With_Me_Now.mp3");
			File mediaFile = new File("SingAlong.mp4");
			songLocString = mediaFile.toURI().toURL().toExternalForm();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// Media media = new Media(MEDIA_URL);
		Media media = new Media(songLocString);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		MediaView mediaView = new MediaView(mediaPlayer);
		mediaView.setFitHeight(300);
		mediaView.setPreserveRatio(true);
		// mediaView.autosize();

		Button playButton = new Button(">");
		playButton.setOnAction(e -> {
			if (playButton.getText().equals(">")) {
				mediaPlayer.play();
				playButton.setText("||");
			} else {
				mediaPlayer.pause();
				playButton.setText(">");
			}
		});

		Button rewindButton = new Button("<<");
		rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));

		Slider slVolume = new Slider();
		slVolume.setPrefWidth(150);
		slVolume.setMaxWidth(Region.USE_PREF_SIZE);
		slVolume.setMinWidth(30);
		slVolume.setValue(50);
		mediaPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));

		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(playButton, rewindButton, new Label("Volume"), slVolume);

		BorderPane bPane = new BorderPane();
		bPane.setCenter(mediaView);
		bPane.setBottom(hBox);

		mediaPlayer.play();

		// Create a scene and place it in the stage
		// Scene scene = new Scene(bPane);
		Scene scene = new Scene(bPane, 650, 500);
		primaryStage.setTitle("MediaDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.setX(7400); // start location on desktop.
		primaryStage.setY(100);
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
