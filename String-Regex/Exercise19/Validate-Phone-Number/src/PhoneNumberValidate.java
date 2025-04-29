public class PhoneNumberValidate {
    public static boolean isValidPhoneNumber(String phoneNumber) {

        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {

        System.out.println(isValidPhoneNumber("(84)-(0978489648)"));
        System.out.println(isValidPhoneNumber("(a8)-(22222222)"));
        System.out.println(isValidPhoneNumber("(84)-(22b22222)"));
        System.out.println(isValidPhoneNumber("(84)-(9978489648)"));
    }
}
