package spder.task;

public class Account {
    private String account;

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
