
import javafx.scene.control.TextField;
/**
 * Clase isString, permite validar que el parametro deseado sea una cadena de texto
 */
 
public class isString extends Persona{    
    static Persona c = new Persona(); //Se llama a la clase persona para agregar información despues de la validación 
    
    /**
     * @param input es el valor que se desea evaluar de una cadena de texto
     * @param message permite personalizar el mensaje a la hora de detectar la validación
     */
    //Validaciones
    public static void isString(TextField input, String message){
        
        String name = (input.getText());
        if (!name.matches("[a-zA-Z]*")){
            AlertaEdad.display("Error Nombre", "El nombre debe ser una cadena de texto (Reinicie la aplicación)");
          
        }else{
            c.miLista.add(input.getText());
        }
        
    } 
    
}
