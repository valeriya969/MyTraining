package lesson10.Practise;

public enum Season {
    WINTER(-5), SPRING(12), SUMMER(30){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(9);
    private double tmp;

    Season(double tmp) {
        this.tmp = tmp;
    }

    public double getTmp() {
        return tmp;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}
