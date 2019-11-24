/**
 *
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import entity.User;

/**
 * ユーザDAO
 *
 * @author jumborin
 */
public class UserDao implements DaoInterface<User> {
    /**
     * ユーザを取得する
     *
     * @return ユーザ情報
     */
    @Override
    public User select(final User user) {
	// TODO
	user.setUserName("田中太郎");
	return user;
    }

    /**
     * ユーザ一覧を取得する
     *
     * @return ユーザ一覧
     */
    @Override
    public List<User> getAll() {
	// TODO
	List<User> list = new ArrayList<User>();
	return list;
    }

    /**
     * ユーザを登録する
     *
     * @return 登録結果(true:成功、false:失敗)
     */
    @Override
    public boolean insert(final User user) {
	// TODO
	return true;
    }

    /**
     * ユーザを更新する
     *
     * @return 更新結果(true:成功、false:失敗)
     */
    @Override
    public boolean update(final User user) {
	// TODO
	return true;
    }

    /**
     * ユーザを削除する
     *
     * @return 削除結果(true:成功、false:失敗)
     */
    @Override
    public boolean delete(final User user) {
	// TODO
	return true;
    }
}
