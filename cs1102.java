import java.util.Scanner;

public class SupercarQuiz {

    public static void main(String[] args) {
        // Define the correct answers
        String[] correctAnswers = {"A", "B", "C", "D", "A"};

        // Initialize the score counter
        int score = 0;

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the quiz instructions
        System.out.println("Welcome to the Supercar Quiz!");
        System.out.println("Please answer the following questions by typing the corresponding letter (A, B, C, or D).");

        // Ask each question and check the user's answer
        for (int i = 0; i < correctAnswers.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            switch (i) {
                case 0:
                    System.out.println("Which car is known for its butterfly doors?");
                    System.out.println("A. Lamborghini Aventador");
                    System.out.println("B. Ferrari LaFerrari");
                    System.out.println("C. McLaren Senna");
                    System.out.println("D. Koenigsegg Jesko");
                    break;
                case 1:
                    System.out.println("Which car holds the record for the fastest production car?");
                    System.out.println("A. Bugatti Chiron Super Sport 300+");
                    System.out.println("B. SSC Tuatara");
                    System.out.println("C. Hennessey Venom F5");
                    System.out.println("D. Koenigsegg Agera RS");
                    break;
                case 2:
                    System.out.println("Which car is considered to be the 'King of Hypercars'?");
                    System.out.println("A. Bugatti Veyron");
                    System.out.println("B. Koenigsegg Regera");
                    System.out.println("C. Porsche 918 Spyder");
                    System.out.println("D. Ferrari FXX K");
                    break;
                case 3:
                    System.out.println("Which car is known for its futuristic design and advanced technology?");
                    System.out.println("A. Lamborghini Terzo Millennio");
                    System.out.println("B. Ferrari SF90 Stradale");
                    System.out.println("C. McLaren P1");
                    System.out.println("D. Aston Martin Valkyrie");
                    break;
                case 4:
                    System.out.println("Which car is the most expensive production car in the world?");
                    System.out.println("A. Bugatti La Voiture Noire");
                    System.out.println("B. Rolls-Royce Sweptail");
                    System.out.println("C. Koenigsegg Jesko Absolut");
                    System.out.println("D. Pagani Huayra Roadster BC");
                    break;
            }

            // Get the user's answer
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();

            // Check if the user's answer is correct
            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
                score++; // Increment the score
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i]);
            }
        }

        // Calculate the final score percentage
        double scorePercentage = (double) score / correctAnswers.length * 100;

        // Display the final score
        System.out.println("\nYour final score is: " + scorePercentage + "%");
    }
}
