public class Main {
    public static  void main(String[] args) {
        
    Duck donald = new Duck();
    Duck mk = new PakingDuck();
    Cow wagyu = new Cow();
    
    donald.clean(wagyu);
    mk.clean(donald);
    }
}
