package com.app.service;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUsersDao;
import com.app.pojos.Users;
@Service
@Transactional
public class UsersServiceImpl implements IUsersService {

	@Autowired
	private IUsersDao dao;
	@Override
	public Users isValid(String email) {
		
		
		List<Users> ulist = dao.findAll();
		Iterator<Users> l1 =ulist.iterator();
		while(l1.hasNext())
		{
			
			Users user1 = l1.next();
			System.out.println(user1.toString());
			if(user1.getEmail().equals(email))
			{
				return user1;
			}
		}
			return null;
	}
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		
	
		return dao.findAll();
	}
	@Override
	public String AddUserDetails(Users u) {
		dao.save(u);
		
		return "Added Successfully";
	}

	

	
}
