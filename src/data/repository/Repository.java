package data.repository;

import java.util.List;

public interface Repository<T> {
	
	T save(final T object);
	
	T findOne(final Long id);
	
	List<T> findAll(@SuppressWarnings("rawtypes") Class type);
	
	void delete(T object);
	
}
