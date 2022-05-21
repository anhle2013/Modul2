package regex.email;

public class TestEmail {
    public static final String[] validEmail = new String[] {
            "abc@gmail.com.vn", "ab1.21@yahoo.com", "ab_21c@hotmail.com"
    };
    public static final String[] invalidEmail = new String[] {
            "@gmail.com", "ab@gmail.", "@#abc@gmail.com", "ab..21c@hotmail.com"
    };

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email: validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email: '" + email + "' is valid: " + isValid );
        }

        for (String email: invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email: '" + email + "' is valid: " + isValid );
        }
    }
}
