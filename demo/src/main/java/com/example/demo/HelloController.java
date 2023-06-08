package com.example.demo;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    @FXML
    private TableView table;


    @FXML
    private TableColumn recette;

    @FXML
    private TableColumn prix;

    @FXML
    private TableColumn ing;


    @FXML
    private TextField input_pizza;


    @FXML
    private TextField input_prix;


    @FXML
    private TextField input_ing;

    @FXML
    private Button btn_vider;
    @FXML
    private Button btn_ajouter;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        recette.setCellValueFactory(new PropertyValueFactory<Piza, String>("nom"));
        prix.setCellValueFactory(new PropertyValueFactory<Piza, Float>("prix"));
        ing.setCellValueFactory(new PropertyValueFactory<Piza, Integer>("nb_ing"));
        final PizaDAO pizaDAO = new PizaDAO();
//         // inisialiser les piza de la base de donne
//        final List<Piza> lespiza;
//        lespiza = pizaDAO.getPizas();
//        for (Piza  lespiza: spiza){
//            this.ajouterPizaDansTable(piza.setNom(nom),piza.setNb_ing(nb_ing),piza.setPrix(prix)
//            );
//
        }

    }

    public void ajouterPizaDansTable(String nom, Float prix, Integer nb_ing ) {


        Piza piza = new Piza(nom,prix,nb_ing);
//        piza.setNom(nom);
//        piza.setNb_ing(nb_ing);
//        piza.setPrix(prix);


        ObservableList<Piza> pizas = table.getItems();
        pizas.add(piza);
        int nbPiza = pizas.toArray().length + 1;
        table.setItems(pizas);
        final PizaDAO pizaDAO = new PizaDAO();
        pizaDAO.ajouterPizza(piza);
    }
    @FXML
    private void ajouterPiza() {

        String nom = input_pizza.getText();
        Float prix =Float.valueOf( input_prix.getText());
        String ing = input_ing.getText();
        ajouterPizaDansTable(nom, prix, Integer.valueOf(ing) );
    }


    public void viderTable() {
        table.getItems().clear();
        final PizaDAO pizaDAO = new PizaDAO();
        pizaDAO.supprimerPizzaDonnee();

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}