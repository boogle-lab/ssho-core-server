package ssho.api.core.domain.log;

import lombok.Data;
import ssho.api.core.domain.tag.model.ExpTag;
import ssho.api.core.domain.tag.model.RealTag;

import java.util.List;

/**
 * SwipeLog 도메인
 */
@Data
public class SwipeLog {
    private String userId;      // 회원 고유 번호
    private String itemId;      // 상품 고유 번호
    private int score;          // 스와이프 score
    private String swipeTime;   // 스와이프 로그 생성 시각
    private int duration;       // 해당 상품 카드에서 머문 시간(sec)
    private List<ExpTag> expTagList;
    private List<RealTag> realTagList;
    private int cardSetSeq;
    private int cardSeq;
}