package piedpiper.org.sceptre.service;

import java.util.Date;
import java.util.List;

import piedpiper.org.sceptre.api.model.Case;
import piedpiper.org.sceptre.api.model.Hearing;
import piedpiper.org.sceptre.api.model.Lawyer;
import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public interface SceptreLawyerService {
    @POST("/lawyers/cases")
    @FormUrlEncoded
    @GET("/lawyers/cases")
    List<Case> getAllCasesForLawyer(@Field("id") Integer id);
    @POST("/lawyers/nexthearing")
    @FormUrlEncoded
    void scheduleNextHearing(@Field("date") Date date, @Field("notes") String notes, @Field("status") String status, @Field("o") int associatedCase);//date/notes,status,o)
}
