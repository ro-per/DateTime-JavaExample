import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class DatePickerTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        DatePicker datePicker = new DatePicker();
        datePicker.setOnAction(event -> {
            LocalDate localDate = datePicker.getValue();
            System.out.println("Selected date: "+localDate);
        });

        StackPane root = new StackPane();
        root.getChildren().add(datePicker);
        Scene scene = new Scene(root, 300,300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
