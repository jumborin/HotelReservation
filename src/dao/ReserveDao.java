package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Reserve;

/**
 * 予約DAO
 *
 * @author jumborin
 *
 */
public class ReserveDao {
    /**
     * 予約を取得する
     *
     * @return
     */
    public List<Reserve> select() {
	List<Reserve> list = new ArrayList<Reserve>();
	return list;
    }

    /**
     * 予約を登録する
     *
     * @return
     */
    public boolean insert() {
	return true;
    }

    /**
     * 予約を更新する
     *
     * @return
     */
    public boolean update() {
	return true;
    }

    /**
     * 予約を削除する
     *
     * @return
     */
    public boolean delete() {
	return true;
    }
}
