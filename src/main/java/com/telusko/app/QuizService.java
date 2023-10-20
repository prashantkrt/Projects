package main.java.com.telusko.app;

public class QuizService {

//    Question question1 = new Question(1,"size of int","2","6","4","8","4");
//    Question question2 = new Question(1,"size of int","2","6","4","8","4");
//    Question question3 = new Question(1,"size of int","2","6","4","8","4");
//    Question question4 = new Question(1,"size of int","2","6","4","8","4");
//    Question question5 = new Question(1,"size of int","2","6","4","8","4");

    Question[] questions = new Question[5]; // array of references

    public QuizService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        for (Question q : questions) {
            System.out.println(q.getQid() + "." + q.getTitle());
            System.out.println("i) " + q.getOption1());
            System.out.println("ii) " + q.getOption2());
            System.out.println("iii) " + q.getOption3());
            System.out.println("iv) " + q.getOption4());
        }

    }
}
