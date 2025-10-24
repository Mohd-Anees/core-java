package simplyLearns.projects.atm;

public class ATM extends OptionMenu {
    public static void main(String[] args) {
        OptionMenu optionMenu = new OptionMenu();
        try {
            optionMenu.getLogin();
        } catch (Exception e) {
            System.out.println("An error occurred during login.");
        }
    }
}
