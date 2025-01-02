import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1,groups = {"regression","sanity","functional"})
    void paymentInDinar(){
        System.out.println("This is payment in dinars...");
    }

    @Test(priority = 2,groups = {"regression","sanity","functional"})
    void paymentInEuros(){
        System.out.println("This is payment in dollars...");
    }
}
