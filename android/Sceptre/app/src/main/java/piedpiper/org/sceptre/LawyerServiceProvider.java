package piedpiper.org.sceptre;

import java.util.List;

import piedpiper.org.sceptre.api.model.Case;
import piedpiper.org.sceptre.service.CourtService;
import piedpiper.org.sceptre.service.SceptreLawyerService;
import retrofit.Callback;
import retrofit.RestAdapter;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class LawyerServiceProvider {

    public List<Case> getAllCasesForLawyer(Integer id){
        SceptreLawyerService sceptreLawyerService = getLawyerService();
        return sceptreLawyerService.getAllCasesForLawyer(id);
    }
    private SceptreLawyerService getLawyerService(){
        RestAdapter restAdapter = Config.getRestAdapter();
        SceptreLawyerService sceptreLawyerService= restAdapter.create(SceptreLawyerService.class);
        return sceptreLawyerService;
    }
}
