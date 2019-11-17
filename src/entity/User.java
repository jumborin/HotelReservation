package entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * ユーザエンティティ
 *
 * @author jumborin
 *
 */
public class User {
    @Getter
    @Setter
    private String userId = "";
    @Getter
    @Setter
    private String password = "";
    @Getter
    @Setter
    private String userName = "";
    @Getter
    @Setter
    private Date lastLoginDate = new Date();
}
