package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatConverter {

    /**
     * Converts a date string from one format to another.
     *
     * @param dateStr        the date string to be converted
     * @param currentFormat  the current format of the date string
     * @param targetFormat   the desired format of the output date string
     * @return the converted date string, or a descriptive error message if conversion fails
     */
    public static String convertDateFormat(String dateStr, String currentFormat, String targetFormat) {
        try {
            SimpleDateFormat currentFormatter = new SimpleDateFormat(currentFormat);
            Date date = currentFormatter.parse(dateStr);

            SimpleDateFormat targetFormatter = new SimpleDateFormat(targetFormat);
            return targetFormatter.format(date);
        } catch (ParseException e) {
            return "Error: Invalid date or format provided.";
        }
    }
}