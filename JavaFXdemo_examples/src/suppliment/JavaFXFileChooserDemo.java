package suppliment;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class JavaFXFileChooserDemo extends Application {
	@Override
	public void start(Stage stage) {
		stage.setTitle("Text File Dumper");
		
		VBox vb = new VBox();
		Scene scene = new Scene(vb, 300, 300);
		stage.setTitle("File Chooser Sample");

		TextArea atext = new TextArea();
		MenuBar menuBar = setUpMenuBar(stage, atext);

		vb.getChildren().add(menuBar);
		vb.getChildren().add(atext);


		stage.setScene(scene);
		stage.setX(7400);  // start location on desktop. *** make sure to change or disable
		stage.setY(100);   // start location on desktop. *** make sure to change or disable
		stage.show();
	}

	// ################################################################################
	
	// --------------------------------------------------------------------------------
	
	private MenuBar setUpMenuBar(Stage stage, TextArea atext) {
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = setUpFileMenu(stage, atext);
		Menu helpMenu = setUpHelpMenu(stage);
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(helpMenu);
		return menuBar;
	}
	
	private Menu setUpFileMenu(Stage stage, TextArea atext) {
		Menu fileMenu = new Menu("File");
		
		MenuItem openItem = new MenuItem("Open");
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				FileChooser fileChooser = new FileChooser();
				
				File file = fileChooser.showOpenDialog(stage);
				
				if (file != null) {
					atext.setText(getFileContents(file));
				}
			}
		});
		
		MenuItem saveItem = new MenuItem("Save");
		saveItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				FileChooser fileChooser = new FileChooser();
				
				File file = fileChooser.showSaveDialog(stage);
				if (file != null) {	
					try {
						PrintWriter prtout = new PrintWriter(file);
						String outText = atext.getText();
						prtout.println(outText);
						prtout.flush();

						prtout.close();

					} catch (IOException e) {
						// if something breaks catch and print out what went wrong
						System.err.println(e);
					}	
				}
			}
		});
			
		openItem.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
		fileMenu.getItems().add(openItem);
		
		fileMenu.getItems().add(saveItem);

		MenuItem quitItem = new MenuItem("Quit");
		quitItem.setOnAction(e -> {
			System.exit(0);
		});

		quitItem.setAccelerator(new KeyCodeCombination(KeyCode.Q,
				KeyCombination.CONTROL_DOWN));

		fileMenu.getItems().add(quitItem);
		return fileMenu;
	}

	private Menu setUpHelpMenu(Stage stage) {
		Menu helpMenu = new Menu("Help");
		MenuItem aboutItem = new MenuItem("About");
		MenuItem thanksItem = new MenuItem("Thanks");
		
		aboutItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Popup popup = new Popup();
				// popup.setX(100);
				VBox v = new VBox();
				v.getStyleClass().add("about");
				Text t = new Text("Copyright 2014 by John Hurley");
				t.getStyleClass().add("text");
				Button okButton = new Button("OK");
				v.getChildren().addAll(t, okButton);
				okButton.setOnAction(e -> {
					popup.hide();
				});

				popup.getContent().addAll(v);
				popup.show(stage);
			}
		});
		
		thanksItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Popup popup = new Popup();
				// popup.setX(100);
				VBox v = new VBox();
				v.setMinSize(200, 100);
				v.setAlignment(Pos.CENTER);
				
				v.setStyle("-fx-background-color: BLUE;");
				
				v.getStyleClass().add("about");
				Text t = new Text("thank you to John Hurley");
				t.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
				//t.setStyle("-fx-text-fill: white;");
				t.setFill(Color.WHITE);
				t.getStyleClass().add("text");
				Button okButton = new Button("OK");
				//okButton.setAlignment(Pos.CENTER);
				v.getChildren().addAll(t, okButton);
				okButton.setOnAction(e -> {
					popup.hide();
				});

				popup.getContent().addAll(v);
				popup.show(stage);
			}
		});

		aboutItem.setAccelerator(new KeyCodeCombination(KeyCode.A,
				KeyCombination.CONTROL_DOWN));
		helpMenu.getItems().add(aboutItem);
		helpMenu.getItems().add(thanksItem);
		return helpMenu;
	}

// ###############################################################################
		
	private String getFileContents(File file) {
		StringBuilder sb = new StringBuilder();
		try {
			Scanner reader;
			reader = new Scanner(file);
			// ... Loop as long as there are input lines.
			String line = null;
			while (reader.hasNextLine()) {
				if(!(sb.length()==0)) sb.append("\n");
				line = reader.nextLine();
				sb.append(line);
				
			}
			reader.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return sb.toString();
	}
	
	// ------------------------------------------------
	public static void main(String[] args) {
		System.out.println("Enetered the main() method");
		Application.launch(args);
		System.out.println("Leaving the main() method");
	}
}

// thank you to John Hurly for use of this code
