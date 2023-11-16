package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        String[] initialHealthplans = new String[12];
        String[] initialHealthplans2 = new String[12];
        Employee firstPerson = new Employee(1, "kerem karaman", "k@gmail.com", 12345, initialHealthplans);
        Employee secondEmployee=new Employee(0,"jonathan the third","jo@gmail.com",12345,initialHealthplans2);
        firstPerson.addHealthplan(0, "böbrek");
        System.out.println("------");
        firstPerson.addHealthplan(2, "kalp");
        System.out.println(firstPerson);
        firstPerson.addHealthplan(2, "el");
        System.out.println(firstPerson);
        System.out.println(secondEmployee);
        System.out.println("********** company");
        String[] initialDevelopers = new String[10];
        Company firstCompany = new Company(0, "Joe", 10000, initialDevelopers);
        System.out.println(firstCompany);

        firstCompany.setGiro(500000);
        System.out.println(firstCompany);

        firstCompany.addEmployee(1, "Bill Gates");
        System.out.println(firstCompany);
        firstCompany.addEmployee(0, "MacBook");
        System.out.println(firstCompany);
        firstCompany.addEmployee(1, "Kerem");
        System.out.println(firstCompany);
        System.out.println("**********");

        Healthplan myHealtPlan = new Healthplan(1, "Space", Plan.HEART);
        System.out.println(myHealtPlan.getPlan().getName());
        System.out.println(myHealtPlan.getPlan().getPrice());


    }


    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
