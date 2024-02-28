package co.edu.uptc.servicesfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProcessesFiles {

    public void serializar(String path, Object object) throws FileNotFoundException, IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }
    public Object deserializar(String path) throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }

    public void test() throws IOException{
        Bussines bussines= new Bussines();
        bussines.saveData();
    }



}
