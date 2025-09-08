package com.abcdcompany.entity;

public class SessionTrainer {
    private int id;
    private SessionInfo session;
    private Trainer trainer;
    
    public SessionTrainer() {
		super();
	}
	public SessionTrainer(int id, SessionInfo session, Trainer trainer) {
		super();
		this.id = id;
		this.session = session;
		this.trainer = trainer;
	}
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SessionInfo getSession() {
		return session;
	}
	public void setSession(SessionInfo session) {
		this.session = session;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}
