package org.solid;

import org.solid.interfaces.AccountSubscriptions;
import org.solid.interfaces.YoutuberMusicService;
import org.solid.interfaces.YoutuberPremiumServices;
 /*
 * We decouple our youtuber account  features
 * using dependency injection to facilitate adding
 * the account subscriptions dependency
 * */
public class YoutuberAccountFeatures {
    private final AccountSubscriptions accountSubscriptions;


    public YoutuberAccountFeatures(YoutuberMusicService youtuberMusicService,
        YoutuberPremiumServices youtuberPremiumServices, AccountSubscriptions accountSubscriptions) {
        this.accountSubscriptions = accountSubscriptions;
    }
}
