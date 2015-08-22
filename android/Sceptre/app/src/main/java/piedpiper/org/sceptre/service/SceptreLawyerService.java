package piedpiper.org.sceptre.service;

import java.util.List;

import piedpiper.org.sceptre.api.model.Case;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public interface SceptreLawyerService {
    List<Case> getAllCasesForLawyer();
}
