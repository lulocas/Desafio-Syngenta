package Data;

import Model.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    public static List<PestOccurrence> readPestOccurrences(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), new TypeReference<List<PestOccurrence>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Pest> readPest(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), new TypeReference<List<Pest>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Product> readProduct(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), new TypeReference<List<Product>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<ProductThreshold> readProductThreshold(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), new TypeReference<List<ProductThreshold>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Region> readRegion(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), new TypeReference<List<Region>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
