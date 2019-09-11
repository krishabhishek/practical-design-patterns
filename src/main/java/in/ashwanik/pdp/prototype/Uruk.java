package in.ashwanik.pdp.prototype;

import java.io.Serializable;
import java.util.List;

public class Uruk extends Enemy implements Serializable {
    public static final String URUK = "Uruk";
    private static final long serialVersionUID = 425121681855996235L;


    public Uruk(String name, String description, int health, List<Weapon> weapons) {
        super(name, description, health, weapons);
    }

    public Uruk(Uruk uruk) {
        super(uruk);
    }

    @Override
    public Enemy newInstance() {
        return new Uruk(this);
    }

}