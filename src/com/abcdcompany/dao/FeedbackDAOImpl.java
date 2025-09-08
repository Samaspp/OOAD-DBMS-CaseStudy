package com.abcdcompany.dao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FeedbackDAOImpl implements FeedbackDAO {

    /**
     * name :displayFeedbackForSession("display all feedback for a session")
     * @param connection, sessionId
     */
    @Override
    public void displayFeedbackForSession(Connection connection, int sessionId) {
        try (PreparedStatement ps = connection.prepareStatement("select sessions.id, fq.id AS question_id, fq.question_text, fq.answer_type, fa.numeric_score, fa.answer_text, CONCAT(employees.first_name, ' ', IFNULL(employees.last_name, '')) AS employee_name from feedback_questions fq join sessions on fq.session_id = sessions.id join enrollments on enrollments.session_id = sessions.id join feedback_answers fa on fa.enrollment_id = enrollments.id join employees on enrollments.employee_id = employees.id where sessions.id = ? order by fq.id, employees.first_name, employees.last_name;")) {
            ps.setInt(1, sessionId);
            try (ResultSet rs = ps.executeQuery()) {
                boolean any = false;
                int lastQuestionId = -1;
                Set<String> seen = new HashSet<>();

                while (rs.next()) {
                    any = true;
                    int qId = rs.getInt("question_id");
                    String qText = rs.getString("question_text");

                    if (qId != lastQuestionId) {
                        System.out.println("\n"+ qId +": " + qText);
                        lastQuestionId = qId;
                        seen.clear();
                    }

                    String employeeName = rs.getString("employee_name");
                    String seenKey = employeeName + "|" + qId;
                    if (seen.contains(seenKey)) continue;
                    seen.add(seenKey);

                    Integer numericScore = null;
                    int num = rs.getInt("numeric_score");
                    if (!rs.wasNull()) numericScore = num;
                    String answerText = rs.getString("answer_text");

                    String answerToShow =
                        (numericScore != null) ? String.valueOf(numericScore) :
                        (answerText != null ? answerText : "(no answer)");

                    System.out.println("  - " + employeeName + ": " + answerToShow);
                }

                if (!any) {
                    System.out.println("No feedback found for this session.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
