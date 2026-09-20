import model.Shelter;
import view.ShelterView;
import controller.ShelterController;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el Modelo
        Shelter shelterModel = new Shelter();
        
        // 2. Instanciamos la Vista
        ShelterView shelterView = new ShelterView();
        
        // 3. Instanciamos el Controlador inyectándole ambos
        ShelterController controller = new ShelterController(shelterModel, shelterView);
        
        // 4. Arrancamos la aplicación
        controller.init();
    }
}