package piedpiper.org.sceptre;

import java.util.List;

import piedpiper.org.sceptre.api.model.Case;
import piedpiper.org.sceptre.api.model.Lawyer;
import piedpiper.org.sceptre.service.CourtService;
import retrofit.RestAdapter;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class CourtServiceProvider {

    public List<Lawyer> getAllLawyersOfCourt(){
       CourtService courtService = getCourtService();
        return courtService.getAllLawyersOfCourt();
    }
    public List<Case> getAllCasesOfCourt(){
        CourtService courtService = getCourtService();
        return courtService.getAllCasesOfCourt();
    }
    private CourtService getCourtService(){
        RestAdapter restAdapter = Config.getRestAdapter();
        CourtService courtService = restAdapter.create(CourtService.class);
        return courtService;
    }
}
