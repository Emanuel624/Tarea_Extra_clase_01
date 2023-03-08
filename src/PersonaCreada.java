
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Clase PersonaCreada, genera una venta de alerta para el usuario, denotando 
 * que la "persona" ha sido creada satisfactoriamente
 */
public class PersonaCreada {
     /**
     * @param title permite poner el nombre deseado a la ventana de creación
     * @param message permite personalizar el mensaje que aparece en la venta de creación
     */
    public static void display(String title, String message){
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(280);
        
        Label label = new Label();
        label.setText(message);
        label.setTextFill(Color.GREEN);
        Button closeButton = new Button("Regresar");
        closeButton.setOnAction(e->window.close());
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}  

