package hello;

public class ConsoleHelloService implements HelloService {

    private String prefix, suffix;

    public ConsoleHelloService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    @Override
    public void sayHello(String name) {
        System.out.println(String.format("%s %s%s", prefix, name, suffix));
    }
}
