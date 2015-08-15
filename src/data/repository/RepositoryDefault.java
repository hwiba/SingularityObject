package data.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Data;

public class RepositoryDefault<T> implements Repository<T> {

	private List<Object> db = Data.db;

	@Override
	public T save(T object) {
		// XXX findOne 구현 후 수정하기.
		Optional<Object> collect = db.stream()
				.filter(r -> r.toString() == object.toString() && r.getClass() == object.getClass()).findFirst();
		if (null != collect && Optional.empty() != collect) {
			db.removeIf(r -> object.equals(r));
		}
		db.add(object);
		return object;
	}

	@Override
	public T findOne(Long id) {
		return null;
		// (T) db.stream().filter(r -> r.getId() ==
		// id).findFirst().get();
		// XXX 구현 우선
	}

	@Override
	public List<T> findAll(@SuppressWarnings("rawtypes") Class type) {
		return (List<T>) db.stream().filter(r -> r.getClass() == type).collect(Collectors.toList());
	}

	@Override
	public void delete(T object) {
		db.removeIf( r -> (object.equals(r)) );
	}
	
	public int count() {
		return this.db.size();
	}
	

}
