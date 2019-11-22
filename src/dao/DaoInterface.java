package dao;

import java.util.List;
import java.util.Optional;

/**
 * DAOのインターフェース
 *
 * @author jumborin
 */
public interface DaoInterface<T> {

    List<T> getAll();

    T select(T t);

    boolean insert(final T t);

    boolean update(T t);

    boolean delete(T t);
}
