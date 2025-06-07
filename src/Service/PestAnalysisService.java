package Service;

import Model.Pest;
import Model.PestOccurrence;
import Model.Region;

import java.util.ArrayList;
import java.util.List;

public class PestAnalysisService {
    private List<PestOccurrence> occurrences;
    private List<Region> regions;
    private List<Pest> pests;

    public void analysisOccurrence(){
        String name;
        for(int i = 0; i < occurrences.size(); i++){
            PestOccurrence occurrence = occurrences.get(i);
            for(int j = 0; j < regions.size(); j++){
                Region region = regions.get(j);
                if(occurrence.getRegionId().equals(region.getId())){
                    name = region.getName();
                    analysisRegion(occurrence, name);
                }
            }
        }

    }

    public void analysisRegion(PestOccurrence occurrence, String name){
        List<PestOccurrence> occurrencesRegion1 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion2 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion11 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion12 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion13= new ArrayList<>();
        List<PestOccurrence> occurrencesRegion14 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion21 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion22 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion23 = new ArrayList<>();
        List<PestOccurrence> occurrencesRegion24 = new ArrayList<>();
        if("Region 1".equals(name)){
            occurrencesRegion1.add(occurrence);
        }else if("Region 2".equals(name)){
            occurrencesRegion2.add(occurrence);
        }else if("Region 1/1".equals(name)){
            occurrencesRegion11.add(occurrence);
        }else if("Region 1/2".equals(name)){
            occurrencesRegion12.add(occurrence);
        }else if("Region 1/3".equals(name)){
            occurrencesRegion13.add(occurrence);
        }else if("Region 1/4".equals(name)){
            occurrencesRegion14.add(occurrence);
        }else if("Region 2/1".equals(name)){
            occurrencesRegion21.add(occurrence);
        }else if("Region 2/2".equals(name)){
            occurrencesRegion22.add(occurrence);
        }else if("Region 2/3".equals(name)){
            occurrencesRegion23.add(occurrence);
        }else if("Region 2/4".equals(name)){
            occurrencesRegion24.add(occurrence);
        }
    }

    public void analysisPest(){

    }
}
