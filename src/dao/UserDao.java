/**
 *
 */
package dao;

import entity.User;

/**
 * ユーザDAO
 *
 * @author jumborin
 */
public class UserDao {
    /**
     * ユーザを取得する
     *
     * @return ユーザ情報
     */
    public User select(User user) {
	// TODO
	user.setUserName("田中太郎");
	return user;
    }

    /**
     * ユーザを登録する
     *
     * @return 登録結果(true:成功、false:失敗)
     */
    public boolean insert() {
	// TODO
	return true;
    }

    /**
     * ユーザを更新する
     *
     * @return 更新結果(true:成功、false:失敗)
     */
    public boolean update() {
	// TODO
	return true;
    }

    /**
     * ユーザを削除する
     *
     * @return 削除結果(true:成功、false:失敗)
     */
    public boolean delete() {
	// TODO
	return true;
    }
}
