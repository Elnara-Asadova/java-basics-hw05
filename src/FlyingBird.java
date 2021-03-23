public abstract class FlyingBird extends Bird{

  public void checkWings() {
    System.out.println("Bird has wings.");
  }

  @Override
  public String toString(){
    return this.getClass().getSimpleName();
  }
}
