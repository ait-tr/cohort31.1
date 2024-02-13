import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Robot {
    List<Command> commands;

    public Robot(String comandsString) {
        this.commands = createComandsList(comandsString);
    }

    private List<Command> createComandsList(String comandsString) {
        Deque<Command> queue = new LinkedList<>();

        for (String commandName: comandsString.split("")){
            try {
                Command command = Command.valueOf(commandName);
                if (!queue.isEmpty() && queue.peekLast().isOpposite(command)){
                    queue.removeLast();
                } else {
                    queue.add(command);
                }
            } catch (IllegalArgumentException e){}

        }

         return (List)queue;
    }

    public void printCommands(){
        int counter=0;
        for (Command command: commands){
            System.out.println(++counter+ " " + command.getPathDysplayString());
        }
    }

}
