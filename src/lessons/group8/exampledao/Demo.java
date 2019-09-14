package lessons.group8.exampledao;

import lessons.group8.exampledao.dao.UserDao;
import lessons.group8.exampledao.dao.impl.DefaultUserDao;

public class Demo {
	
	public static void main(String[] args) {
		
		UserDao userDao = new DefaultUserDao();
		userDao.getUserById();
	}

}
