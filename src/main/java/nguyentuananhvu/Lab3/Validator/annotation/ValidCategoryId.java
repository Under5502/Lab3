package nguyentuananhvu.Lab3.Validator.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import nguyentuananhvu.Lab3.Validator.ValidCategoryIdValidator;

import java.lang.annotation.*;
import java.lang.reflect.Type;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
@Documented
public @interface ValidCategoryId {
    String message() default "Invalid Category ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
