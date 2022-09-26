public class Vagon {
    public static void main(String[] args) {
        int countPassangers = 18;
        int vagonValue = 120;
        int seet = 60;
        int standingPlace = vagonValue - seet;

        if (countPassangers <= seet) {
            System.out.println(" есть сидячие места ");
        }
       else if ((countPassangers>60)&&(countPassangers<vagonValue)) {
            System.out.println(" есть стоячие места  ");
        }
        else  {
            System.out.println(" мест нет вагон забит");
        }
    }
}
