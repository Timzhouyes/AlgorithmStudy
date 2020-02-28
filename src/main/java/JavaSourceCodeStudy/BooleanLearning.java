package JavaSourceCodeStudy;

public class BooleanLearning {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Boolean> booleanClass = Boolean.TYPE;
        System.out.println(booleanClass);
        Class aclass = "Helo".getClass();
        System.out.println(aclass.toGenericString());
        BooleanLearning booleanLearning = new BooleanLearning();
        booleanLearning.method1();
        ForPrimitive class1 = new ForPrimitive();
        class1.para1 =1;
        Integer int2 = 2;
        System.out.println(Boolean.FALSE.getClass().isPrimitive());
        System.out.println("int is "+int2.getClass().isPrimitive());
        System.out.println(int.class.isPrimitive());
        System.out.println(int.class.getName());
        Integer[] intList = new Integer[10];
        System.out.println(intList.getClass().getName());
        int[] intList1 = new int[10];
        System.out.println(intList1.getClass().getName());
        System.out.println(void.class.getName());
    }

    public void method1() throws ClassNotFoundException {
        Class t = Class.forName("java.lang.Thread", true, this.getClass().getClassLoader());
        System.out.println(this.getClass().getClassLoader());
        System.out.println(t.toGenericString());

    }

    private static class ForPrimitive{
        int para1;
    }
}
