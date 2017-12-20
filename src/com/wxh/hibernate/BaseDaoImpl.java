package com.wxh.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDaoImpl implements BaseDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public <T> void save(T t) {
		getSession().save(t);
	}

	public <T> void delete(T t) {
		getSession().delete(t);
	}

	public <T> void delete(Class<T> entityClass, Integer id) {
		getSession().delete(get(entityClass, id));
	}

	public <T> void delete(Class<T> entityClass, String id) {
		getSession().delete(get(entityClass, id));
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, String id) {
		return (T) getSession().get(entityClass, id);
	}

	public <T> void update(T t) {
		getSession().update(t);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, Integer id) {
		return (T) getSession().get(entityClass, id);
	}

	public <T> List<T> findAll(String hql, Class<T> entityClass) {
		return findAll(hql, entityClass, new Object[] {});
	}

	public <T> List<T> findAll(String hql, Class<T> entityClass, Object param) {
		return findAll(hql, entityClass, new Object[] { param });
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(String hql, Class<T> entityClass, Object[] params) {
		Query query = getSession().createQuery(hql);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return (List<T>) query.list();
	}

	public <T> List<T> findByPage(final String hql, Class<T> entityClass,
			final int firstResult, final int maxResult) {
		return findByPage(hql, entityClass, new Object[] {}, firstResult,
				maxResult);
	}

	public <T> List<T> findByPage(final String hql, Class<T> entityClass,
			final Object param, final int firstResult, final int maxResult) {
		return findByPage(hql, entityClass, new Object[] { param },
				firstResult, maxResult);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findByPage(final String hql, Class<T> entityClass,
			final Object[] params, final int firstResult, final int maxResult) {
		Query query = getSession().createQuery(hql);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResult);
		return (List<T>) query.list();
	}
}
