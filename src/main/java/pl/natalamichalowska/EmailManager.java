package pl.natalamichalowska;

import javafx.scene.control.TreeItem;
import pl.natalamichalowska.controller.services.FetchFoldersService;
import pl.natalamichalowska.model.EmailAccount;
import pl.natalamichalowska.model.EmailTreeItem;

public class EmailManager {

    //Folders handling:
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<String>("");

    public EmailTreeItem<String> getFoldersRoot(){
        return foldersRoot;
    }
    public void addEmailAccount(EmailAccount emailAccount){
        EmailTreeItem<String> treeItem = new EmailTreeItem<String>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), treeItem);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(treeItem);
    }
}
