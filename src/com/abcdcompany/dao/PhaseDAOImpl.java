package com.abcdcompany.dao;

import com.abcdcompany.entity.Phase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhaseDAOImpl implements PhaseDAO {

	/**
	 * name :getAllPhases("create phase and add to phase list")
	 * @param connection
	 * @return phaseList
	 */
    @Override
    public List<Phase> getAllPhases(Connection connection) {
        List<Phase> phaseList = new ArrayList<Phase>();
        try (PreparedStatement ps = connection.prepareStatement("SELECT id, phase_name FROM program_phases ORDER BY phase_name");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                phaseList.add(new Phase(rs.getInt("id"), rs.getString("phase_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phaseList;
    }
}
