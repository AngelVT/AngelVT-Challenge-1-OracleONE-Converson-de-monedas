package models;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

        String conversion = String.format("%.2f %s equals to %.2f %s", value, base, resultValue, target);

        LocalDateTime currentDate = LocalDateTime.now();

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

        String formatedDate = currentDate.format(formater);

        String record = String.format("""
                    [ %s ] Converted %.2f %s to %s:
                            %s
                
                """, formatedDate, value, base, target, conversion);



        FileWriter writer = new FileWriter("history.txt", true);
        writer.write(record);
        writer.close();

        return conversion;
    }
}
