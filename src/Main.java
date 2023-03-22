/**
 * @author Emanuel Chavarría Hernández 2022205841
 * @version 1.0
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Esta clase representa el main del programa, en ella se ejecuta 
 * el programa para sumar edades de personas creadas, por medio de JavaFx
 */
public class Main extends Application {
    Button buttonMasPersonas;
    Button buttonMas;
    Button buttonMenos;
    Button buttonPor;
    Button buttonDiv;
    
    /**
    * Este metodo le da inicio al program en su totailidad 
    * @param args son los argumentos necesarios para la ejecución del programa
    * no son utilizados explicitamente
    */
    
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * 
     * @param primaryStage es la interfaz principal del programa
     * @throws Exception si ocurre un erro al generar la interfaz del programa
     */
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Persona c = new Persona();  //Trabajo entre clases y archivos
        primaryStage.setTitle("Tarea ExtraClase 1"); //Nombre del ventana emergente
        
        
        //Método utilizado para acomodar los objetos en la venta.
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(20);
        grid.setHgap(20);
        
        
        //Label Resultado
        Label ResultadoLabel = new Label("Resultado:");
        GridPane.setConstraints(ResultadoLabel, 0, 0);
        
        //Label Agregar pesonas
        Label AgregarLabel = new Label("Agregar Persona");
        GridPane.setConstraints(AgregarLabel, 0, 3);

        //Label "Nombre"
        Label NombreLabel = new Label("Nombre:");
        GridPane.setConstraints(NombreLabel, 0, 4);
        
        //Label "Provincia"
        Label ProvinciaLabel = new Label("Provincia:");
        GridPane.setConstraints(ProvinciaLabel, 0, 5);
        
        //Label "Edad"
        Label EdadLabel = new Label("Edad:");
        GridPane.setConstraints(EdadLabel, 0, 6);   
        
        //Label Persona 1
        Label Peronsa1Label = new Label("Persona 1:");
        GridPane.setConstraints(Peronsa1Label, 6, 4);

        //Label Operaciones
        Label OperacionesLabel = new Label("Operaciones");
        GridPane.setConstraints(OperacionesLabel, 6, 3);
        
        //Label Persona 1
        Label Peronsa2Label = new Label("Persona 2:");
        GridPane.setConstraints(Peronsa2Label, 6, 6);
        
        
        //Cuadro Texto de "Resultado"
        TextField ResultadoInput = new TextField();
        ResultadoInput.setPromptText("Resultado");
        GridPane.setConstraints(ResultadoInput, 1, 0);
        
        //Cuadro de texto "Nombre"
        TextField nameInput = new TextField();
        nameInput.setPromptText("Escriba su nombre");
        GridPane.setConstraints(nameInput, 1, 4);  
   
        //Cuadro de texto "Edad"
        TextField EdadInput = new TextField(); 
        EdadInput.setPromptText("Escriba su edad");
        GridPane.setConstraints(EdadInput, 1, 6);  
       
        
        //DropDown ProvinciasBox
        ChoiceBox<String> ProvinciasBox = new ChoiceBox <>();
        //Elementos ProvinciasBox como tal
        ProvinciasBox.getItems().add("Cartago");
        ProvinciasBox.getItems().add("San José");
        ProvinciasBox.getItems().add("Heredia");
        ProvinciasBox.getItems().add("Alajuela");
        ProvinciasBox.getItems().add("Puntarenas");
        ProvinciasBox.getItems().add("Guanacaste");
        ProvinciasBox.getItems().add("Limón");
        GridPane.setConstraints(ProvinciasBox, 1, 5);
        
        //DropDown Persona1Box
        ChoiceBox<String> Persona1Box = new ChoiceBox <>();
        GridPane.setConstraints(Persona1Box, 6, 5); 
        
        //DropDown Persona1
        ChoiceBox<String> Persona2Box = new ChoiceBox <>();      
        GridPane.setConstraints(Persona2Box, 6, 7); 
        
        
        //Boton "+ personas" así como los métodos asociados a su funcionamiento y nuevas clases llamadas
        buttonMasPersonas = new Button();
        buttonMasPersonas.setText("+ Persona");
        buttonMasPersonas.setOnAction(events -> {
                isInt.isInt(EdadInput, EdadInput.getText());
                isString.isString(nameInput, nameInput.getText());
                isVacio.isVacio(nameInput, nameInput.getText());
                isVacio.isVacio(EdadInput, EdadInput.getText());
                if(ProvinciasBox.getValue()==null){
                    AlertaEdad.display("Error DropDownList", "Debe escoger una provincia (Reinicie la aplicación)");
                    }
                c.miLista.add(nameInput.getText()); 
                if(c.miLista.get(0).matches("[1-9]*")){
                    c.miLista.remove(0);
                    
                }else{
                    c.miListaNombre.add(c.miLista.get(0));
                    c.miLista.remove(0);
                }
                
                c.miListaProvicional.add(EdadInput.getText()); 
                if(c.miListaProvicional.get(0).matches("[a-zA-Z]*")){
                    c.miListaProvicional.remove(0);
                    
                }else{
                    c.miListaEdad.add(c.miListaProvicional.get(0));
                    c.miListaProvicional.remove(0);
                }
                
                int cantidad = c.miListaNombre.size();
                if(cantidad == 1){ 
                    if(ProvinciasBox.getValue()==null){
                        AlertaEdad.display("Error DropDownList", "Debe escoger una provincia (Reinicie la aplicación)");
                    }    
                    PersonaCreada.display("Persona Creada", "Persona creada con éxito, puedes crear tres más");
                    Persona1Box.getItems().add(c.miListaNombre.get(0));
                    Persona2Box.getItems().add(c.miListaNombre.get(0));
                }
                
                if(cantidad == 2){
                    PersonaCreada.display("Persona Creada", "Persona creada con éxito, puedes crear dos más");
                    Persona1Box.getItems().add(c.miListaNombre.get(1));
                    Persona2Box.getItems().add(c.miListaNombre.get(1));
                }
                
                if(cantidad == 3){
                    PersonaCreada.display("Persona Creada", "Persona creada con éxito, puedes crear una más");
                    Persona1Box.getItems().add(c.miListaNombre.get(2));
                    Persona2Box.getItems().add(c.miListaNombre.get(2));
                }
                
                if(cantidad == 4){
                    PersonaCreada.display("Maximo de personas", "Maximo de personas creadas (utiliza las que ya creaste)");
                    Persona1Box.getItems().add(c.miListaNombre.get(3));
                    Persona2Box.getItems().add(c.miListaNombre.get(3));
                }
                
                if(cantidad > 4){
                    PersonaCreada.display("Maximo de personas", "Maximo de personas creadas (utiliza las que ya creaste)");
                }
                
                nameInput.setText("");
                EdadInput.setText("");
                ProvinciasBox.setValue(null);       
        });
        GridPane.setConstraints(buttonMasPersonas, 1, 8);
        //xd
                    
