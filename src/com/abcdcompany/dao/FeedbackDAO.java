package com.abcdcompany.dao;

public interface FeedbackDAO {
    void displayFeedbackForSession(java.sql.Connection connection, int sessionId);
}
