package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Reserve;

/**
 * 予約DAO
 *
 * @author jumborin
 */
public class ReserveDao {
    /**
     * 予約を取得する
     *
     * @return 予約リスト
     */
    public List<Reserve> select() {
	// TODO
	List<Reserve> list = new ArrayList<Reserve>();
	return list;
    }

    /**
     * 予約を登録する
     *
     * @return 登録結果(true:成功、false:失敗)
     */
    public boolean insert(final Reserve reserve) {
	// TODO
	return true;
    }

    /**
     * 予約を更新する
     *
     * @return 更新結果(true:成功、false:失敗)
     */
    public boolean update(final Reserve reserve) {
	// TODO
	return true;
    }

    /**
     * 予約を削除する
     *
     * @return 削除結果(true:成功、false:失敗)
     */
    public boolean delete(final Reserve reserve) {
	// TODO
	return true;
    }
}
