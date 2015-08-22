package piedpiper.org.sceptre.service;

import java.util.List;

import piedpiper.org.sceptre.Config;
import piedpiper.org.sceptre.api.model.Case;
import piedpiper.org.sceptre.api.model.Lawyer;
import retrofit.http.GET;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public interface CourtService {
    @GET("/court/lawyers")
    List<Lawyer> getAllLawyersOfCourt();

    @GET("/court/cases")
    List<Case> getAllCasesOfCourt();

}
