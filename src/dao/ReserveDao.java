package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.Reserve;

/**
 * 予約DAO
 *
 * @author jumborin
 */
public class ReserveDao implements DaoInterface<Reserve> {
    /**
     * 予約を取得する
     *
     * @return 予約
     */
    @Override
    public Reserve select(Reserve reserve) {
	// TODO
	return reserve;
    }

    /**
     * 予約リストを取得する
     *
     * @return 予約リスト
     */
    @Override
    public List<Reserve> getAll() {
	// TODO
	List<Reserve> list = new ArrayList<Reserve>();
	return list;
    }

    /**
     * 予約を登録する
     *
     * @return 登録結果(true:成功、false:失敗)
     */
    @Override
    public boolean insert(final Reserve reserve) {
	// TODO
	return true;
    }

    /**
     * 予約を更新する
     *
     * @return 更新結果(true:成功、false:失敗)
     */
    @Override
    public boolean update(final Reserve reserve) {
	// TODO
	return true;
    }

    /**
     * 予約を削除する
     *
     * @return 削除結果(true:成功、false:失敗)
     */
    @Override
    public boolean delete(final Reserve reserve) {
	// TODO
	return true;
    }
}
