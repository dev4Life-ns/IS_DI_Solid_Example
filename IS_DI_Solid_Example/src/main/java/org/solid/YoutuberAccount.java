package org.solid;

import org.solid.interfaces.YoutuberAddAccount;
import org.solid.interfaces.YoutuberChannel;
import org.solid.interfaces.YoutuberPremiumServices;

/**/
public class YoutuberAccount implements YoutuberChannel, YoutuberPremiumServices, YoutuberAddAccount {
    @Override
    public void createChannel() {
        // add account content here
    }

    @Override
    public void viewResultsStudio() {
        // view new content results before publishing
    }

    @Override
    public void premiumServices() {
        // add premium services here
    }

    @Override
    public void addAccount() {
        // add additional accounts here
    }

}
