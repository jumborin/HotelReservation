package entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 予約エンティティ
 *
 * @author jumborin
 *
 */
public class Reserve {
    @Getter
    @Setter
    private Date startDate = new Date();
    @Getter
    @Setter
    private Date endDate = new Date();
    @Getter
    @Setter
    private Integer number = 0;
    @Getter
    @Setter
    private String plan = "";
}