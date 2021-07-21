package com.hc.summer.common.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @author mengweibin
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {

    private Pattern pattern = compile(
            "(((^((13[0-9])|(14[5-9])|(15[0-35-9])|(16[5-7])|17[01235-8]|18[0-9]|19[198])\\d{8})|(^(1740)\\d{7}))$)");

    @Override
    public void initialize(Phone phone) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        return pattern.matcher(value).matches();
    }
}
