package Training.smallApps.registrationApp;

import java.util.List;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String Email;
    private String secretQuestion;
    private String secretAnswer;

    public User(String username, String password, String secretQuestion, String secretAnswer, String Email) {
        this.username = username;
        this.password = password;
        this.Email = Email;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
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
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }
    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }
    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }
}
