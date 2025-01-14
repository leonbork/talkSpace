package utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DateFormatConverterTest {

    @Test
    public void testValidConversion() {
        String result = DateFormatConverter.convertDateFormat("2025-01-14", "yyyy-MM-dd", "MM/dd/yyyy");
        Assert.assertEquals(result, "01/14/2025");
    }

    @Test
    public void testValidConversionWithDifferentFormats() {
        String result = DateFormatConverter.convertDateFormat("14-01-2025", "dd-MM-yyyy", "MMMM dd, yyyy");
        Assert.assertEquals(result, "January 14, 2025");
    }

    @Test
    public void testInvalidDateInput() {
        String result = DateFormatConverter.convertDateFormat("invalid-date", "yyyy-MM-dd", "MM/dd/yyyy");
        Assert.assertEquals(result, "Error: Invalid date or format provided.");
    }

    @Test
    public void testInvalidFormat() {
        String result = DateFormatConverter.convertDateFormat("2025-01-14", "invalid-format", "MM/dd/yyyy");
        Assert.assertEquals(result, "Error: Invalid date or format provided.");
    }

    @Test
    public void testEmptyInput() {
        String result = DateFormatConverter.convertDateFormat("", "yyyy-MM-dd", "MM/dd/yyyy");
        Assert.assertEquals(result, "Error: Invalid date or format provided.");
    }

    @Test
    public void testNullInput() {
        String result = DateFormatConverter.convertDateFormat(null, "yyyy-MM-dd", "MM/dd/yyyy");
        Assert.assertEquals(result, "Error: Invalid date or format provided.");
    }
}