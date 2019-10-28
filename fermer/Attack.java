package fermer;

public interface Attack implements {
    void attack(HomeAnimal enemy);
    default void escapeBattle(){
        System.out.println("Домашнее животное убежало");
    }
}
