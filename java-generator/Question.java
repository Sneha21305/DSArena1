import java.util.List;

public class Question {
    private String question;
    private List<String> options;
    private String answer;

    public Question(String question, List<String> options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
}
