package com.itheima.crm.dao;

import com.itheima.crm.domain.User;

/**
 * 用户管理的DAO的接口
 * @author jt
 *
 */
public interface UserDao {

	void save(User user);
	User login(User user);

}
