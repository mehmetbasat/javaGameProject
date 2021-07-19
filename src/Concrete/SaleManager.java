package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;
import Entities.Sale;

import java.time.LocalDate;


public class SaleManager implements SaleService  {


    @Override
    public void sell(Member member, Game game) {
        System.out.println("Ürün başarıyla satın alındı");
        System.out.println("Ürünün adı ve fiyatı :  : " +game.getGameName() + ", " + game.getGamePrice());
        System.out.println("Satın alma tarihi : " + LocalDate.now());

    }

    @Override
    public void sell(Member member, Campaign campaign, Game game) {

        System.out.println("Ürün " + campaign.getCampaignName() + " kampanyası ile indirimli alındı");
        System.out.println("Ürünün adı ve indirimli fiyatı : " + game.getGameName() + "  " + game.getGamePrice()*((100-campaign.getDiscountRate())/100.0));
        System.out.println("Satın alma tarihi : " + LocalDate.now());

    }
}
