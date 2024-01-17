package reflection;

import reflection.infra.FooService;
import reflection.model.Foo;

public class FooAppl {
    public static void main(String[] args) {

        if(args.length !=2){
            System.out.println("Wrong numbers of arguments");
            return;
        }
        Foo foo = new Foo();

        FooService fooService = new FooService(foo);
        fooService.caller(args[0], args[1]);
    }
}
