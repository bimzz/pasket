package tutorial.label_demo;

public class Test {

  final static String tag = Test.class.getPackage().getName();

  public static void main(String[] args) {
    System.out.println(tag);
    LabelDemo.main();
  }

}
