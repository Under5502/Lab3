package nguyentuananhvu.Lab3.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import nguyentuananhvu.Lab3.Validator.annotation.ValidCategoryId;
import nguyentuananhvu.Lab3.entity.Category;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }
}
