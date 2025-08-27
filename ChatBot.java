class ChatBot {
	private String[] questions = {"hi", "hello", "how are you", "what is your name", "bye"};
	private String[] answers = {
			"Hello! How can I help you?",
			"Hi there! Nice to meet you.",
			"I'm just a chatbot, but I'm doing great! How about you?",
			"I am ChatBot, your virtual assistant.",
			"Goodbye! Have a nice day!"
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