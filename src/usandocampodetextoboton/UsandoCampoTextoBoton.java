package usandocampodetextoboton;

import campotextoboton.CampoTextoBoton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class UsandoCampoTextoBoton extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Creamos una clase VBox que va a contener dos campoTextoBoton
        VBox vbox = new VBox();
        
        //Creamos una instancia de la clase campoTextoBoton (creada por nosotros)y la añadimos al vbox
        CampoTextoBoton campoTextoBoton1 = new CampoTextoBoton();
        campoTextoBoton1.setText("Hello!");
        vbox.getChildren().add(campoTextoBoton1);
        
        //Creamos una instancia de la clase campoTextoBoton (creada por nosotros) y la añadimos al vbox
        CampoTextoBoton campoTextoBoton2 = new CampoTextoBoton();
        campoTextoBoton2.setText("World!");
        vbox.getChildren().add(campoTextoBoton2);
        
        //Añadimos la escena que contien el vbox a la stage
        primaryStage.setScene(new Scene(vbox));
        //Damos titulo a la stage
        primaryStage.setTitle("CampoTexto-Boton");
        //Damos ancho y altura a la stage
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        //Mostramos la stage
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
