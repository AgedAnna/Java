public class Main {
    public static void main(String[] args){

        Person P1 = new Person();
        BankAccount N1 = new BankAccount();

        P1.setAge(21);
        P1.setName("Victor");
        P1.setCrountry("Brasil");

        System.out.println(P1.getAge());
        System.out.println(P1.getName());
        System.out.println(P1.getCrountry());

        N1.setAccountNumber("00000850244");
        N1.setBalance(98798.78979);

        System.out.println(N1.getAccountNumber());
        System.out.println(N1.getBalance());

        Rectangle R1 = new Rectangle();
        R1.setWidth(20);
        R1.setHeigth(30);

        System.out.println("Altura: " + R1.getHeigth());
        System.out.println("Largura: " + R1.getWidth());
    }

}
