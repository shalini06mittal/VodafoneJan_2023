package assignment;

public class QuizMasterService {

	public QuizMasterService() {
		super();
		
		System.out.println("bean Created");
	}
	
	QuizMaster quizMaster;
	
	public void setQuizMaster(QuizMaster quizMaster) {
		this.quizMaster = quizMaster;
		System.out.println("Setter called");
	}

	public void askQuestion()
	{
		System.out.println(quizMaster.popQuestion());
	}
}
