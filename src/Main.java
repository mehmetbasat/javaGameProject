import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;
import Entities.Sale;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {



        //member
        Member member = new Member(1,"basat","Mehmet","Basat","63409425676",2002,"basat@gmail.com");
        //campaign
        Campaign campaign1 = new Campaign(1,"Black Friday",35);
        Campaign campaign2 = new Campaign(2,"Winter Sale",45);

        //game
        Game game = new Game(1,"Mafia 2",70);

        //üye kaydı

        MemberManager memberManager = new MemberManager(new MernisServiceAdapter());
        memberManager.signUp(member);
        //memberManager.deleteMember(member);


        //CampaignManager campaignManager = new CampaignManager();
        //campaignManager.addCampaign(campaign1);


       /* oyun bilgileri
        GameManager gameManager = new GameManager();
        gameManager.getGameInformation(game);*/

        SaleManager saleManager = new SaleManager();
        //saleManager.sell(member, game);
        saleManager.sell(member,campaign1,game);





    }
}
