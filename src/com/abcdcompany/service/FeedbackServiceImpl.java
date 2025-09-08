package com.abcdcompany.service;

import com.abcdcompany.dao.*;
import com.abcdcompany.dbconnection.DBConnection;
import com.abcdcompany.entity.Phase;
import com.abcdcompany.entity.SessionInfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class FeedbackServiceImpl implements FeedbackService {

    private Connection connection;
    private PhaseDAO phaseDAO;
    private SessionDAO sessionDAO;
    private FeedbackDAO feedbackDAO;

    public FeedbackServiceImpl() {
        this.connection = DBConnection.getConnection();
        this.phaseDAO = new PhaseDAOImpl();
        this.sessionDAO = new SessionDAOImpl();
        this.feedbackDAO = new FeedbackDAOImpl();
    }

    @Override
    public List<Phase> getAllPhases() {
        return phaseDAO.getAllPhases(connection);
    }

    @Override
    public List<SessionInfo> getSessionsByPhase(int phaseId) {
        return sessionDAO.getSessionsByPhase(connection, phaseId);
    }

    @Override
    public void displayFeedbackForSession(int sessionId) {
        feedbackDAO.displayFeedbackForSession(connection, sessionId);
    }

    @Override
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
