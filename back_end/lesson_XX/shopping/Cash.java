package shopping;

import notes_reader.Notes;

public class Cash implements Money {

    @Override
    public String payMoney() {
        return "Cash from the pocket";
    }
}
