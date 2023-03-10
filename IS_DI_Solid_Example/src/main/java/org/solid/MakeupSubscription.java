package org.solid;

import org.solid.interfaces.AccountSubscriptions;
 /*
 * We see that MapSubscription is decoupled and
 * can now communicate through the AccountSubscriptions interface
 *
 */
public class MakeupSubscription implements AccountSubscriptions {
    @Override
    public void viewSubscriptions() {
        //subscription specifications here
    }
}
