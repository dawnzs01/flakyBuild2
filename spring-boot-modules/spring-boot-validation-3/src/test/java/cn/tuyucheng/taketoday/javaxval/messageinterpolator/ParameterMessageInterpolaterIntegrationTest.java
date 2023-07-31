package cn.tuyucheng.taketoday.javaxval.messageinterpolator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterMessageInterpolaterIntegrationTest {

   private static Validator validator;

   @BeforeAll
   public static void beforeClass() {
      ValidatorFactory validatorFactory = Validation.byDefaultProvider()
            .configure()
            .messageInterpolator(new ParameterMessageInterpolator())
            .buildValidatorFactory();

      validator = validatorFactory.getValidator();
   }

   @Test
   void givenNameLengthLessThanMin_whenValidate_thenValidationFails() {
      Person person = new Person();
      person.setName("John Doe");
      person.setAge(18);

      Set<ConstraintViolation<Person>> violations = validator.validate(person);
      assertEquals(1, violations.size());

      ConstraintViolation<Person> violation = violations.iterator().next();
      assertEquals("Name should be between 10 and 100 characters", violation.getMessage());
   }

   @Test
   void givenAgeIsLessThanMin_whenValidate_thenValidationFails() {
      Person person = new Person();
      person.setName("John Stephaner Doe");
      person.setAge(16);

      Set<ConstraintViolation<Person>> violations = validator.validate(person);
      assertEquals(1, violations.size());

      ConstraintViolation<Person> violation = violations.iterator().next();
      assertEquals("Age should not be less than 18", violation.getMessage());
   }

   @Test
   void givenEmailIsMalformed_whenValidate_thenValidationFails() {
      Person person = new Person();
      person.setName("John Stephaner Doe");
      person.setAge(18);
      person.setEmail("johndoe.dev");

      Set<ConstraintViolation<Person>> violations = validator.validate(person);
      assertEquals(1, violations.size());

      ConstraintViolation<Person> violation = violations.iterator().next();
      assertEquals("Email address should be in a correct format: ${validatedValue}", violation.getMessage());
   }
}