package models;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class Conversor {
    private final Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    RequestAPI requestAPI = new RequestAPI();

    public String convert(float value, String base, String target) throws IOException, InterruptedException {
        float resultValue;
        String json = requestAPI.getConversion(base, target);

        ResultER result = gson.fromJson(json, ResultER.class);

        resultValue = value * result.conversionRate();

        if (resultValue == 0) {
            return "The requested currency is not supported by Exchange Rate API";
        }

        return String.format("%.2f %s equals to %.2f %s", value, base, resultValue, target);
    }
}