        //Boton "buttonMas" así como los métodos asociados a su funcionamiento y nuevas clases llamadas
        Suma miSuma = new Suma(); //Cambio necesario para poder utilizar metodos en estados no estaticos
        buttonMas = new Button();
        buttonMas.setText("+");
        GridPane.setConstraints(buttonMas, 5, 8);
        buttonMas.setOnAction(e-> {
            int posicionLista1 = Persona1Box.getSelectionModel().getSelectedIndex();
            int posicionLista2 = Persona2Box.getSelectionModel().getSelectedIndex();
            
            int cantidad = c.miListaNombre.size();
            if(cantidad == 2){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miSuma.sumarOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 3){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miSuma.sumarOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 4){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miSuma.sumarOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }

        });
                
            
        //Boton "buttonMenos" así como los métodos asociados a su funcionamiento y nuevas clases llamadas
        Resta miResta = new Resta(); //Cambio necesario para poder utilizar metodos en estados no estaticos
        buttonMenos = new Button();
        buttonMenos.setText("-");
        GridPane.setConstraints(buttonMenos, 6, 8);
        buttonMenos.setOnAction(e->{
            int posicionLista1 = Persona1Box.getSelectionModel().getSelectedIndex();
            int posicionLista2 = Persona2Box.getSelectionModel().getSelectedIndex();
           
            int cantidad = c.miListaNombre.size();
            if(cantidad == 2){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miResta.RestaOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 3){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miResta.RestaOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 4){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miResta.RestaOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }

        });
          

        //Boton "buttonPor" así como los métodos asociados a su funcionamiento y nuevas clases llamadas
        Multiplicacion miMult = new Multiplicacion(); //Cambio necesario para poder utilizar metodos en estados no estaticos
        buttonPor = new Button();
        buttonPor.setText("*");
        GridPane.setConstraints(buttonPor, 7, 8);
        buttonPor.setOnAction(e->{
            int posicionLista1 = Persona1Box.getSelectionModel().getSelectedIndex();
            int posicionLista2 = Persona2Box.getSelectionModel().getSelectedIndex();
            
            int cantidad = c.miListaNombre.size();
            if(cantidad == 2){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miMult.MultOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 3){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miMult.MultOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 4){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miMult.MultOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
        });        
        
        
        //Boton "buttonDiv" así como los métodos asociados a su funcionamiento y nuevas clases llamadas
        Division miDiv = new Division(); //Cambio necesario para poder utilizar metodos en estados no estaticos
        buttonDiv = new Button();
        buttonDiv.setText("/");
        GridPane.setConstraints(buttonDiv, 8, 8);
        buttonDiv.setOnAction(e->{
            int posicionLista1 = Persona1Box.getSelectionModel().getSelectedIndex();
            int posicionLista2 = Persona2Box.getSelectionModel().getSelectedIndex();
            
            int cantidad = c.miListaNombre.size();
            if(cantidad == 2){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miDiv.DivOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 3){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miDiv.DivOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
            if(cantidad == 4){
                int edad1 = Integer.parseInt(c.miListaEdad.get(posicionLista1));
                int edad2 = Integer.parseInt(c.miListaEdad.get(posicionLista2));
                int valor = miDiv.DivOperacion(edad1, edad2);
                String resultadoS = String.valueOf(valor);
                ResultadoInput.setText(resultadoS); 
            }
        }); 
        
        //Método para colocar los elementos creados denttro del GUI
        grid.getChildren().addAll(ResultadoLabel,AgregarLabel, ResultadoInput,nameInput,buttonMasPersonas, NombreLabel, ProvinciaLabel, EdadLabel, EdadInput, OperacionesLabel, Peronsa1Label, Peronsa2Label, buttonMas, buttonMenos, buttonPor, buttonDiv, ProvinciasBox, Persona1Box, Persona2Box);
        
        Scene scene = new Scene(grid, 600, 500);
        primaryStage.setScene(scene);
        //Se muestra la interaz
        primaryStage.show();
    }
}