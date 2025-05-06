package app;

import facade.SocialMediaFacade;
import platform.Facebook;
import platform.LinkedIn;
import platform.Twitter;

public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
