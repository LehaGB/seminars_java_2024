package client.imple;

import client.Animal;
import client.Owner;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Cat extends Animal {

    public boolean isHome;

    public Cat(int id, String name, LocalDate birthdate, Owner owner) {
        super(id, name, birthdate, owner);
        this.isHome = true;
    }
    public Cat(int id, String name, LocalDate birthdate, Owner owner, boolean isHome) {
        super(id, name, birthdate, owner);
        this.isHome = isHome;
    }
    public Integer getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public static void meow(){
        System.out.println("Мяу");
    }
}
