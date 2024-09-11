public class Emails {
    public static boolean isEmailGmail(String email) {
        return email.endsWith("@gmail.com");
    }

    public static boolean isEmailDomain(String email, String domain) {
        return email.endsWith(domain);
    }
}