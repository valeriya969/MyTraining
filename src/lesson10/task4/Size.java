package lesson10.task4;

public enum Size {
    XXS(32){
        @Override
        void getDescription() {
            System.out.println("Child size");
        }
    },
    XS(34), S(36), M(38), L(40);

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    void getDescription(){
        System.out.println("Adult size");
    }
}
