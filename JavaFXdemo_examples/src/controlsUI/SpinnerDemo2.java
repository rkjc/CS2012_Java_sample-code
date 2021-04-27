package controlsUI;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 

public class SpinnerDemo2 extends Application {
 
   @Override
   public void start(Stage stage) {
 
       Label label = new Label("Select Month:");
 
       ObservableList<String> months = FXCollections.observableArrayList(//
               "January", "February", "March", "April", //
               "May", "June", "July", "August", //
               "September", "October", "November", "December");
 
       final Spinner<String> spinner = new Spinner<String>();
 
       // Value factory.
       SpinnerValueFactory<String> valueFactory = //
               new SpinnerValueFactory.ListSpinnerValueFactory<String>(months);
      
       // Default value
       valueFactory.setValue("February");
 
       spinner.setValueFactory(valueFactory);
 
       FlowPane root = new FlowPane();
       root.setHgap(10);
       root.setVgap(10);
       root.setPadding(new Insets(10));
 
       root.getChildren().addAll(label, spinner);
 
       Scene scene = new Scene(root, 400, 200);
 
       stage.setTitle("JavaFX Spinner (o7planning.org)");
       stage.setScene(scene);
       stage.show();
   }
 
   public static void main(String[] args) {
       Application.launch(args);
   }
 
}

// thank you -   https://o7planning.org/11185/javafx-spinner 


