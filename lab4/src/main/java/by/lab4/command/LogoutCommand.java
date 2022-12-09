package by.lab4.command;

import by.lab4.constant.PageConstant;

public class LogoutCommand implements Command {

    @Override
    public CommandResult execute(RequestContent requestContent) {
        return new CommandResult(CommandResult.ResponseType.FORWARD, PageConstant.INDEX_PAGE);
    }
}
