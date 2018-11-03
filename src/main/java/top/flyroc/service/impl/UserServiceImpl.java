package top.flyroc.service.impl;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import top.flyroc.dao.IUserDao;
import top.flyroc.domain.User;
import top.flyroc.service.IUserService;
import top.flyroc.utils.MD5Utils;
import top.flyroc.vo.PageBean;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao;

	@Override
	public User getUserByCodePassword(User user) {
		User existU = userDao.getByUserCode(user.getUser_code());
		if (existU == null) {
			throw new RuntimeException("该用户不存在！");
		}
		// MD5加密校验密码
		if (!existU.getUser_password().equals(MD5Utils.md5(user.getUser_password()))) {
			throw new RuntimeException("密码错误！");
		}
		return existU;
	}

	@Override
	public void saveUser(User u) {
		// 1 调用Dao根据注册的登陆名获得用户对象
		User existU = userDao.getByUserCode(u.getUser_code());
		if (existU != null && StringUtils.isNotBlank(u.getUser_code())) {
			// 2 如果获得到user对象,用户名已经存在,抛出异常
			throw new RuntimeException("用户名已经存在!");
		}
		// 使用MD5对密码进行加密
		u.setUser_password(MD5Utils.md5(u.getUser_password()));
		// 3 调用Dao执行保存
		userDao.save(u);
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public PageBean getPageBean(DetachedCriteria dcriteria, Integer currentPage, Integer pageSize) {
		Integer totalCount = userDao.getTotalCount(dcriteria);
		PageBean pageBean = new PageBean(currentPage, totalCount, pageSize);

		List<User> list = userDao.getPageList(dcriteria, pageBean.getStartIndex(), pageBean.getPageSize());
		pageBean.setList(list);

		return pageBean;
	}

	public User getUserById(Long user_id) {
		User user = userDao.getById(user_id);
		return user;
	}

	public void delete(User u) {
		userDao.delete(u);
	}

	public void update(User user) {
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		userDao.update(user);
	}

}
