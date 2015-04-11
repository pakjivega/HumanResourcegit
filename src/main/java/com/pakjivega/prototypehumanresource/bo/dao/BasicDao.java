package com.pakjivega.prototypehumanresource.bo.dao;

import java.util.List;

public interface BasicDao<T> {
	
	public T get(Class<T> typeBean, int id) ;
	public List<T> getAll(Class<T> typeBean) ;
	public T save(T bean);
	public void delete(Class<T> typeBean,int id);
}
