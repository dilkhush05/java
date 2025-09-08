import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountManager {
        static class Transaction {
        String type; // "credit" or "debit"
        int amount;

        Transaction(String type, int amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Transaction> transactions = new ArrayList<>();
        List<Integer> commitHistory = new ArrayList<>();
        List<Transaction> uncommitted = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String op = parts[0];

            switch (op) {
                case "read":
                    System.out.println(balance);
                    break;

                case "credit":
                case "debit":
                    int amount = Integer.parseInt(parts[1]);
                    if (op.equals("credit")) {
                        balance += amount;
                    } else {
                        balance -= amount;
                    }
                    uncommitted.add(new Transaction(op, amount));
                    transactions.add(new Transaction(op, amount));
                    break;

                case "abort":
                    int txIndex = Integer.parseInt(parts[1]) - 1;
                    if (txIndex < transactions.size()) {
                        Transaction tx = transactions.get(txIndex);
                        if (uncommitted.contains(tx)) {
                            if (tx.type.equals("credit")) {
                                balance -= tx.amount;
                            } else {
                                balance += tx.amount;
                            }
                            uncommitted.remove(tx);
                        }
                    }
                    break;

                case "commit":
                    commitHistory.add(balance);
                    uncommitted.clear();
                    break;

                case "rollback":
                    int commitIndex = Integer.parseInt(parts[1]) - 1;
                    if (commitIndex < commitHistory.size()) {
                        balance = commitHistory.get(commitIndex);
                        uncommitted.clear();
                    }
                    break;
            }
        }
        sc.close();
    }
}
