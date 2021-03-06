package in.ashwanik.pdp.creational.prototype;

import lombok.Getter;

import java.util.List;

@Getter
abstract class Enemy extends Character {
    private int experience;

    Enemy(String name,
          String description,
          int health,
          List<Weapon> weapons) {
        super(name, description, health, weapons);
        experience = health;
    }

    Enemy(Enemy enemy) {
        super(enemy.getName(), enemy.getDescription(), enemy.getHealth(), enemy.getWeapons());
        experience = enemy.experience;
    }

    abstract Enemy newInstance();

    @Override
    void changeHealth(int delta) {

    }

}
