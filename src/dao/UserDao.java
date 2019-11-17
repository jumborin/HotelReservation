/**
 *
 */
package dao;

import entity.User;

/**
 * ユーザDAO
 *
 * @author jumborin
 *
 */
public class UserDao {
    /**
     * ユーザを取得する
     *
     * @return
     */
    public User select(User user) {
	user.setUserName("田中太郎");
	return user;
    }

    /**
     * ユーザを登録する
     *
     * @return
     */
    public boolean insert() {
	return true;
    }

    /**
     * ユーザを更新する
     *
     * @return
     */
    public boolean update() {
	return true;
    }

    /**
     * ユーザを削除する
     *
     * @return
     */
    public boolean delete() {
	return true;
    }
}
