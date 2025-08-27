public class ChatBotApp {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		ChatBot bot = new ChatBot();
		System.out.println("■ ChatBot: Hello! Type 'bye' to exit.");
		while (true){
			System.out.print("You: ");
			String input = sc.nextLine();
			try{
				String response = bot.getResponse(input);
				System.out.println("■ ChatBot: " + response);
				if (input.equalsIgnoreCase("bye"))
				break;
			} 
			catch (QuestionNotFoundException e) {
				System.out.println("■ ChatBot: " + e.getMessage());
			}
		}
		sc.close();
	}
}
