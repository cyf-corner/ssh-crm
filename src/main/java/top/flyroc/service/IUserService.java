package top.flyroc.service;

import org.hibernate.criterion.DetachedCriteria;

import top.flyroc.domain.User;
import top.flyroc.vo.PageBean;

public interface IUserService {

	/*
	 * 用户登陆
	 */
	User getUserByCodePassword(User user);

	/*
	 * 用户注册
	 */
	void saveUser(User u);

	PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);

	User getUserById(Long user_id);

	void delete(User u);

	void update(User user);

}
