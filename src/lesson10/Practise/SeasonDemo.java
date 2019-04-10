package lesson10.Practise;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season1=Season.AUTUMN;
        System.out.println(season1);
        printSeason(season1);
        printAllSeasons();
        Season season3=Season.valueOf("SUMMER");
        System.out.println(season3);
    }

    public static void printSeason(Season season){
        switch (season){
            case WINTER:
                System.out.println("I like winter");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
            case AUTUMN:
                System.out.println("I like autumn");
                break;
        }

    }

    private static void printAllSeasons(){
        Season[] seasons=Season.values();
        for (Season season:seasons) {
            System.out.println(season+" "+season.getTmp()+" "+season.getDescription());
        }
    }

}
