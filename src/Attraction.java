public class Attraction {
    public static void main(String[] args){
        int babyAge=15;
        boolean isLess5= babyAge<5;
        boolean isMore5ButLess14= babyAge>=5 && babyAge<14;
        boolean isMore14=babyAge>=14;
        if (isLess5){
            System.out.println(" нельзя кататься ");
        }
        if (isMore5ButLess14){
            System.out.println(" можно кататься в сопровождении взрослого  ");
        }
        if (isMore14){
            System.out.println(" можно кататься одному ");
        }
    }
}
