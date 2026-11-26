
class Bank {
    public long[] acc;

    public Bank(long[] balance) {
        acc = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        int n = acc.length;

        if (account1 >= 1 && account1 <= n &&
            account2 >= 1 && account2 <= n &&
            money >= 0 &&
            acc[account1 - 1] >= money) {

            acc[account1 - 1] -= money;
            acc[account2 - 1] += money;

            return true;
        }

        return false;
    }

    public boolean deposit(int account, long money) {
        int n = acc.length;

        if (account >= 1 && account <= n && money >= 0) {
            acc[account - 1] += money;
            return true;
        }

        return false;
    }

    public boolean withdraw(int account, long money) {
        int n = acc.length;

        if (account >= 1 && account <= n &&
            money >= 0 && acc[account - 1] >= money) {

            acc[account - 1] -= money;
            return true;
        }

        return false;
    }
}
