package fundamental-lessons.equals;

public class Password {
    String secret;

    public Password(String secret) {
        this.secret = secret;
    }

    public boolean checkBroken(String attempt){
        return secret == attempt;
    }
    public boolean check(String attempt) {
        return attempt.equals(secret);
    }

    public boolean sameAs(String other) {
        return secret.equals(other.secret);
    }

     // ===== CHALLENGE 2 =====
     // Create another method called "change()" two String arguements, new pw and its duplicate
    // Change the password. The user must type the new password twice.
    // Change secret and return true ONLY if:
    //     both typed passwords match each other, AND
    //     the new password is different from the current one.
    // Otherwise change nothing and return false.
    //     secret "lion": change("tiger", "tiger") -> true   (secret is now "tiger")
    //     secret "lion": change("tiger", "tigre") -> false  (typo)
    //     secret "lion": change("lion", "lion")   -> false  (same as old)
    // Tools: equals, if/else, &&, !

    public boolean change(String newPassword, String originalPassword) {
        if (originalPassword.equals(secret) && (!originalPassword.equals(newPassword))) {
            return true;
            secret = newPassword;
        }
        else
            return false;
    }




}
