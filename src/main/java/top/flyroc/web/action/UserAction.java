package top.flyroc.web.action;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import top.flyroc.domain.User;
import top.flyroc.service.IUserService;
import top.flyroc.vo.PageBean;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();// 模型驱动

	public User getModel() {
		return user;
	}

	private IUserService userService;// setter注入Service

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	private Integer currentPage;// Action获取参数之----属性驱动
	private Integer pageSize;// Action获取参数之----属性驱动

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/*
	 * 用户登陆
	 */
	public String login() throws Exception {
		User u = userService.getUserByCodePassword(user);
		ActionContext.getContext().getSession().put("user", u);

		return "toHome";// 重定向到项目首页
	}

	/*
	 * 用户注册
	 */
	public String regist() throws Exception {
		try {
			// 1 调用Service保存注册用户
			userService.saveUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			// 显示错误信息
			ActionContext.getContext().put("error", e.getMessage());

			return "regist";
		}

		// 2 重定向到登陆页面
		return "toLogin";
	}

	/*
	 * 编辑用户
	 */
	public String edit() throws Exception {
		User u = userService.getUserById(user.getUser_id());
		ActionContext.getContext().put("usr", u);// 放值到request域，并转发到编辑界面

		return "edit";
	}

	/*
	 * 删除用户
	 */
	public String delete() throws Exception {
		User u = userService.getUserById(user.getUser_id());
		userService.delete(u);

		return null;
	}

	/*
	 * 用户列表
	 */
	public String list() throws Exception {
		DetachedCriteria dcriteria = DetachedCriteria.forClass(User.class);

		PageBean pageBean = userService.getPageBean(dcriteria, currentPage, pageSize);
		ActionContext.getContext().put("pageBean", pageBean);

		return "list";
	}

	/*
	 * 用户注销
	 */
	public String logout() throws Exception {
		ServletActionContext.getRequest().getSession().invalidate();

		return "toLogin";
	}

	/*
	 * 更新用户
	 */
	public String update() {
		userService.update(user);

		return "toList";
	}

}
