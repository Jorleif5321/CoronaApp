package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.CreateUser;
import sample.Patient;

import java.io.IOException;

public class guiHealthProfPatientDataController {
    public Button createPatient;


    public TextField cprFieldAddPatientField;
    public TextField nameAddPatientField;
    public TextField birthdateAddPatientField;
    public TextField tNumberAddPatientField;
    public TextField streetNameAddPatientField;
    public TextField streetNumberAddPatientField;
    public TextField zipCodeAddPatientField;

    public TextField resultTestDataField;
    public TextField testDateTestDataField;
    public TextField patientCPRTestDataField;
    public TextField mutationTypeTestDataField;
    public TextField idHealthProfTestDataField;

    public TextField zipCodeGeoField;
    public TextField mutationTypeGeoField;
    public TextField cprGeoField;
    public TextField registerDateGeoField;
    public TextField longitudeGeoField;
    public TextField latitudeGeoField;

    public TextField cprSensorField;
    public TextField pullsSensorField;
    public TextField bodyTemperatureSensorField;


    public void registerPatientButton(ActionEvent event) throws IOException {
        CreateUser user = new CreateUser();
        boolean succes = user.createPatient(cprFieldAddPatientField.getText(), nameAddPatientField.getText(), birthdateAddPatientField.getText(), tNumberAddPatientField.getText(), streetNameAddPatientField.getText(), streetNumberAddPatientField.getText(), zipCodeAddPatientField.getText());
        if (!succes) {
            System.out.println("ERROR");
        } else {
            Parent createPatient = FXMLLoader.load(getClass().getResource("guiHealthProfPatientData.fxml"));
            Scene scene1 = new Scene(createPatient);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene1);
            window.show();

        }
    }
    public void registerTestDataButton(ActionEvent event) throws IOException {
        Patient patient = new Patient();
        boolean succes = patient.setTestData(resultTestDataField.getText(), testDateTestDataField.getText(), patientCPRTestDataField.getText(), mutationTypeTestDataField.getText(), idHealthProfTestDataField.getText());
        if (!succes) {
            System.out.println("ERROR");
        } else {
            Parent createPatient = FXMLLoader.load(getClass().getResource("guiHealthProfPatientData.fxml"));
            Scene scene1 = new Scene(createPatient);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene1);
            window.show();

        }
    }
    public void registerGeolocationButton(ActionEvent event) throws IOException {
        CreateUser user = new CreateUser();
        boolean succes = user.createPatient(cprFieldAddPatientField.getText(), nameAddPatientField.getText(), birthdateAddPatientField.getText(), tNumberAddPatientField.getText(), streetNameAddPatientField.getText(), streetNumberAddPatientField.getText(), zipCodeAddPatientField.getText());
        if (!succes) {
            System.out.println("ERROR");
        } else {
            Parent createPatient = FXMLLoader.load(getClass().getResource("guiHealthProfPatientData.fxml"));
            Scene scene1 = new Scene(createPatient);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene1);
            window.show();

        }
    }
    public void registerSensorDataButton(ActionEvent event) throws IOException {
        CreateUser user = new CreateUser();
        boolean succes = user.createPatient(cprFieldAddPatientField.getText(), nameAddPatientField.getText(), birthdateAddPatientField.getText(), tNumberAddPatientField.getText(), streetNameAddPatientField.getText(), streetNumberAddPatientField.getText(), zipCodeAddPatientField.getText());
        if (!succes) {
            System.out.println("ERROR");
        } else {
            Parent createPatient = FXMLLoader.load(getClass().getResource("guiHealthProfPatientData.fxml"));
            Scene scene1 = new Scene(createPatient);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene1);
            window.show();

        }
    }

    public void patientDataButton(ActionEvent event) throws IOException {
        Parent createPatient = FXMLLoader.load(getClass().getResource("guiHealthProfPatientData.fxml"));
        Scene scene1 = new Scene(createPatient);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();

    }

    public void mutationButton(ActionEvent event) throws IOException {
        Parent createPatient = FXMLLoader.load(getClass().getResource("guiHealthProfMutation.fxml"));
        Scene scene1 = new Scene(createPatient);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();

    }

    public void logOffButton (ActionEvent event) throws  IOException{
        Parent createPatient = FXMLLoader.load(getClass().getResource("guiSystemStart.fxml"));
        Scene scene1 = new Scene(createPatient);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();
    }
    public void cancelButton (ActionEvent event) throws  IOException{
        Parent createPatient = FXMLLoader.load(getClass().getResource("guiHealthProfPatientData.fxml"));
        Scene scene1 = new Scene(createPatient);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();
    }
}
