package sahincustomerprogram;

public class Test1 {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Tom",5000.00);
        VipCustomer customer3 =new VipCustomer("Sahin","shnsmsek@icloud.com",1234000.00);

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer1.getEmail());
        System.out.println(customer2.getEmail());
        System.out.println(customer3.getEmail());
    }
}
