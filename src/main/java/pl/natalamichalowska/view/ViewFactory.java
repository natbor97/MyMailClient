package pl.natalamichalowska.view;

import pl.natalamichalowska.EmailManager;

public class ViewFactory {
    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }
    public void showLoginWindow(){
        System.out.println("show login window called");
    }
}
