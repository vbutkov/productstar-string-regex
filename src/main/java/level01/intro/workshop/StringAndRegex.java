package level01.intro.workshop;


public class StringAndRegex {

    public static void main(String[] args) {
        checkRegex2();
        checkPassword();
    }

    private static void checkPassword() {
        String regex = "[[a-zA-Z]+[0-9A-Z]+]+[A-Z]";
        String password = "qwerty0";
        boolean res = password.matches(regex);
        print("checkPassword", res);
    }

    private static void print(String methodName, boolean res) {
        System.out.print(methodName + ": ");
        System.out.println(res);
    }

    private static void checkRegex2() {
        boolean res = "ProdS".matches("[^a-z]");
        print("checkRegex2", res);
    }
}
