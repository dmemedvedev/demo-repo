public class Main {
    public static void main(String[] args) {
        String email;
        int i;
        for (i = 1; i <= 10; i++) {
            email = Utils.generateEmail();
            if (Emails.isEmailDomain(email,"yahoo.com")) {
                System.out.println(email);
            }
        }
    }
}
