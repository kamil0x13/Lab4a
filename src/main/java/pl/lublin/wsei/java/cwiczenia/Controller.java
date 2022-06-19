package pl.lublin.wsei.java.cwiczenia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    FileChooser fileChooser = new FileChooser();
    FileChooser.ExtensionFilter xmlFilter = new FileChooser.ExtensionFilter("Pliki XML (*.xml)","*.xml");

    @FXML
    private Label lbFile;

    @FXML
    public void initialize(){
        fileChooser.getExtensionFilters().add(xmlFilter);
    }

    @FXML
    public void btnOpenFileAction(ActionEvent event) {
        File file = fileChooser.showOpenDialog(null);
        if (file!= null) {
            lbFile.setText(file.getAbsolutePath());
        }
        else {
            lbFile.setText("Proszę wczytać plik ...");

        }
    }
}