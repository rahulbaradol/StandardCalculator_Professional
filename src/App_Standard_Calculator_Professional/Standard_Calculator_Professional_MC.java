package App_Standard_Calculator_Professional;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.io.IOException;

public class Standard_Calculator_Professional_MC extends Application {

    @Override
    public void start(Stage ps) {
        try {
            Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_Standard_Calculator_Professional/FXML_Files/Welcome.fxml")));

            ps.setTitle("Standard Calculator Professional - Welcome");
            ps.setScene(sc);
            ps.setResizable(false);
            ps.show();
        } catch (IOException e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator Professional - Welcome");
            error.setContentText("Error loading the file. \nCould not find the file.");
            error.show();
        }
    }

    @Override
    public void stop() throws Exception {
        Alert exited = new Alert(Alert.AlertType.INFORMATION);

        exited.setTitle("Standard Calculator Professional");
        exited.setHeaderText("Talk");
        exited.setContentText("THANKS for using Standard Calculator Professional. \nHave a nice day. See you soon.");
        exited.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

}