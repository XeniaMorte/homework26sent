public class Humanboolean {
    public static void main(String[] args) {
        int age = 20;
        boolean isGoToBabyClass = age >= 2 && age <= 6;
        boolean isGoToSchool = age >= 7 && age <= 18;
        boolean isGoToUnivercity = age >= 18 && age <= 24;
        boolean isGoToWork = age > 24;

        if (isGoToBabyClass) {
            System.out.println("Ecли возраст человека равен " + " " + age + " то ему нужно ходить в детский сад");
        } else if (isGoToSchool) {
            System.out.println("Ecли возраст человека равен " + " " + age + " то ему нужно ходить в школу");
        }
         else if (isGoToUnivercity) {
            System.out.println("Ecли возраст человека равен " + " " + age + " то ему нужно ходить в универститет");
        }
        else  {
            System.out.println("Ecли возраст человека равен " + " " + age + " то ему нужно ходить на работу");
        }
    }
}
