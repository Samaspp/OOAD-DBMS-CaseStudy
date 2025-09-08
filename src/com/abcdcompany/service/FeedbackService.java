package com.abcdcompany.service;

import com.abcdcompany.entity.Phase;
import com.abcdcompany.entity.SessionInfo;

import java.util.List;

public interface FeedbackService {
    List<Phase> getAllPhases();
    List<SessionInfo> getSessionsByPhase(int phaseId);
    void displayFeedbackForSession(int sessionId);
    void close();
}
