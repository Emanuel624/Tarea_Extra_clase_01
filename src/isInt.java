
import javafx.scene.control.TextField;
/**
 * Clase isInt, permite validar que el parametro deseado sea un número entero
 * mayor que cero
 */

public class isInt {
    /**
     * @param input es el valor que se desea evaluar de una cadena de texto
     * @param message permite personalizar el mensaje a la hora de detectar la validación
     */
    public static void isInt(TextField input, String message){
        String age = (input.getText());
        if (!age.matches("[1-9]*")){
            AlertaEdad.display("Error Edad", "La edad debe ser un número mayor que cero (Reinicie la aplicación)");
            
        }
        
    }
}
