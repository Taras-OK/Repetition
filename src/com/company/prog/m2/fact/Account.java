package com.company.prog.m2.fact;

class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public int get() {
        return money;
    }

    public void set(int money) {
        this.money = money;
    }
}

class Transaction extends Thread {
    private Account account;
    private int withdraw;

    public Transaction(Account account, int withdraw) {
        this.account = account;
        this.withdraw = withdraw;
    }

    public void run() {
        try { // спим для эмуляции реального многопоточного доступа к ресурсу
            Thread.sleep(System.currentTimeMillis() % 50);
        } catch (InterruptedException e) {}

        synchronized (account) { // снимаем деньги со счета
            int total = account.get();
            if (total >= withdraw)
                account.set(total - withdraw);
        }
    }
}

class AccountSync {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        Transaction[] transactions = {
                new Transaction(acc, 100),
                new Transaction(acc, 500),
                new Transaction(acc, 200),
                new Transaction(acc, 50),
                new Transaction(acc, 150)
        };

        // запускаем транзакции
        for (Transaction t : transactions)
            t.start();

        // ждем их завершения
        for (Transaction t : transactions) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // на экране 0 или "ерунда" если убрать synchronized
        System.out.println("Total: " + acc.get());
    }
}