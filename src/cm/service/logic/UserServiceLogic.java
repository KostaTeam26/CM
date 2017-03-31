package cm.service.logic;

import java.util.HashMap;
import java.util.List;

import cm.domain.Requirement;
import cm.domain.User;
import cm.service.facade.UserService;
import cm.store.facade.UserStore;
import cm.store.logic.UserStoreLogic;

public class UserServiceLogic implements UserService{
	
	private UserStore store;
	
	public UserServiceLogic() {
		
		store=new UserStoreLogic();
	}

	public User selectUser(String userId) {
		return store.searchUser(userId); 
	}

	public List<User> selectUserAll() {
		return store.searchUserAll();
	}

	public Boolean testId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean registUser(User user) {
		
		return store.insertUser(user);
	}

	public Boolean updateUser(User user) {
		
		return store.modifyUser(user);
	}

	public Boolean removeUser(String userId) {
		return store.deleteUser(userId);
	}

	public Requirement selectRequirement(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Requirement selectSumOfCreditByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
