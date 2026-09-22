
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<String> selection = new ArrayList<>();

    public QuestionService() {
        questions.add(new Question(1,
                "Milline neist on Java data tüüp?",
                "String", "System", "Scanner", "Main",
                "String"));

        questions.add(new Question(2,
                "Millist märksõna kasutatakse objekti loomisel?",
                "class", "new", "public", "void",
                "new"));

        questions.add(new Question(3,
                "Milline meetod on Java programmi alguspunkt?",
                "start()", "run()", "main()", "init()",
                "main()"));

        questions.add(new Question(4,
                "Milline neist tuubeldab väärtusi Javas?",
                "int", "String", "ArrayList", "boolean",
                "ArrayList"));

        questions.add(new Question(5,
                "Milline sümbol lõpetab väite?",
                ":", ";", ".", ",",
                ";"));
    }

    public void playQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println("Question " + question.getId() + ": " + question.getQuestion());
            System.out.println("1. " + question.getOpt1());
            System.out.println("2. " + question.getOpt2());
            System.out.println("3. " + question.getOpt3());
            System.out.println("4. " + question.getOpt4());
            System.out.print("Your answer: ");

            String answer = scanner.nextLine();
            selection.add(answer);

            System.out.println();
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            String userAnswer = selection.get(i);

            if (question.getAnswer().equals(userAnswer)) {
                score = score + 1;
            }
        }

        System.out.println("You got " + score + " out of " + questions.size() + " correct.");
    }
}
