package com.wxh.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ActionBase extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	protected String loginUser;

	protected HttpServletRequest request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;

	public ActionBase() {
		ActionContext ctx = ActionContext.getContext();
		session = ctx.getSession();
		request = (HttpServletRequest) ctx.get(StrutsStatics.HTTP_REQUEST);
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getApplication() {
		return application;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
}
