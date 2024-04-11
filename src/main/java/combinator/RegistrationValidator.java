package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface RegistrationValidator extends Function<Customer, ValidationResult> {

    static RegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static RegistrationValidator isPhoneValid() {
        return customer -> customer.getPhoneNumber().startsWith("01") ? ValidationResult.SUCCESS : ValidationResult.NUMBER_NOT_VALID;
    }

    static RegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16
                ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_ADULT;
    }

    default  RegistrationValidator and (RegistrationValidator other){
        return  customer -> {
            ValidationResult result = this.apply(customer);
            return  result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
        }
    }

    enum ValidationResult {
        SUCCESS,
        NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_ADULT
    }

