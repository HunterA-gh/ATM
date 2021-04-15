public class User {
    private String username;
    private String password;
    private Investment investment;
    private Savings savings;
    private Checking checking;


    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }

    public Savings getSavings() {
        return savings;
    }

    public void setSavings(Savings savings) {
        this.savings = savings;
    }

    public Checking getChecking() {
        return checking;
    }

    public void setChecking(Checking checking) {
        this.checking = checking;
    }

}

