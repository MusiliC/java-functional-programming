package combinator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Musili",
                "musili@com",
                "+011111",
                LocalDate.of(2000, 1, 1)
        );

        // CustomerValidatorService validatorService = new CustomerValidatorService();

        // System.out.println(validatorService.isValid(customer));

        //store customer in db if valid

        ValidationResult validCustomer = RegistrationValidator
                .isEmailValid()
                .and(RegistrationValidator.isPhoneValid())
                .and(RegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(validCustomer);

        if (validCustomer != ValidationResult.SUCCESS) {
            throw new IllegalStateException(validCustomer.name());
        }
    }
}
