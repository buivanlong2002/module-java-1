public class ClassNameValidate {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {

        System.out.println(isValidClassName("C0223G"));
        System.out.println(isValidClassName("A0323K"));
        System.out.println(isValidClassName("M0318G"));
        System.out.println(isValidClassName("P0323A"));
    }
}
