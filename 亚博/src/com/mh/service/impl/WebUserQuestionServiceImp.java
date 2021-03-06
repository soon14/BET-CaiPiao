package com.mh.service.impl;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mh.dao.WebUserQuestionDao;
import com.mh.entity.WebUserQuestion;
import com.mh.service.WebUserQuestionService;


@Service
public class WebUserQuestionServiceImp implements WebUserQuestionService {
	
	@Autowired
	private WebUserQuestionDao webUserQuestionDao;
	
	@Override
	public int setQuestion(String userName , List<String> fieldList , Map<String , String> map ,String dateTime){
		return this.webUserQuestionDao.setQuestion(userName , fieldList, map ,dateTime);
	}
	
	@Override
	public List<WebUserQuestion> findUserName(String userName){
		return this.webUserQuestionDao.findUserName(userName);
		
	}
	
	@Override
	public List<WebUserQuestion> findWebUserQuestion( List<String> list){
		return this.webUserQuestionDao.findWebUserQuestion(list);
	}
	
	@Override
	public int updateQuestion(List<Object[]> batchArgs){
		return this.webUserQuestionDao.updateQuestion(batchArgs);
	}

}
