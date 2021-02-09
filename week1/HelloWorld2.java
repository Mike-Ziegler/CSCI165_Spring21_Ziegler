public class HelloWorld2 {

    public static void main(String[] args) {
        String s = "";
    for (String t : args)
        s += t + " ";
    
        

        System.out.printf("Hello %s. Nice work processing the arguments\n", s);

    System.out.println(System.getProperty("java.class.path") + System.getProperty("java.home") + System.getProperty("java.version") + System.getProperty("os.arch") + System.getProperty("os.version") + System.getProperty("user.dir") + System.getProperty("user.home") + System.getProperty("user.name"));
}
}