package com.example.elmboot.exception;//package com.exception;

import com.example.elmboot.result.ErrorResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class MyExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);


    @ExceptionHandler(value = GenerallyeException.class)
    @ResponseBody
    public ErrorResult generallyeExceptionHandler(GenerallyeException e) {
        logger.error(e.getResultMsg());
        return new ErrorResult(e.getResultMsg());
    }

    @ExceptionHandler(value = ParamerException.class)
    @ResponseBody
    public ErrorResult paramExceptionHandler(ParamerException e) {
        logger.error(e.getResultMsg());
        return new ErrorResult(e.getResultMsg());
    }

    @ExceptionHandler(value = DataNullException.class)
    @ResponseBody
    public ErrorResult dataNullExceptionExceptionHandler(DataNullException e) {
        logger.error(e.getResultMsg());
        return new ErrorResult(e.getResultMsg());
    }

    /**
     * ValidationException
     */
    @ExceptionHandler(ValidationException.class)
    public ErrorResult handleValidationException(ValidationException e) {
        logger.error(e.getMessage(), e);
        return new ErrorResult(e.getCause().getMessage());
    }

    /**
     * MethodArgumentNotValidException
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e
            , HttpServletRequest request
            , HttpServletResponse response) {
        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < allErrors.size(); i++) {
            ObjectError objectError = allErrors.get(i);
            String[] strings = Optional.ofNullable(objectError).map(ObjectError::getCodes).orElse(null);
            String errorMessage = Optional.ofNullable(strings).map(s -> s[0]).orElse("");
            int lastIndexOf = errorMessage.lastIndexOf(".");
            if (lastIndexOf != -1) {
                String substring = errorMessage.substring(lastIndexOf + 1, errorMessage.length());
                stringBuilder.append(substring).append(" ");
            }
        }
        String message = allErrors.stream().map(s -> s.getDefaultMessage()).collect(Collectors.joining(";"));
        stringBuilder.append(message);
        return new ErrorResult(stringBuilder.toString());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorResult exceptionHandler(Exception e) {
        logger.error(e.getMessage(), e);
        return new ErrorResult("内部错误!");
    }
}
