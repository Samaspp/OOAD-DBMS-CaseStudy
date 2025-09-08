package com.abcdcompany.dao;

import com.abcdcompany.entity.SessionInfo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SessionDAOImpl implements SessionDAO {

	/**
	 * name : getSessionsByPhase("create session from phase id and add to session list")
	 * @param connection
	 * @return phaseList
	 */
    @Override
    public List<SessionInfo> getSessionsByPhase(Connection connection, int phaseId) {
        List<SessionInfo> sessionList = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement("SELECT id, session_title FROM sessions WHERE phase_id = ? ORDER BY scheduled_start")) {
            ps.setInt(1, phaseId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    sessionList.add(new SessionInfo(
                        rs.getInt("id"),
                        rs.getString("session_title")
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sessionList;
    }
}
