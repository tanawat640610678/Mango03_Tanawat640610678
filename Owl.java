public class Owl extends Animal implements Flyable {
    
    public void sound() {
        System.out.println("Hook!");
      }

    @Override
    public void fly() {
        System.out.println("fly!");   
    }

    @Override
    public void glide() {
        System.out.println("Fewwwww!");
    }
      
}
