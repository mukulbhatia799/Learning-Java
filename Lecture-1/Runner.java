public class Runner {
    public static void main(String[] args) {
        Variable variable = new Variable();
        Variable variable2 = new Variable();

        variable.setInstanceVariable(100);
        System.out.println(variable.getInstanceVariable()); // 100

        variable.LocalVariable();       // 15

        variable.StaticVariable();      // 10
        Variable.StaticVariable();      // 10

        System.out.println(Variable.staticVariable);    // 10
    }
}