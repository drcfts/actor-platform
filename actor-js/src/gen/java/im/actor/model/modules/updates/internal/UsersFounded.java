package im.actor.model.modules.updates.internal;

import java.util.List;

import im.actor.model.api.User;
import im.actor.model.concurrency.CommandCallback;
import im.actor.model.viewmodel.UserVM;

/**
 * Created by ex3ndr on 26.02.15.
 */
public class UsersFounded extends InternalUpdate {
    private List<User> users;
    private CommandCallback<UserVM[]> commandCallback;

    public UsersFounded(List<User> users, CommandCallback<UserVM[]> commandCallback) {
        this.users = users;
        this.commandCallback = commandCallback;
    }

    public List<User> getUsers() {
        return users;
    }

    public CommandCallback<UserVM[]> getCommandCallback() {
        return commandCallback;
    }
}
