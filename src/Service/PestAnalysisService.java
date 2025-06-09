package Service;

import Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PestAnalysisService {
    public static void analyzePestOccurrences(List<PestOccurrence> pestOccurrences, List<Product> products, List<Region> regions) {
        Map<String, Integer> pestCountByRegion = new HashMap<>();


        for (PestOccurrence occurrence : pestOccurrences) {
            pestCountByRegion.put(String.valueOf(occurrence.getRegionId()), pestCountByRegion.getOrDefault(occurrence.getRegionId(), 0) + 1);
        }


        for (Region region : regions) {
            int pestCount = pestCountByRegion.getOrDefault(region.getId(), 0);
            List<String> recommendedProducts = new ArrayList<>();

            for (Product product : products) {
                for (ProductThreshold threshold : product.getThresholds()) {
                    if (pestCount >= threshold.getMinimumOccurrences()) {
                        double dosage = threshold.getDosePerHectare() * region.getSize();
                        double cost = dosage * product.getCostPerDose();
                        recommendedProducts.add("Region: " + region.getName() + " - Product: " + product.getName() + " - Cost: " + cost + " - Dosage: " + dosage);
                        break;
                    }
                }
            }


            recommendedProducts.forEach(System.out::println);
        }
    }
}
