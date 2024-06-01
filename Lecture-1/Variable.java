public class Variable {
    int instanceVariable;
    static int staticVariable = 10;

    public void setInstanceVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public int getInstanceVariable() {
        return instanceVariable;
    }

    public void LocalVariable() {
        int localVar = 15;
        System.out.println(localVar);
    }

    public static void StaticVariable() {
        System.out.println(staticVariable);
    }
}