package ca.mcgill.ecse321.tutoringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ca.mcgill.ecse321.tutoringapp.Database.src.Session;
import ca.mcgill.ecse321.tutoringapp.dao.SessionRepository;

@Service
public class SessionService {
	
	@Autowired
	SessionRepository sessionRepository;
	
	@Transactional
	public Session createSession(String date, String startTime, String endTime) {
		Session session = new Session();
		session.setDate(date);
		session.setStartTime(startTime);
		session.setEndTime(endTime);
		sessionRepository.save(session);
		return session;
	}
	
	@Transactional
	public Session getSession(Integer ID) {
		Session session = sessionRepository.findSessionByID(ID);
		return session;
	}
	

}