public class TestEmail {
    private static ValiateEmail testEmail;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        testEmail = new ValiateEmail();
        for (String email : validEmail) {
            boolean isvalid = testEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = testEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
