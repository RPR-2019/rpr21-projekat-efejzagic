package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ListView lvStudenti;
    public TextField fldIme;
    public TextField fldPrezime;
    public TextField fldMail;
    public TextField fldUsername;
    public PasswordField fldPassword;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void actionKraj(ActionEvent actionEvent) {
        Stage stage = (Stage)fldIme.getScene().getWindow();
        stage.close();
    }
}
