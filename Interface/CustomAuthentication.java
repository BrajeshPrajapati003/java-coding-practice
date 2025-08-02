interface Authenticator{
    boolean authenticate(String usrname, String passwd);
}

public class CustomAuthentication {
    public static void main(String[] args) {
        Authenticator authenticator = (usrname, passwd) -> {
            // Simulate authentication logic
            return usrname.equals("Admin") && passwd.equals("Admin123");
        };

        String usrname = "Admin";
        String passwd = "Admin123";

        boolean isAuthenticated = authenticator.authenticate(usrname, passwd);
        System.out.println("Is user Authenticated?: " + isAuthenticated);
    }
}
