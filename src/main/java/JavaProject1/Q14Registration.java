package JavaProject1;

public class Q14Registration {
    private String email;
    private String userName;
    private String password;
    public void setEmail(String email) {
        if (email.toLowerCase().endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully");
    } else {
            System.out.println("Invalid email. Please provide a Yahoo email.");
        }
    }
    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully");
        } else {
            System.out.println("Invalid username. Username should be of length larger than 6 characters.");        }    }    public void setPassword(String password) {        if (password.length() > 6 && !password.contains(userName)) {            this.password = password;            System.out.println("Password set successfully");        } else {            System.out.println("Invalid password. Password should be of length larger than 6 characters and cannot contain the username.");
    }
    }
}

