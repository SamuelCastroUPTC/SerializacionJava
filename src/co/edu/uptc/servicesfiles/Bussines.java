package co.edu.uptc.servicesfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.Bussnes;
import models.City;
import models.Person;

public class Bussines {
    public List<Person> createPerson(){
        List<Person> list = new ArrayList<Person>();
        Person person= new Person();
        person.setAge(21);
        person.setLastName("Castro");
        person.setName("Samuel");
        list.add(person);

        person= new Person();
        person.setAge(21);
        person.setLastName("Polania");
        person.setName("Sebastian");
        list.add(person);
        return list;
    }

    public List<City> createCity(){
        List<City> list = new ArrayList<City>();
        City city= new City();
        city.setName("Cartagena");
        city.setPoblation(21552);
        list.add(city);
        city= new City();
        city.setName("Mongolia");
        city.setPoblation(21552);
        list.add(city);
        return list;
    }

    public void saveData() throws IOException{
        Bussnes bussnes= new Bussnes();
        bussnes.cities=createCity();
        bussnes.list=createPerson();

        FileSerialize fileSerialize= new FileSerialize();
        fileSerialize.serialize(bussnes);
    }
}
