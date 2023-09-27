public enum Command {
    Ю("шаг на юг"){
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.С;
        }
    },
    В("шаг на восток") {
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.З;
        }
    },
    С("шаг на север"){
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.Ю;
        }
    },


    З("шаг на запад"){
        @Override
        public boolean isOpposite(Command command) {
            return command==Command.В;
        }



    };

    Command(String pathDysplayString) {
        this.pathDysplayString = pathDysplayString;
    }


    public String getPathDysplayString() {
        return pathDysplayString;
    }

    public abstract boolean isOpposite(Command command);
    private String pathDysplayString;

    public void print(){
        System.out.println("qwerty" + name());
    }


}
