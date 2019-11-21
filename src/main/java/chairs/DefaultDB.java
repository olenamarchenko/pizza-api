package chairs;

public class DefaultDB implements Database {

    public DefaultDB() {
        System.out.println("this is real DB");
    }

    @Override
    public boolean saveChair(int id) {
        if (id == 0) {
            System.out.println("chair is NOT saved! (c)DefaultDB class");
            return false;
        } else {
            System.out.println("chair is saved! (c)DefaultDB class");

            return true;
        }
    }

    @Override
    public boolean updateChair(int id) {
        if (id == 0) {
            System.out.println("chair is NOT updated! Sincerely, DefaultDB class");
            return false;
        } else {
            System.out.println("chair is saved! (c)DefaultDB class");
            return true;
        }
    }
}
