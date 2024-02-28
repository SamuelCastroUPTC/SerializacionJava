package co.edu.uptc.servicesfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import models.Bussnes;
import models.Person;

public class FileSerialize {
    
    public void serialize(Bussnes bussnes) throws IOException{
        
        String filename="serialized.txt";
        FileOutputStream file;
        try {
            file= new FileOutputStream(filename);
            ObjectOutputStream out= new ObjectOutputStream(file);
            out.writeObject(bussnes);
            out.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserializar(){
        Bussnes bussnes= null;
        String filename="serialized.txt";
        FileInputStream file;
        try {
            file= new FileInputStream(filename);
            ObjectInputStream in= new ObjectInputStream(file);
            bussnes=(Bussnes)in.readObject();
            in.close();
            file.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }
}
