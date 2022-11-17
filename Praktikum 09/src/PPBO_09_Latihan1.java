// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

// ==> Definisikan setiap class sesuai urutan di bawah ini

// IInfusable
@SuppressWarnings("unused")
interface IInfusable {
    void infuse (String element); // Semua method di interface secara implisit adalah public abstract
}

// Item
abstract class Item {
    String name;
}

// Weapon
@SuppressWarnings("unused")
abstract class Weapon extends Item {
    public int damage;

    public void normalAttack() {
        System.out.println("Player deals " + damage + " damage using " + name);
    }
    public abstract void specialMove();
}

// Sword
class Sword extends Weapon implements IInfusable {
    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    @Override
    public void specialMove() {
        System.out.println("Player performs a Forward Thrust with their Sword!");
    }
    @Override
    public void infuse (String element) {
        System.out.println(name + " is infused with " + element + ", enhancing its thrust!");
    }
}

// Axe
class Axe extends Weapon implements IInfusable {
    public Axe (String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    @Override
    public void specialMove() {
        System.out.println("Player performs a Jump Charge with their Axe!");
    }
    @Override
    public void infuse (String element) {
        System.out.println(name + " is infused with " + element + ", enhancing its power!");
    }
}

// Bow
class Bow extends Weapon {
    public Bow (String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    @Override
    public void specialMove() {
        System.out.println("Player is now in Focus state!");
    }
    public void reload() {
        System.out.println("Player reload the bow");
    }
}

// Consumable
class Consumable extends Item {
    public int recoveredHealthPoint;
    public Consumable (String name, int recoveredHealthPoint) {
        this.name = name;
        this.recoveredHealthPoint = recoveredHealthPoint;
    }
    public void consume() {
        System.out.println("Player consumes " + name + " and restored " + recoveredHealthPoint + " HealthPoint");
    }
}

// !! Tidak perlu memodifikasi code di bawah ini !!
public class PPBO_09_Latihan1 {
    public static void main(String[] args) {
        var inventory = generateInventory();

        inventory.forEach((key, value)->{
            if(Objects.equals(key, "Weapons")){
                value.forEach((item)->{
                    System.out.println(">>>>>>>>>>");

                    Weapon weapon = (Weapon) item;
                    weapon.normalAttack();
                    if(weapon instanceof Sword sword){
                        sword.specialMove();
                        sword.infuse("Crystal");
                    }
                    else if(weapon instanceof Axe axe){
                        axe.specialMove();
                        axe.infuse("Ember");
                    }
                    else if(weapon instanceof Bow bow){
                        bow.specialMove();
                        bow.reload();
                    }
                    
                    System.out.println("<<<<<<<<<<");
                });
            }
            else if(Objects.equals(key, "Consumables")){
                value.forEach((item)->{
                    System.out.println(">>>>>>>>>>");

                    Consumable consumable = (Consumable) item;
                    consumable.consume();

                    System.out.println("<<<<<<<<<<");
                });
            }
        });
    }


    static HashMap<String, ArrayList<Item>> generateInventory(){
        ArrayList<Item> weapons = new ArrayList<>();
        weapons.add(new Sword("Lothric Knight Sword", 100));
        weapons.add(new Axe("Dragon King Greataxe", 150));
        weapons.add(new Bow("Darkmoon Longbow", 80));

        ArrayList<Item> consumables = new ArrayList<>();
        consumables.add(new Consumable("Sweet Madame", 50));
        consumables.add(new Consumable("Teyvat Egg", 15));

        HashMap<String, ArrayList<Item>> inventory = new HashMap<>();
        inventory.put("Weapons", weapons);
        inventory.put("Consumables", consumables);

        return inventory;
    }
}

/*
Output yang diharapkan:

>>>>>>>>>>
Player consumes Sweet Madame and restored 50 HealthPoint
<<<<<<<<<<
>>>>>>>>>>
Player consumes Teyvat Egg and restored 15 HealthPoint
<<<<<<<<<<
>>>>>>>>>>
Player deals 100 damage using Lothric Knight Sword
Player performs a Forward Thrust with their Sword!
Lothric Knight Sword is infused with Crystal, enhancing its thrust!
<<<<<<<<<<
>>>>>>>>>>
Player deals 150 damage using Dragon King Greataxe
Player performs a Jump Charge with their Axe!
Dragon King Greataxe is infused with Ember, enhancing its power!
<<<<<<<<<<
>>>>>>>>>>
Player deals 80 damage using Darkmoon Longbow
Player is now in Focus state!
Player reloads the bow
<<<<<<<<<<
*/