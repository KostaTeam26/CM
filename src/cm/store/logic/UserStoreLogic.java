package cm.store.logic;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cm.domain.Requirement;
import cm.domain.User;
import cm.store.facade.UserStore;
import cm.store.mapper.UserMapper;

public class UserStoreLogic implements UserStore{
	
private SqlSessionFactory factory;
	
	public UserStoreLogic() {
		factory=SqlSessionFactoryProvider.getSqlSessionFactory();
	
	}

	public User searchUser(String userId) {
		SqlSession session=factory.openSession();
		User user=null;
		
		try{
			UserMapper mapper=session.getMapper(UserMapper.class);
			user=mapper.searchUser(userId);			
			
		}finally{
			session.close();
		}		
		
		return user;
	}

	public List<User> searchUserAll() {
		SqlSession session=factory.openSession();
		List<User> list=null;
		
		try{
			UserMapper mapper=session.getMapper(UserMapper.class);
			list=mapper.searchUserAll();			
			
		}finally{
			session.close();
		}		
		
		return list;		
		
	}

	public Boolean checkId(String userId) {
		
		SqlSession session=factory.openSession();
		User user=null;
		Boolean check=true;
		
		try{
			UserMapper mapper=session.getMapper(UserMapper.class);
			user=mapper.searchUser(userId);			
			
			if(user!=null){
				check=false;
			}
			
		}finally{
			session.close();
		}		
		
		return check;
	}

	public Boolean insertUser(User user) {
		SqlSession session=factory.openSession();
		boolean check;
		
		try{
			UserMapper mapper=session.getMapper(UserMapper.class);
			check=mapper.insertUser(user);		
			session.commit();
			
		}finally{
			session.close();
		}		
		
		return check;
		
	}

	public Boolean modifyUser(User user) {
		
		SqlSession session=factory.openSession();
		boolean check;
		
		try{
			UserMapper mapper=session.getMapper(UserMapper.class);
			check=mapper.modifyUser(user);	
			session.commit();
			
		}finally{
			session.close();
		}		
		
		return check;	
		
	}

	public Boolean deleteUser(String userId) {
		
		SqlSession session=factory.openSession();
		boolean check;
		
		try{
			UserMapper mapper=session.getMapper(UserMapper.class);
			check=mapper.deleteUser(userId);	
			session.commit();
			
		}finally{
			session.close();
		}		
		
		return check;			
		
	}

	public Requirement searchRequirement(User user) {
		
		SqlSession session=factory.openSession();
		Requirement req=null;
		
		try{
			UserMapper mapper=session.getMapper(UserMapper.class);
			req=mapper.searchRequirement(user);	
			
		}finally{
			session.close();
		}		
		
		return req;	
		
	}

	public Requirement searchSumOfCreditByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	


}
