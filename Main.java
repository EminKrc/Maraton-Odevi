public class Main {
    public static void main(String[] args) {
        String[] names = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] trackTimes = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};

        System.out.println("Cumhuriyet Üniversitesi Maraton Sonucu:");
        Race race1 = new Race(names,trackTimes);
        race1.outputResults();
        race1.displayResults();
        race1.grading();
    }
}