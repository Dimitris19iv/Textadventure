import java.util.ArrayList;
import java.util.Scanner;

class Question {
    private String question;
    private String result = null;

    Question(String question) {
        this.question = question;
    }

    Question(String question, String result) {
        this.question = question;
        this.result = result;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String value) {
        question = value;
    }
}

class Stage {
    private String title;
    private ArrayList<Question> questions;
    private ArrayList<Stage> answers;

    public Stage(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void setAnswers(ArrayList<Stage> answers) {
        this.answers = answers;
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public ArrayList<Stage> getAnswers() {
        return this.answers;
    }

}

class Main {

    public static void main(String[] args) {
        System.out.println("Test");

        //Pistes
        Stage s1 = new Stage("Καλημέρα χρήστη μόλις ξύπνησες στο σπίτι σου. Τι θα ήθελες να κάνεις;");
        Stage s2 = new Stage("Είσαι στον δρόμο για την δουλειά σου και πετάγετε ένας ανθρώπος στην μέση του δρόμου και ζητάει βοήθεια. Πως θα αντιδράσεις;");
        Stage s3 = new Stage("Αυτός ο άνθρωπος είναι λήστης και σε απειλεί με ένα όπλο. Τι θα κάνεις;");
        Stage s4 = new Stage("Καταφέρνεις και τον αφοπλίζεις. Τι θα κάνεις;");
        Stage s5 = new Stage("Πυροβόλησες και είναι τραυματισμένος. Τι επιλέγεις;");
        Stage s6 = new Stage("Συγχαρητήρια μόλις κέρδισες!");

        //Erwtiseis pistas 1
        Question s1_q1 = new Question("Πάρε τα κλειδιά σου και φύγε από το σπίτι με το όχημα σου.");
        Question s1_q2 = new Question("Πέσε για ύπνο! Τα λέμε του χρόνου.", "Έχασες! Ξαναπροσπάθησε.\n");
        /* Erotiseis pistas 2 */ 
        Question s2_q1 = new Question("Τον προσπερνάς και πας για την δουλειά.", "Ολα καλά! Ξαναπροσπάθησε.\n");
        Question s2_q2 = new Question("Βγαίνεις από το όχημα και τον ρωτάς τι συμβαίνει.");
        // Erotiseis pistas 3
        Question s3_q1 = new Question("Επίθεση!");
        Question s3_q2 = new Question("Βάλε το στα πόδια.", "Έχασες! Ξαναπροσπάθησε.\n");
        // Erotiseis pistas 4
        Question s4_q1 = new Question("Πάρε το όπλο από κάτω.");
        Question s4_q2 = new Question("Μπες στο όχημα σου.", "Έχασες! Ξαναπροσπάθησε.\n");
        Question s4_q3 = new Question("Απομάκρυσου με τα πόδια και καλέσε την αστυνομία", "Έχασες! Ξαναπροσπάθησε.\n");
        // Erotiseis pistas 5
        Question s5_q1 = new Question("Πας στην δουλεία κανονικά.");
        Question s5_q2 = new Question("Καλάς την αστυνομία");
        //Eroriseis pistas 6
        Question s6_q1 = new Question("Πάτα 0 για επανάληψη η κατί άλλο για έξοδο.");


        // Lista me erwtiseis tis pistas 1
        ArrayList<Question> s1_questions = new ArrayList<>();
        s1_questions.add(s1_q1);
        s1_questions.add(s1_q2);
        s1.setQuestions(s1_questions); //Stage 1 set questions

        // Lista me tis apantiseis(pistes) pistas 1
        ArrayList<Stage> s1_answers = new ArrayList<>();
        s1_answers.add(s2);
        s1_answers.add(s1);
        s1.setAnswers(s1_answers); //Stage 1 set stages (answers)

        // Lista me erwtiseis tis pistas 2
        ArrayList<Question> s2_questions = new ArrayList<>();
        s2_questions.add(s2_q1);
        s2_questions.add(s2_q2);
        s2.setQuestions(s2_questions); //Stage 2 set questions

        // Lista me tis apantiseis(pistes) pistas 2
        ArrayList<Stage> s2_answers = new ArrayList<>();
        s2_answers.add(s1);
        s2_answers.add(s3);
        s2.setAnswers(s2_answers); //Stage 2 set stages (answers)

        // Lista me erwtiseis tis pistas 3
        ArrayList<Question> s3_questions = new ArrayList<>();
        s3_questions.add(s3_q1);
        s3_questions.add(s3_q2);
        s3.setQuestions(s3_questions); //Stage 3 set questions
        // 3
        ArrayList<Stage> s3_answers = new ArrayList<>();
        s3_answers.add(s4);
        s3_answers.add(s1);
        s3.setAnswers(s3_answers); //Stage 3 set answers

        //4
        // Lista me erwtiseis tis pistas 4
        ArrayList<Question> s4_questions = new ArrayList<>();
        s4_questions.add(s4_q1);
        s4_questions.add(s4_q2);
        s4_questions.add(s4_q3);
        s4.setQuestions(s4_questions); //Stage 4 set questions
        // 3
        ArrayList<Stage> s4_answers = new ArrayList<>();
        s4_answers.add(s5);
        s4_answers.add(s1);
        s4_answers.add(s1);
        s4.setAnswers(s4_answers); //Stage 3 set answers

        //5
        // Lista me erwtiseis tis pistas 5
        ArrayList<Question> s5_questions = new ArrayList<>();
        s5_questions.add(s5_q1);
        s5_questions.add(s5_q2);
        s5.setQuestions(s5_questions); //Stage 5 set questions
        
        ArrayList<Stage> s5_answers = new ArrayList<>();
        s5_answers.add(s1);
        s5_answers.add(s6);
        s5.setAnswers(s5_answers); //Stage set answers

        //6
        // Lista me erwtiseis tis pistas 3
        ArrayList<Question> s6_questions = new ArrayList<>();
        s6_questions.add(s6_q1);
        s6.setQuestions(s6_questions); //Stage set questions
        // 3
        ArrayList<Stage> s6_answers = new ArrayList<>();
        s6_answers.add(s1);
        s6.setAnswers(s6_answers); //Stage set answers

        startGame(s1);
    }

    public static void startGame(Stage stage) {
        int num = 1;

        while (num >= 0 && num < stage.getQuestions().size()) {
            System.out.println("Question: " + stage.getTitle());

            ArrayList<Question> questions = stage.getQuestions();
            ArrayList<Stage> answers = stage.getAnswers();

            for (int i = 0; i < questions.size(); i++) {
                System.out.println("(" + i + "): " + questions.get(i).getQuestion());
            }

            Scanner scan = new Scanner(System.in);
            System.out.print("\nEnter your selection: ");

            // This method reads the number provided using keyboard
            num = scan.nextInt();
            // System.out.println(num);

            stage = answers.get(num);
        }

        // Closing Scanner after the use
        // scan.close();
    }

    public void fillQuestions() {

    }

}
