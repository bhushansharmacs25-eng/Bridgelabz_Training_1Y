package Inheritance_Problems;

interface Worker {
    void performDuties();
}

class RestaurantPerson {
    String name;
    int id;

    public RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends RestaurantPerson implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " (ID: " + id + ") is cooking food.");
    }
}

class Waiter extends RestaurantPerson implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " (ID: " + id + ") is serving food.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 1);
        Worker waiter = new Waiter("James", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
