package Java.patterns.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = specializeDeveloper("java");
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }
    static DeveloperFactory specializeDeveloper(String language){
        if (language.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();
        else if (language.equalsIgnoreCase("C++"))
            return new CppDeveloperFactory();
        else if (language.equalsIgnoreCase("php"))
            return new PhpDeveloperFactory();
        else throw new RuntimeException(language+" unnamed language...");
    }
}
