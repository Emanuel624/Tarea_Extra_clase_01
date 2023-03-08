
import javafx.scene.control.TextField;
/**
 * Clase isVacio, permite validar que el parametro esta vacio
 */

public class isVacio {
    /**
     * @param input es el valor que se desea evaluarpara conocer si esta vacio o no
     * @param message permite personalizar el mensaje a la hora de detectar la validación
     */
    public static void isVacio(TextField input, String message){
        String vacio = (input.getText());
        if (vacio.isEmpty()){
            AlertaEdad.display("Error Formato", "Todos los espacios deben rellenarse");   
        }    
    }
}

