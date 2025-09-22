public class RegExpTest {
    public static void main(String[] args) {
        String password = "p@s#w^o!r&d";
       
        String regex = "[!@#$%^&*()A-Za-z0-9]";

        String concealPassword = password.replaceAll(regex, "*");
        System.out.println("Original Password: " + password);
        System.out.println("Concealed Password: " + concealPassword);
    }
    

}
