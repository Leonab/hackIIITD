package piedpiper.org.sceptre.service;

import java.util.List;


import piedpiper.org.sceptre.Config;
import piedpiper.org.sceptre.api.model.Case;
import piedpiper.org.sceptre.api.model.Lawyer;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public interface CourtService {
    @GET("/court/lawyers")
    List<Lawyer> getAllLawyersOfCourt();

    @GET("/court/cases")
    List<Case> getAllCasesOfCourt();

    @POST("/court/add")
    @FormUrlEncoded
    public void postCase(@Field("description") String description, @Field("lastStatus")String lastStatus, @Field("department_id") int departmentId,@Field("lawyer_id") int lawyerId,@Field("status") int status,Callback<String> callback);
//    public void postCase(@Body Case newCase,Callback<String> callback);


}
