import Data.JsonReader;
import Model.Pest;
import Model.PestOccurrence;
import Model.Product;
import Model.Region;
import Service.PestAnalysisService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<PestOccurrence> pestOccurrences = JsonReader.readPestOccurrences("C:\\Users\\desch\\OneDrive\\Documentos\\Desafio Syngenta\\luisa-deschamps-internship-spray-challenge\\dataset\\pest_occurrences.json");
            List<Pest> pests = JsonReader.readPest("C:\\Users\\desch\\OneDrive\\Documentos\\Desafio Syngenta\\luisa-deschamps-internship-spray-challenge\\dataset\\pests.json");
            List<Product> products = JsonReader.readProduct("C:\\Users\\desch\\OneDrive\\Documentos\\Desafio Syngenta\\luisa-deschamps-internship-spray-challenge\\dataset\\products.json");
            List<Region> regions = JsonReader.readRegion("C:\\Users\\desch\\OneDrive\\Documentos\\Desafio Syngenta\\luisa-deschamps-internship-spray-challenge\\dataset\\regions.json");

            PestAnalysisService.analyzePestOccurrences(pestOccurrences, products, regions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}