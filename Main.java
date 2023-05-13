public class Main{
    public static void main(String[] args){
        User user = new User("Роберт");
        user.report();
        user.save();
        Tester tester = new Tester("Test 01");
        tester.report();
        tester.save();
    }
}