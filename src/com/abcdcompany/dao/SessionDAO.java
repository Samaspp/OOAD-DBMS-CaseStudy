package com.abcdcompany.dao;

import com.abcdcompany.entity.SessionInfo;
import java.sql.Connection;
import java.util.List;

public interface SessionDAO {
    List<SessionInfo> getSessionsByPhase(Connection connection, int phaseId);
}
