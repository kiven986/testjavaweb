public class Droid {
  int batteryLevel;
  String name;

  public void batteryLevel (){
    batteryLevel = batteryLevel - 10;
  }

  public String toString() {
    return "Hello, I’m the droid:" + name;
  }
  

  public void performTask (String task){
    System.out.println( name + " is performing task: " + task);
  }
  public Droid(String droidName) {
    batteryLevel = 100;
     name = droidName;
  }
  public static void main (String[] args) {
  Droid Codey = new Droid("Codey");
     System.out.println( Codey );
     System.out.println( Codey.batteryLevel );
     Codey.performTask("dancing");
  }
} 