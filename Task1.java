import java.util.*;

class Task1 {
    public static void main(String[] args) {
        Game_Changer();

    }

    public static void Game_Changer() {
        Scanner sc = new Scanner(System.in);
        Random rand_number = new Random();
        int number_generator = rand_number.nextInt(100) + 1;
        int guess_number;
        int attempt = 0;
        int runout_attempt = 5;
        System.out.println(" Guess the  number between 1 to 100 ");

        while (attempt < runout_attempt) {
            System.out.println(" Enter a guess number : ");
            guess_number = sc.nextInt();

            if (guess_number == number_generator) {
                System.out.println(number_generator + " is correct answer in " + attempt + " attempt ");
                attempt = attempt + 1;
                break;

            } else if (guess_number < number_generator) {
                System.out.println(guess_number + " guess is too low  in " + attempt + " attempt  ");
                attempt = attempt + 1;

            }

            else if (guess_number > number_generator) {
                System.out.println(guess_number + " guess is too high in " + attempt + " attempt");
                attempt = attempt + 1;

            }

            else if (attempt == runout_attempt) {
                System.out.println(" your attempt is runout!  please try again");

            }

        }

        sc.close();
    }
}
