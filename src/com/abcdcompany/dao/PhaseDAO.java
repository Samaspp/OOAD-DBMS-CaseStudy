package com.abcdcompany.dao;

import com.abcdcompany.entity.Phase;
import java.sql.Connection;
import java.util.List;

public interface PhaseDAO {
    List<Phase> getAllPhases(Connection connection);
}
