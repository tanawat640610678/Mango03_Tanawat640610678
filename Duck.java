public class Duck extends Animal implements Flyable {
    public void sound() {
        System.out.println("quack!");
      }

    public void dive(){
        System.out.println("Jum Bui!!!");
      }

      public void fly() {
        System.out.println("fly!");
      }
      public void glide() {
        System.out.println("glide!");
      }
    
      public void clean(Animal animal){
        System.out.println(this.toString() + "is cleaning " + animal.toString());
      }
    
}    
