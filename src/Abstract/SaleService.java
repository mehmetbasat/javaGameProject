package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface SaleService {
    void sell(Member member, Game game);
    void sell(Member member, Campaign campaign, Game game);

}
