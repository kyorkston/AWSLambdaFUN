package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.Map;

public class Hello {
    public String myHandler(Map<String,Object> input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("awright wurld count : " + input);
        return String.valueOf(input);
    }
}