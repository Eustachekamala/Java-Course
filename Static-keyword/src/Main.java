//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * static = Makes a variable or method belong to the class rather than
        * to any specific object. Commonly used for methods or shared resources
        * */
    Friend friend1 = new Friend("Spongebob");
    Friend friend2 = new Friend("Patrick");
    Friend friend3 = new Friend("Patrick");

    Friend.showFriends();
    }
}