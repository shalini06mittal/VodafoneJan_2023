package assignment;

public class QuizMasterService {

	public QuizMasterService(QuizMaster quizMaster) {
		this.quizMaster = quizMaster;
	}

	private QuizMaster quizMaster;
	
	public void setQuizMaster(QuizMaster quizMaster) {
		this.quizMaster = quizMaster;
		System.out.println("Setter called");
	}

	public void askQuestion()
	{
		System.out.println(quizMaster.popQuestion());
	}
	public void createQuestion(String s)
	{
		quizMaster.addQuestion(s);
	}
}
