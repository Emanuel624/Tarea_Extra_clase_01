import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
/**
 * Clase AlertaEdad, genera una venta de alerta para el usuario, denotando diferentes
 * estados de error y de incompatibilidad.
 */

public class AlertaEdad {
    /**
     * @param title permite poner el nombre deseado a la ventana de alerta
     * @param message permite personalizar el mensaje que aparece en la venta de alerta
     */
    public static void display(String title, String message){
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(280);
        
        Label label = new Label();
        label.setText(message);
        label.setTextFill(Color.RED);
        Button closeButton = new Button("Regresar");
        closeButton.setOnAction(e->window.close());
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        //Se muestra la interfaz
        window.showAndWait();
    }
}
