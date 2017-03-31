package cm.service.facade;

import java.util.HashMap;
import java.util.List;

import cm.domain.Requirement;
import cm.domain.User;

public interface UserService {
	
	User selectUser(String userId);
	
	List<User> selectUserAll();
	
	Boolean testId(String userId);
	
	Boolean registUser(User user);
	
	Boolean updateUser(User user);
	
	Boolean removeUser(String userId);
	
	Requirement selectRequirement(User user);
	
	Requirement selectSumOfCreditByUser(User user);

}
