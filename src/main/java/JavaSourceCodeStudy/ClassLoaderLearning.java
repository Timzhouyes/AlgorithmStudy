package JavaSourceCodeStudy;

public class ClassLoaderLearning {
    public static void main(String[] args) {
        ClassLoader classLoader = Test.class.getClassLoader();
        System.out.println("ClassLoader for our own class is "+ classLoader.toString());
        System.out.println("ClassLoader\'s parent is "+classLoader.getParent().toString());
        System.out.println("ClassLoader\'s grand father is:"+classLoader.getParent().getParent().toString());
//        classLoader = int.class.getClassLoader();
//        System.out.println("ClassLoader for primary type is "+classLoader.toString());


    }
}
