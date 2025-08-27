class ChatBot {
	private String[] questions = {
		"hi", 
		"hello", 
		"how are you", 
		"what is your name", 
		"bye",
		"what is java",
		"who developed java",
		"what is oops"
		
	};

	private String[] answers = {
		"Hello! How can I help you?",
		"Hi there! Nice to meet you.",
		"I'm just a chatbot, but I'm doing great! How about you?",
		"I am ChatBot, your virtual assistant.",
		"Goodbye! Have a nice day!",
		"Java is a high-level, object-oriented programming language.",
		"Java was developed by James Gosling at Sun Microsystems.",
		"OOPs stands for Object-Oriented Programming System, which uses concepts like inheritance, polymorphism, abstraction, and encapsulation."
	};

	public String getResponse(String userInput) throws QuestionNotFoundException {
		userInput = userInput.toLowerCase().trim();
		for (int i = 0; i < questions.length; i++) {
			if (questions[i].equals(userInput)) {
				return answers[i];
			}
		}
		throw new QuestionNotFoundException("I don't understand that. Try asking something else!");
	}
}
