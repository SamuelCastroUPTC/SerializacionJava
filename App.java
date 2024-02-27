
import co.edu.uptc.servicesfiles.ProcessesFiles;
import models.Phone;

public class App {
    public static void main(String[] args)  {
        ProcessesFiles processesFiles= new ProcessesFiles();
        Phone phone=new Phone();
        phone.setMemoria(21);
        phone.setPrecio(12000);
        try {
            processesFiles.serializar("serializar.txt", phone);
            System.out.println("Deserializado: "+processesFiles.deserializar("serializar.txt"));
        } catch (Exception e) {
            
        }
    }
}
