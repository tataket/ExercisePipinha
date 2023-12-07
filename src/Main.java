import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operation sum = (x, y) -> x + y;
        Operation multiply = (x, y) -> x * y;
        Operation divide = (x, y) -> x / y;
        Operation subtract = (x, y) -> x - y;

        Calculator calculator = new Calculator();
        System.out.println(calculator.executeOperation(2, 5, sum));
        System.out.println(calculator.executeOperation(2, 5, multiply));
        System.out.println(calculator.executeOperation(2, 5, divide));
        System.out.println(calculator.executeOperation(2, 5, subtract));
        System.out.println("\n");

        Filter filter = s -> s.endsWith("a");

        List<String> className = List.of("Tiago", "Pedro", "Bruna", "Fátima", "David", "Marco", "Ricardo", "Francisco", "Rodrigo", "Fábio", "Paulo");
        Filterer filterer = new Filterer();

        List<String> updateClassNames = filterer.filtered(className, filter);
        updateClassNames.forEach(System.out::println);
        System.out.println("\n");

        Transformer transformer = new Transformer();
        Transformation returnLength = (String::length);

        String gf = "asdfghjk";
        System.out.println(returnLength.transform(gf));
        System.out.println("\n");

        Executor executor = new Executor();
        Action printAction = (System.out::println);

        List<String> action = List.of("Walk", "Eat", "Sleep", "Run", "Read", "Work");
        executor.executeAction(action, printAction);
        System.out.println("\n");

        Generator generator = ()-> "Hello bitch";
        Producer producer = new Producer();

        List<String> listUpdate = producer.produce(4, generator);
        System.out.println(listUpdate);

        }
    }
