import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistration4Test {
    @Test
    void main() {
        UserRegistration4 object = new UserRegistration4();


        {
            Assertions.assertTrue(object.validateFirstName("[A-Z]{1}[a-z]{2,}", "Aniket"));
        }


        {
            Assertions.assertTrue(object.validateLastName("[A-Z]{1}[a-z]{2,}", "Raikwar"));
        }


        {

            Assertions.assertTrue(object.validateEmail("^[a-zA-Z0-9]+[\\.\\-\\+\\_]?[a-zA-Z0-9]*@[a-zA-Z]+[.]?[a-zA-Z]{2,4}[\\.]?([a-z]{2})?$", "ashok.patel@gmail.com.in"));
        }


        {
            Assertions.assertTrue(object.validatePhoneNumber("^[0-9]{2}[ ][0-9]{10}$", "91 1234567809"));
        }


        {
            Assertions.assertTrue(object.validatePassward("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}", "Aniket123@"));
        }
    }
}