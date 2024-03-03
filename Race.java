import java.util.Collections;

public class Race {
    private String[] contestant;

    private final int[] raceTime;

    public Race(String[] contestant, int[] raceTime) {
        this.contestant = contestant;
        this.raceTime = raceTime;


    }
    public String[] getContestant() {
        return contestant;
    }

    public void setContestant(String[] contestant) {
        this.contestant = contestant;
    }

    public int[] getRaceTime() {
        return raceTime;
    }

    public void outputResults(){
        for (int i = 0;i< getContestant().length;i++){
            System.out.println(contestant[i]+" : "+raceTime[i]);
        }
    }

    public int findFirstTime(){
        int firstTime = raceTime[0];

        for (int i = 0;i< raceTime.length;i++){
            if (raceTime[i]<firstTime){
                firstTime = raceTime[i];

            }
        }

        return firstTime;
    }
        public String firstRacer(){
            int firstTime = raceTime[0];
            String firstRacer = null;
            for (int i = 0; i<raceTime.length;i++){
                if(raceTime[i]<firstTime){
                    firstTime = raceTime[i];
                    firstRacer=contestant[i];
                }else continue;
            }
            return firstRacer;
        }
    public int  findSecondTime(){

        int secondTime = raceTime[0];
        for (int i = 0;i< raceTime.length;i++){
            if (raceTime[i]<secondTime && raceTime[i]>findFirstTime()){
                secondTime=raceTime[i];
            }
        }

        return secondTime;
    }

    public String secondRacer() {
        int secondTime = raceTime[0];
        String secondRacer = null;
        for (int i = 0; i < raceTime.length; i++) {
            if (raceTime[i] < secondTime && raceTime[i] > findFirstTime()) {

                secondRacer = contestant[i];
            }


        }
        return secondRacer;
    }
        public int findThirdTime(){
        int thirdTime = raceTime[0];
        String thirdRacer = null;

        for (int i = 0; i<raceTime.length;i++){
            if (raceTime[i]<thirdTime && raceTime[i]>findSecondTime()){
                thirdTime = raceTime[i];
            }
        }
        return  thirdTime;

        }

        public String thirdRacer(){
            int thirdTime = raceTime[0];
            String thirdRacer = null;

            for (int i = 0; i<raceTime.length;i++){
                if (raceTime[i]<thirdTime && raceTime[i]>findSecondTime()){
                    thirdTime = raceTime[i];
                    thirdRacer = contestant[i];
                }
            }
            return  thirdRacer;

        }

        public int grading(){
        int A = 0;
        int B = 0;
        int C = 0;
        for (int i = 0;i<raceTime.length;i++){
            if (200<=raceTime[i] && raceTime[i]<=299){
                A++;
            }
            else if (300<raceTime[i]&& raceTime[i]<=399) {
                B++;
            } else if (raceTime[i]>400) {
                C++;
            }
        }
            System.out.println("A-> "+A);
            System.out.println("B-> "+B);
            System.out.println("C-> "+C);
        return A;

        }


    public void displayResults(){
        System.out.println("1. Yarışçı : "+firstRacer()+" "+findFirstTime()+"'");
        System.out.println("2. Yarışçı : "+secondRacer()+" "+findSecondTime()+"'");
        System.out.println("3. Yarışçı : "+thirdRacer()+" "+findThirdTime()+"'");
    }


}
